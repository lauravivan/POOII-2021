/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package albumslist;

import Conexao.DBController;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author laura
 */
public class Album {
    private String name;
    private String artistName;
    private int debutYear;
    private Duration duration;
    private int songsNumber;
    private String cover;
    private int albumId;

    public String getName() {
        return this.name;
    }

    public void setName(String name) throws Exception {
        if (name.length() > 0) {
            this.name = name;
        } else {
            throw new Exception("Você não informou o nome do álbum!");
        }
    }

    public String getArtistName() {
        return this.artistName;
    }

    public void setArtistName(String artistName) throws Exception {
        if (artistName.length() > 0) {
            this.artistName = artistName;
        } else {
            throw new Exception("Você não informou o nome da(o) artista!");
        }
    }

    public int getDebutYear() {
        return this.debutYear;
    }

    public void setDebutYear(int debutYear) throws Exception {
        Calendar currentYear = Calendar.getInstance();
        if (debutYear >= 1900 && (debutYear <= currentYear.get(Calendar.YEAR))) {
            this.debutYear = debutYear;
        } else {
            throw new Exception("Informe um valor válido para o ano!");
        }
    }

    public Duration getDuration() {
        return this.duration;
    }

    public void setDuration(Duration duration) throws Exception {
        this.duration = duration;
    }

    public int getSongsNumber() {
        return this.songsNumber;
    }

    public void setSongsNumber(int songsNumber) throws Exception {
        if (songsNumber > 0 && songsNumber <= 30) {
            this.songsNumber = songsNumber;
        } else {
            throw new Exception("Informe um valor válido para o número de faixas!");
        }
    }

    public String getCover() {
        return this.cover;
    }

    public void setCover(String cover) throws Exception {
        if (cover.length() > 0) {
            this.cover = cover;
        } else {
            throw new Exception("Você não selecionou uma imagem");
        }
    }

    public int getAlbumId() {
        return this.albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }
    
    @Override
    public String toString() {
        return this.getDuration().getMinutes() + 
                ":" + this.getDuration().getSeconds();
    }
    
    public void drawId(Map album) {
        Random drawId = new Random();
        int chosenId = drawId.nextInt(1000);
        boolean repeatedId = false;
        
        List<Album> albums;
        
        try {
            albums = Album.searchAlbums();
            if (albums.isEmpty()) {
                album.put("album_id", String.valueOf(chosenId));
            } else if (albums.size() > 0) {
                while (true) {
                    for (int i = 0; i < albums.size(); i++) {
                        if (albums.get(i).getAlbumId() == chosenId) {
                            chosenId = drawId.nextInt();
                            repeatedId = true;
                        } 
                    }

                    if (!repeatedId) {
                        album.put("album_id", String.valueOf(chosenId));
                        break;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void sendToBD(Map album) {
        album.put("nm_album", this.getName());
        album.put("nm_artista", this.getArtistName());
        album.put("ano_lancamento", String.valueOf(this.getDebutYear()));
        album.put("min_duracao", String.valueOf(this.getDuration().getMinutes()));
        album.put("seg_duracao", String.valueOf(this.getDuration().getSeconds()));
        album.put("nr_faixas", String.valueOf(this.getSongsNumber()));
        album.put("capa", this.getCover());
    }
    
    public void addAlbum() throws Exception {
        DBController db = new DBController();
        Map<String, String> album = new HashMap<>();
        sendToBD(album);
        drawId(album);

        db.conectar();
        db.insert("Album", album);
        db.desconectar();
    }

    public void editAlbum() throws Exception {
        DBController db = new DBController();
        Map<String, String> album = new HashMap<>();
        Map<String, String> where = new HashMap<>();
        
        sendToBD(album);
        where.put("album_id", String.valueOf(this.getAlbumId()));

        db.conectar();
        db.update("Album", album, where);
        db.desconectar();
    }

    public static List<Album> searchAlbums() throws Exception {
        DBController db = new DBController();
        ResultSet rset;
        List<Album> albums = new ArrayList<>();

        db.conectar();
        rset = db.executeQuery("SELECT * FROM Album");

        try {
            while (rset.next()) {
                Album album = new Album();
                Duration d = new Duration(
                        Integer.parseInt(rset.getString("min_duracao")),
                        Integer.parseInt(rset.getString("seg_duracao")));
                
                album.setName(rset.getString("nm_album"));
                album.setArtistName(rset.getString("nm_artista"));
                album.setDebutYear(Integer.parseInt(rset.getString("ano_lancamento")));
                album.setSongsNumber(Integer.parseInt(rset.getString("nr_faixas")));
                album.setCover(rset.getString("capa"));
                album.setDuration(d);
                album.setAlbumId(Integer.parseInt(rset.getString("album_id")));
                
                albums.add(album);
            }
        } catch (SQLException ex) {
            throw new Exception("Erro ao percorrer resultados!");
        }

        db.desconectar();

        return albums;
    }
    
    public void deleteAlbum() throws Exception {
        DBController db = new DBController();
        Map<String, String> where = new HashMap<>();

        where.put("album_id", String.valueOf(this.getAlbumId()));
        
        db.conectar();
        db.delete("Album", where);
        db.desconectar();
    }
}
