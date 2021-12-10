/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package albumslist;

import java.awt.Color;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author laura
 */
public class MainScreen extends javax.swing.JFrame {
    List<Album> albums;
    
    /**
     * Creates new form TelaPrincipal
     */
    public MainScreen() {
        initComponents();
        
        btnDelete1.setVisible(false);
        btnDelete2.setVisible(false);
        btnDelete3.setVisible(false);
        btnDelete4.setVisible(false);
        btnDelete5.setVisible(false);
        btnDelete6.setVisible(false);
        btnDelete7.setVisible(false);
        btnDelete8.setVisible(false);
        btnDelete9.setVisible(false);
        btnDelete10.setVisible(false);
        btnDelete11.setVisible(false);
        btnDelete12.setVisible(false);
        btnDelete13.setVisible(false);
        btnDelete14.setVisible(false);
        btnDelete15.setVisible(false);
        btnDelete16.setVisible(false);
        btnDelete17.setVisible(false);
        btnDelete18.setVisible(false);
        btnDelete19.setVisible(false);
        
        btnUpdate1.setVisible(false);
        btnUpdate2.setVisible(false);
        btnUpdate3.setVisible(false);
        btnUpdate4.setVisible(false);
        btnUpdate5.setVisible(false);
        btnUpdate6.setVisible(false);
        btnUpdate7.setVisible(false);
        btnUpdate8.setVisible(false);
        btnUpdate9.setVisible(false);
        btnUpdate10.setVisible(false);
        btnUpdate11.setVisible(false);
        btnUpdate12.setVisible(false);
        btnUpdate13.setVisible(false);
        btnUpdate14.setVisible(false);
        btnUpdate15.setVisible(false);
        btnUpdate16.setVisible(false);
        btnUpdate17.setVisible(false);
        btnUpdate18.setVisible(false);
        btnUpdate19.setVisible(false);
        
        btnDetail1.setVisible(false);
        btnDetail2.setVisible(false);
        btnDetail3.setVisible(false);
        btnDetail4.setVisible(false);
        btnDetail5.setVisible(false);
        btnDetail6.setVisible(false);
        btnDetail7.setVisible(false);
        btnDetail8.setVisible(false);
        btnDetail9.setVisible(false);
        btnDetail10.setVisible(false);
        btnDetail11.setVisible(false);
        btnDetail12.setVisible(false);
        btnDetail13.setVisible(false);
        btnDetail14.setVisible(false);
        btnDetail15.setVisible(false);
        btnDetail16.setVisible(false);
        btnDetail17.setVisible(false);
        btnDetail18.setVisible(false);
        btnDetail19.setVisible(false);
        
        btnColor1.setVisible(false);
        btnColor2.setVisible(false);
        btnColor3.setVisible(false);
        btnColor4.setVisible(false);
        btnColor5.setVisible(false);
        btnColor6.setVisible(false);
        btnColor7.setVisible(false);
        btnColor8.setVisible(false);
        btnColor9.setVisible(false);
        btnColor10.setVisible(false);
        btnColor11.setVisible(false);
        btnColor12.setVisible(false);
        btnColor13.setVisible(false);
        btnColor14.setVisible(false);
        btnColor15.setVisible(false);
        btnColor16.setVisible(false);
        btnColor17.setVisible(false);
        btnColor18.setVisible(false);
        btnColor19.setVisible(false);
        
        showAlbums();
    }
    
    private void showAlbums() {    
        try {
            albums = Album.searchAlbums();
            if (albums.isEmpty()) {
                lblAlbumName1.setText("Você ainda não adicionou nenhum álbum.");
            }
            if (albums.size() > 0) {
                showInfo(btnDelete1, btnUpdate1, 
                        btnDetail1, btnColor1, lblAlbumName1, 0);
            } 
            if (albums.size() > 1) {
                showInfo(btnDelete2, btnUpdate2, 
                        btnDetail2, btnColor2, lblAlbumName2, 1);
            }
            if (albums.size() > 2) {
                showInfo(btnDelete3, btnUpdate3, 
                        btnDetail3, btnColor3, lblAlbumName3, 2);
            }
            if (albums.size() > 3) {
                showInfo(btnDelete4, btnUpdate4, 
                        btnDetail4, btnColor4, lblAlbumName4, 3);
            }
            if (albums.size() > 4) {
                showInfo(btnDelete5, btnUpdate5, 
                        btnDetail5, btnColor5, lblAlbumName5, 4);
            }
            if (albums.size() > 5) {
                showInfo(btnDelete6, btnUpdate6, 
                        btnDetail6, btnColor6, lblAlbumName6, 5);
            }
            if (albums.size() > 6) {
                showInfo(btnDelete7, btnUpdate7, 
                        btnDetail7, btnColor7, lblAlbumName7, 6);
            }
            if (albums.size() > 7) {
                showInfo(btnDelete8, btnUpdate8, 
                        btnDetail8, btnColor8, lblAlbumName8, 7);
            }
            if (albums.size() > 8) {
                showInfo(btnDelete9, btnUpdate9, 
                        btnDetail9, btnColor9, lblAlbumName9, 8);
            }
            if (albums.size() > 9) {
                showInfo(btnDelete10, btnUpdate10, 
                        btnDetail10, btnColor10, lblAlbumName10, 9);
            }
            if (albums.size() > 10) {
                showInfo(btnDelete11, btnUpdate11, 
                        btnDetail11, btnColor11, lblAlbumName11, 10);
            }
            if (albums.size() > 11) {
                showInfo(btnDelete12, btnUpdate12, 
                        btnDetail12, btnColor12, lblAlbumName12, 11);
            }
            if (albums.size() > 12) {
                showInfo(btnDelete13, btnUpdate13, 
                        btnDetail13, btnColor13, lblAlbumName13, 12);
            }
            if (albums.size() > 13) {
                showInfo(btnDelete14, btnUpdate14, 
                        btnDetail14, btnColor14, lblAlbumName14, 13);
            }
            if (albums.size() > 14) {
                showInfo(btnDelete15, btnUpdate15, 
                        btnDetail15, btnColor15, lblAlbumName15, 14);
            }
            if (albums.size() > 15) {
                showInfo(btnDelete16, btnUpdate16, 
                        btnDetail16, btnColor16, lblAlbumName16, 15);
            }
            if (albums.size() > 16) {
                showInfo(btnDelete17, btnUpdate17, 
                        btnDetail17, btnColor17, lblAlbumName17, 16);
            }
            if (albums.size() > 17) {
                showInfo(btnDelete18, btnUpdate18, 
                        btnDetail18, btnColor18, lblAlbumName18, 17);
            }
            if (albums.size() > 18) {
                showInfo(btnDelete19, btnUpdate19, 
                        btnDetail19, btnColor19, lblAlbumName19, 18);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void showInfo(JButton btnDelete, JButton btnUpdate, 
            JButton btnDetail, JButton btnColor, JLabel albumName, int whichAlbum) {
        btnDelete.setVisible(true);
        btnUpdate.setVisible(true);
        btnDetail.setVisible(true);
        btnColor.setVisible(true);
        albumName.setText(albums.get(whichAlbum).getName().toUpperCase());
    }

    public Album albumInfo(int whichAlbum) {
        Album album = new Album();
        
        try {
            Duration duration = new Duration(
                    albums.get(whichAlbum).getDuration().getMinutes(),
                    albums.get(whichAlbum).getDuration().getSeconds());
            album.setName(albums.get(whichAlbum).getName());
            album.setArtistName(albums.get(whichAlbum).getArtistName());
            album.setSongsNumber(albums.get(whichAlbum).getSongsNumber());
            album.setDebutYear(albums.get(whichAlbum).getDebutYear());
            album.setDuration(duration);
            album.setCover(albums.get(whichAlbum).getCover());
            album.setAlbumId(albums.get(whichAlbum).getAlbumId());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return album;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ccAlbumName = new javax.swing.JColorChooser();
        jPanel1 = new javax.swing.JPanel();
        lblPageTitle = new javax.swing.JLabel();
        btnDetail1 = new javax.swing.JButton();
        btnUpdate1 = new javax.swing.JButton();
        btnDelete1 = new javax.swing.JButton();
        lblAlbumName1 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnDetail2 = new javax.swing.JButton();
        btnDetail3 = new javax.swing.JButton();
        btnDetail4 = new javax.swing.JButton();
        btnDetail5 = new javax.swing.JButton();
        btnDetail6 = new javax.swing.JButton();
        btnDetail7 = new javax.swing.JButton();
        btnDetail8 = new javax.swing.JButton();
        btnDetail9 = new javax.swing.JButton();
        btnUpdate2 = new javax.swing.JButton();
        btnUpdate3 = new javax.swing.JButton();
        btnUpdate4 = new javax.swing.JButton();
        btnUpdate5 = new javax.swing.JButton();
        btnUpdate6 = new javax.swing.JButton();
        btnUpdate7 = new javax.swing.JButton();
        btnUpdate8 = new javax.swing.JButton();
        btnUpdate9 = new javax.swing.JButton();
        btnDelete2 = new javax.swing.JButton();
        btnDelete3 = new javax.swing.JButton();
        btnDelete4 = new javax.swing.JButton();
        btnDelete5 = new javax.swing.JButton();
        btnDelete6 = new javax.swing.JButton();
        btnDelete7 = new javax.swing.JButton();
        btnDelete8 = new javax.swing.JButton();
        btnDelete9 = new javax.swing.JButton();
        btnDelete10 = new javax.swing.JButton();
        btnDelete11 = new javax.swing.JButton();
        btnUpdate10 = new javax.swing.JButton();
        btnUpdate11 = new javax.swing.JButton();
        btnDetail10 = new javax.swing.JButton();
        btnDetail11 = new javax.swing.JButton();
        btnDelete12 = new javax.swing.JButton();
        btnDelete13 = new javax.swing.JButton();
        btnDelete14 = new javax.swing.JButton();
        btnDelete15 = new javax.swing.JButton();
        btnDelete16 = new javax.swing.JButton();
        btnDelete17 = new javax.swing.JButton();
        btnDelete18 = new javax.swing.JButton();
        btnDelete19 = new javax.swing.JButton();
        btnUpdate12 = new javax.swing.JButton();
        btnUpdate13 = new javax.swing.JButton();
        btnUpdate14 = new javax.swing.JButton();
        btnUpdate15 = new javax.swing.JButton();
        btnUpdate16 = new javax.swing.JButton();
        btnUpdate17 = new javax.swing.JButton();
        btnUpdate18 = new javax.swing.JButton();
        btnUpdate19 = new javax.swing.JButton();
        btnDetail12 = new javax.swing.JButton();
        btnDetail13 = new javax.swing.JButton();
        btnDetail14 = new javax.swing.JButton();
        btnDetail15 = new javax.swing.JButton();
        btnDetail16 = new javax.swing.JButton();
        btnDetail17 = new javax.swing.JButton();
        btnDetail18 = new javax.swing.JButton();
        btnDetail19 = new javax.swing.JButton();
        lblAlbumName2 = new javax.swing.JLabel();
        lblAlbumName3 = new javax.swing.JLabel();
        lblAlbumName4 = new javax.swing.JLabel();
        lblAlbumName5 = new javax.swing.JLabel();
        lblAlbumName6 = new javax.swing.JLabel();
        lblAlbumName7 = new javax.swing.JLabel();
        lblAlbumName8 = new javax.swing.JLabel();
        lblAlbumName9 = new javax.swing.JLabel();
        lblAlbumName10 = new javax.swing.JLabel();
        lblAlbumName11 = new javax.swing.JLabel();
        lblAlbumName12 = new javax.swing.JLabel();
        lblAlbumName18 = new javax.swing.JLabel();
        btnRanking = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        btnColor1 = new javax.swing.JButton();
        btnColor2 = new javax.swing.JButton();
        btnColor3 = new javax.swing.JButton();
        btnColor4 = new javax.swing.JButton();
        btnColor5 = new javax.swing.JButton();
        btnColor6 = new javax.swing.JButton();
        btnColor7 = new javax.swing.JButton();
        btnColor8 = new javax.swing.JButton();
        btnColor9 = new javax.swing.JButton();
        btnColor10 = new javax.swing.JButton();
        btnColor11 = new javax.swing.JButton();
        btnColor12 = new javax.swing.JButton();
        btnColor13 = new javax.swing.JButton();
        btnColor14 = new javax.swing.JButton();
        btnColor15 = new javax.swing.JButton();
        btnColor16 = new javax.swing.JButton();
        btnColor17 = new javax.swing.JButton();
        btnColor18 = new javax.swing.JButton();
        btnColor19 = new javax.swing.JButton();
        lblAlbumName13 = new javax.swing.JLabel();
        lblAlbumName14 = new javax.swing.JLabel();
        lblAlbumName16 = new javax.swing.JLabel();
        lblAlbumName15 = new javax.swing.JLabel();
        lblAlbumName17 = new javax.swing.JLabel();
        lblAlbumName19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de álbuns");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPageTitle.setFont(new java.awt.Font("Noto Sans Light", 1, 24)); // NOI18N
        lblPageTitle.setText("Minha lista de álbuns preferidos");
        jPanel1.add(lblPageTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        btnDetail1.setBackground(new java.awt.Color(255, 255, 255));
        btnDetail1.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\eye-icon.png")); // NOI18N
        btnDetail1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetail1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDetail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, -1, -1));

        btnUpdate1.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdate1.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\pencil-icon.png")); // NOI18N
        btnUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, -1, -1));

        btnDelete1.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete1.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\trash-icon.png")); // NOI18N
        btnDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, -1, -1));

        lblAlbumName1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(lblAlbumName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        btnAdd.setBackground(new java.awt.Color(255, 255, 255));
        btnAdd.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\plus-icon.png")); // NOI18N
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, -1, -1));

        btnDetail2.setBackground(new java.awt.Color(255, 255, 255));
        btnDetail2.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\eye-icon.png")); // NOI18N
        btnDetail2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetail2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDetail2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, -1, -1));

        btnDetail3.setBackground(new java.awt.Color(255, 255, 255));
        btnDetail3.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\eye-icon.png")); // NOI18N
        btnDetail3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetail3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDetail3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, -1, -1));

        btnDetail4.setBackground(new java.awt.Color(255, 255, 255));
        btnDetail4.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\eye-icon.png")); // NOI18N
        btnDetail4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetail4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDetail4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, -1, -1));

        btnDetail5.setBackground(new java.awt.Color(255, 255, 255));
        btnDetail5.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\eye-icon.png")); // NOI18N
        btnDetail5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetail5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDetail5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, -1, -1));

        btnDetail6.setBackground(new java.awt.Color(255, 255, 255));
        btnDetail6.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\eye-icon.png")); // NOI18N
        btnDetail6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetail6ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDetail6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, -1, -1));

        btnDetail7.setBackground(new java.awt.Color(255, 255, 255));
        btnDetail7.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\eye-icon.png")); // NOI18N
        btnDetail7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetail7ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDetail7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, -1, -1));

        btnDetail8.setBackground(new java.awt.Color(255, 255, 255));
        btnDetail8.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\eye-icon.png")); // NOI18N
        btnDetail8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetail8ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDetail8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, -1, -1));

        btnDetail9.setBackground(new java.awt.Color(255, 255, 255));
        btnDetail9.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\eye-icon.png")); // NOI18N
        btnDetail9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetail9ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDetail9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, -1, -1));

        btnUpdate2.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdate2.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\pencil-icon.png")); // NOI18N
        btnUpdate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, -1, -1));

        btnUpdate3.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdate3.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\pencil-icon.png")); // NOI18N
        btnUpdate3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, -1, -1));

        btnUpdate4.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdate4.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\pencil-icon.png")); // NOI18N
        btnUpdate4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, -1, -1));

        btnUpdate5.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdate5.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\pencil-icon.png")); // NOI18N
        btnUpdate5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, -1, -1));

        btnUpdate6.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdate6.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\pencil-icon.png")); // NOI18N
        btnUpdate6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate6ActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, -1, -1));

        btnUpdate7.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdate7.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\pencil-icon.png")); // NOI18N
        btnUpdate7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate7ActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, -1, -1));

        btnUpdate8.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdate8.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\pencil-icon.png")); // NOI18N
        btnUpdate8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate8ActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, -1, -1));

        btnUpdate9.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdate9.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\pencil-icon.png")); // NOI18N
        btnUpdate9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate9ActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, -1, -1));

        btnDelete2.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete2.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\trash-icon.png")); // NOI18N
        btnDelete2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, -1, -1));

        btnDelete3.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete3.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\trash-icon.png")); // NOI18N
        btnDelete3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, -1, -1));

        btnDelete4.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete4.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\trash-icon.png")); // NOI18N
        btnDelete4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, -1, -1));

        btnDelete5.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete5.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\trash-icon.png")); // NOI18N
        btnDelete5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, -1, -1));

        btnDelete6.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete6.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\trash-icon.png")); // NOI18N
        btnDelete6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete6ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, -1, -1));

        btnDelete7.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete7.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\trash-icon.png")); // NOI18N
        btnDelete7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete7ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, -1, -1));

        btnDelete8.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete8.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\trash-icon.png")); // NOI18N
        btnDelete8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete8ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, -1, -1));

        btnDelete9.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete9.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\trash-icon.png")); // NOI18N
        btnDelete9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete9ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, -1, -1));

        btnDelete10.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete10.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\trash-icon.png")); // NOI18N
        btnDelete10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete10ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, -1, -1));

        btnDelete11.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete11.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\trash-icon.png")); // NOI18N
        btnDelete11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete11ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete11, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 400, -1, -1));

        btnUpdate10.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdate10.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\pencil-icon.png")); // NOI18N
        btnUpdate10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate10ActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, -1, -1));

        btnUpdate11.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdate11.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\pencil-icon.png")); // NOI18N
        btnUpdate11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate11ActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, -1, -1));

        btnDetail10.setBackground(new java.awt.Color(255, 255, 255));
        btnDetail10.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\eye-icon.png")); // NOI18N
        btnDetail10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetail10ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDetail10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, -1, -1));

        btnDetail11.setBackground(new java.awt.Color(255, 255, 255));
        btnDetail11.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\eye-icon.png")); // NOI18N
        btnDetail11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetail11ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDetail11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, -1, -1));

        btnDelete12.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete12.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\trash-icon.png")); // NOI18N
        btnDelete12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete12ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete12, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 430, -1, -1));

        btnDelete13.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete13.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\trash-icon.png")); // NOI18N
        btnDelete13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete13ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete13, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 460, -1, -1));

        btnDelete14.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete14.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\trash-icon.png")); // NOI18N
        btnDelete14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete14ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete14, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 490, -1, -1));

        btnDelete15.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete15.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\trash-icon.png")); // NOI18N
        btnDelete15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete15ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete15, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 520, -1, -1));

        btnDelete16.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete16.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\trash-icon.png")); // NOI18N
        btnDelete16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete16ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete16, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 550, -1, -1));

        btnDelete17.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete17.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\trash-icon.png")); // NOI18N
        btnDelete17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete17ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete17, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 580, -1, -1));

        btnDelete18.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete18.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\trash-icon.png")); // NOI18N
        btnDelete18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete18ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete18, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 610, -1, -1));

        btnDelete19.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete19.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\trash-icon.png")); // NOI18N
        btnDelete19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete19ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete19, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 640, -1, -1));

        btnUpdate12.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdate12.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\pencil-icon.png")); // NOI18N
        btnUpdate12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate12ActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 430, -1, -1));

        btnUpdate13.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdate13.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\pencil-icon.png")); // NOI18N
        btnUpdate13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate13ActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate13, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 460, -1, -1));

        btnUpdate14.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdate14.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\pencil-icon.png")); // NOI18N
        btnUpdate14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate14ActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate14, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 490, -1, -1));

        btnUpdate15.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdate15.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\pencil-icon.png")); // NOI18N
        btnUpdate15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate15ActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate15, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 520, -1, -1));

        btnUpdate16.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdate16.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\pencil-icon.png")); // NOI18N
        btnUpdate16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate16ActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate16, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 550, -1, -1));

        btnUpdate17.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdate17.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\pencil-icon.png")); // NOI18N
        btnUpdate17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate17ActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate17, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 580, -1, -1));

        btnUpdate18.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdate18.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\pencil-icon.png")); // NOI18N
        btnUpdate18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate18ActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate18, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 610, -1, -1));

        btnUpdate19.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdate19.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\pencil-icon.png")); // NOI18N
        btnUpdate19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate19ActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate19, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 640, -1, -1));

        btnDetail12.setBackground(new java.awt.Color(255, 255, 255));
        btnDetail12.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\eye-icon.png")); // NOI18N
        btnDetail12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetail12ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDetail12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, -1, -1));

        btnDetail13.setBackground(new java.awt.Color(255, 255, 255));
        btnDetail13.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\eye-icon.png")); // NOI18N
        btnDetail13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetail13ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDetail13, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 460, -1, -1));

        btnDetail14.setBackground(new java.awt.Color(255, 255, 255));
        btnDetail14.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\eye-icon.png")); // NOI18N
        btnDetail14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetail14ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDetail14, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 490, -1, -1));

        btnDetail15.setBackground(new java.awt.Color(255, 255, 255));
        btnDetail15.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\eye-icon.png")); // NOI18N
        btnDetail15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetail15ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDetail15, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 520, -1, -1));

        btnDetail16.setBackground(new java.awt.Color(255, 255, 255));
        btnDetail16.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\eye-icon.png")); // NOI18N
        btnDetail16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetail16ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDetail16, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 550, -1, -1));

        btnDetail17.setBackground(new java.awt.Color(255, 255, 255));
        btnDetail17.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\eye-icon.png")); // NOI18N
        btnDetail17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetail17ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDetail17, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 580, -1, -1));

        btnDetail18.setBackground(new java.awt.Color(255, 255, 255));
        btnDetail18.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\eye-icon.png")); // NOI18N
        btnDetail18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetail18ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDetail18, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 610, -1, -1));

        btnDetail19.setBackground(new java.awt.Color(255, 255, 255));
        btnDetail19.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\eye-icon.png")); // NOI18N
        btnDetail19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetail19ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDetail19, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 640, -1, -1));

        lblAlbumName2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(lblAlbumName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        lblAlbumName3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(lblAlbumName3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        lblAlbumName4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(lblAlbumName4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        lblAlbumName5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(lblAlbumName5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        lblAlbumName6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(lblAlbumName6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        lblAlbumName7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(lblAlbumName7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        lblAlbumName8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(lblAlbumName8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        lblAlbumName9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(lblAlbumName9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        lblAlbumName10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(lblAlbumName10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        lblAlbumName11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(lblAlbumName11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        lblAlbumName12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(lblAlbumName12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));

        lblAlbumName18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(lblAlbumName18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, -1, -1));

        btnRanking.setBackground(new java.awt.Color(255, 255, 255));
        btnRanking.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\trophy-icon.png")); // NOI18N
        btnRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRankingActionPerformed(evt);
            }
        });
        jPanel1.add(btnRanking, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, -1, -1));

        btnPrint.setBackground(new java.awt.Color(255, 255, 255));
        btnPrint.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\printer-icon.png")); // NOI18N
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, -1, -1));

        btnColor1.setBackground(new java.awt.Color(255, 255, 255));
        btnColor1.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\color-icon.png")); // NOI18N
        btnColor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColor1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnColor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, -1, -1));

        btnColor2.setBackground(new java.awt.Color(255, 255, 255));
        btnColor2.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\color-icon.png")); // NOI18N
        btnColor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColor2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnColor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, -1, -1));

        btnColor3.setBackground(new java.awt.Color(255, 255, 255));
        btnColor3.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\color-icon.png")); // NOI18N
        btnColor3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColor3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnColor3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, -1, -1));

        btnColor4.setBackground(new java.awt.Color(255, 255, 255));
        btnColor4.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\color-icon.png")); // NOI18N
        btnColor4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColor4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnColor4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, -1, -1));

        btnColor5.setBackground(new java.awt.Color(255, 255, 255));
        btnColor5.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\color-icon.png")); // NOI18N
        btnColor5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColor5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnColor5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, -1, -1));

        btnColor6.setBackground(new java.awt.Color(255, 255, 255));
        btnColor6.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\color-icon.png")); // NOI18N
        btnColor6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColor6ActionPerformed(evt);
            }
        });
        jPanel1.add(btnColor6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, -1, -1));

        btnColor7.setBackground(new java.awt.Color(255, 255, 255));
        btnColor7.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\color-icon.png")); // NOI18N
        btnColor7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColor7ActionPerformed(evt);
            }
        });
        jPanel1.add(btnColor7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, -1, -1));

        btnColor8.setBackground(new java.awt.Color(255, 255, 255));
        btnColor8.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\color-icon.png")); // NOI18N
        btnColor8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColor8ActionPerformed(evt);
            }
        });
        jPanel1.add(btnColor8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, -1, -1));

        btnColor9.setBackground(new java.awt.Color(255, 255, 255));
        btnColor9.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\color-icon.png")); // NOI18N
        btnColor9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColor9ActionPerformed(evt);
            }
        });
        jPanel1.add(btnColor9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, -1, -1));

        btnColor10.setBackground(new java.awt.Color(255, 255, 255));
        btnColor10.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\color-icon.png")); // NOI18N
        btnColor10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColor10ActionPerformed(evt);
            }
        });
        jPanel1.add(btnColor10, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 370, -1, -1));

        btnColor11.setBackground(new java.awt.Color(255, 255, 255));
        btnColor11.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\color-icon.png")); // NOI18N
        btnColor11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColor11ActionPerformed(evt);
            }
        });
        jPanel1.add(btnColor11, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 400, -1, -1));

        btnColor12.setBackground(new java.awt.Color(255, 255, 255));
        btnColor12.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\color-icon.png")); // NOI18N
        btnColor12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColor12ActionPerformed(evt);
            }
        });
        jPanel1.add(btnColor12, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 430, -1, -1));

        btnColor13.setBackground(new java.awt.Color(255, 255, 255));
        btnColor13.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\color-icon.png")); // NOI18N
        btnColor13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColor13ActionPerformed(evt);
            }
        });
        jPanel1.add(btnColor13, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 460, -1, -1));

        btnColor14.setBackground(new java.awt.Color(255, 255, 255));
        btnColor14.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\color-icon.png")); // NOI18N
        btnColor14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColor14ActionPerformed(evt);
            }
        });
        jPanel1.add(btnColor14, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 490, -1, -1));

        btnColor15.setBackground(new java.awt.Color(255, 255, 255));
        btnColor15.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\color-icon.png")); // NOI18N
        btnColor15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColor15ActionPerformed(evt);
            }
        });
        jPanel1.add(btnColor15, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 520, -1, -1));

        btnColor16.setBackground(new java.awt.Color(255, 255, 255));
        btnColor16.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\color-icon.png")); // NOI18N
        btnColor16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColor16ActionPerformed(evt);
            }
        });
        jPanel1.add(btnColor16, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 550, -1, -1));

        btnColor17.setBackground(new java.awt.Color(255, 255, 255));
        btnColor17.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\color-icon.png")); // NOI18N
        btnColor17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColor17ActionPerformed(evt);
            }
        });
        jPanel1.add(btnColor17, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 580, -1, -1));

        btnColor18.setBackground(new java.awt.Color(255, 255, 255));
        btnColor18.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\color-icon.png")); // NOI18N
        btnColor18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColor18ActionPerformed(evt);
            }
        });
        jPanel1.add(btnColor18, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 610, -1, -1));

        btnColor19.setBackground(new java.awt.Color(255, 255, 255));
        btnColor19.setIcon(new javax.swing.ImageIcon("C:\\Users\\laura\\Documents\\NetBeansProjects\\ListaDeAlbuns\\src\\main\\images\\color-icon.png")); // NOI18N
        btnColor19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColor19ActionPerformed(evt);
            }
        });
        jPanel1.add(btnColor19, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 640, -1, -1));

        lblAlbumName13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(lblAlbumName13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        lblAlbumName14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(lblAlbumName14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, -1, -1));

        lblAlbumName16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(lblAlbumName16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, -1, -1));

        lblAlbumName15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(lblAlbumName15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, -1, -1));

        lblAlbumName17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(lblAlbumName17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, -1, -1));

        lblAlbumName19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(lblAlbumName19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        this.dispose();
        new AddAlbum().setVisible(true);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDetail1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetail1ActionPerformed
        this.dispose();
        new AlbumInfo(albumInfo(0)).setVisible(true);
    }//GEN-LAST:event_btnDetail1ActionPerformed

    private void btnDetail2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetail2ActionPerformed
        this.dispose();
        new AlbumInfo(albumInfo(1)).setVisible(true);
    }//GEN-LAST:event_btnDetail2ActionPerformed

    private void btnDetail3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetail3ActionPerformed
        this.dispose();
        new AlbumInfo(albumInfo(2)).setVisible(true);
    }//GEN-LAST:event_btnDetail3ActionPerformed

    private void btnDetail4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetail4ActionPerformed
        this.dispose();
        new AlbumInfo(albumInfo(3)).setVisible(true);
    }//GEN-LAST:event_btnDetail4ActionPerformed

    private void btnDetail5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetail5ActionPerformed
        this.dispose();
        new AlbumInfo(albumInfo(4)).setVisible(true);
    }//GEN-LAST:event_btnDetail5ActionPerformed

    private void btnDetail6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetail6ActionPerformed
        this.dispose();
        new AlbumInfo(albumInfo(5)).setVisible(true);
    }//GEN-LAST:event_btnDetail6ActionPerformed

    private void btnDetail7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetail7ActionPerformed
        this.dispose();
        new AlbumInfo(albumInfo(6)).setVisible(true);
    }//GEN-LAST:event_btnDetail7ActionPerformed

    private void btnDetail8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetail8ActionPerformed
        this.dispose();
        new AlbumInfo(albumInfo(7)).setVisible(true);
    }//GEN-LAST:event_btnDetail8ActionPerformed

    private void btnDetail9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetail9ActionPerformed
        this.dispose();
        new AlbumInfo(albumInfo(8)).setVisible(true);
    }//GEN-LAST:event_btnDetail9ActionPerformed

    private void btnDetail10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetail10ActionPerformed
        this.dispose();
        new AlbumInfo(albumInfo(9)).setVisible(true);
    }//GEN-LAST:event_btnDetail10ActionPerformed

    private void btnDetail11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetail11ActionPerformed
        this.dispose();
        new AlbumInfo(albumInfo(10)).setVisible(true);
    }//GEN-LAST:event_btnDetail11ActionPerformed

    private void btnDetail12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetail12ActionPerformed
        this.dispose();
        new AlbumInfo(albumInfo(11)).setVisible(true);
    }//GEN-LAST:event_btnDetail12ActionPerformed

    private void btnDetail13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetail13ActionPerformed
        this.dispose();
        new AlbumInfo(albumInfo(12)).setVisible(true);
    }//GEN-LAST:event_btnDetail13ActionPerformed

    private void btnDetail14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetail14ActionPerformed
        this.dispose();
        new AlbumInfo(albumInfo(13)).setVisible(true);
    }//GEN-LAST:event_btnDetail14ActionPerformed

    private void btnDetail15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetail15ActionPerformed
        this.dispose();
        new AlbumInfo(albumInfo(14)).setVisible(true);
    }//GEN-LAST:event_btnDetail15ActionPerformed

    private void btnDetail16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetail16ActionPerformed
        this.dispose();
        new AlbumInfo(albumInfo(15)).setVisible(true);
    }//GEN-LAST:event_btnDetail16ActionPerformed

    private void btnDetail17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetail17ActionPerformed
        this.dispose();
        new AlbumInfo(albumInfo(16)).setVisible(true);
    }//GEN-LAST:event_btnDetail17ActionPerformed

    private void btnDetail18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetail18ActionPerformed
        this.dispose();
        new AlbumInfo(albumInfo(17)).setVisible(true);
    }//GEN-LAST:event_btnDetail18ActionPerformed

    private void btnUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate1ActionPerformed
        this.dispose();
        new UpdateAlbum(albumInfo(0), lblAlbumName1.getForeground()).setVisible(true);
    }//GEN-LAST:event_btnUpdate1ActionPerformed

    private void btnUpdate2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate2ActionPerformed
        this.dispose();
        new UpdateAlbum(albumInfo(1), lblAlbumName2.getForeground()).setVisible(true);
    }//GEN-LAST:event_btnUpdate2ActionPerformed

    private void btnUpdate3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate3ActionPerformed
        this.dispose();
        new UpdateAlbum(albumInfo(2), lblAlbumName3.getForeground()).setVisible(true);
    }//GEN-LAST:event_btnUpdate3ActionPerformed

    private void btnUpdate4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate4ActionPerformed
        this.dispose();
        new UpdateAlbum(albumInfo(3), lblAlbumName4.getForeground()).setVisible(true);
    }//GEN-LAST:event_btnUpdate4ActionPerformed

    private void btnUpdate5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate5ActionPerformed
        this.dispose();
        new UpdateAlbum(albumInfo(4), lblAlbumName5.getForeground()).setVisible(true);
    }//GEN-LAST:event_btnUpdate5ActionPerformed

    private void btnUpdate6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate6ActionPerformed
        this.dispose();
        new UpdateAlbum(albumInfo(5), lblAlbumName6.getForeground()).setVisible(true);
    }//GEN-LAST:event_btnUpdate6ActionPerformed

    private void btnUpdate7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate7ActionPerformed
        this.dispose();
        new UpdateAlbum(albumInfo(6), lblAlbumName7.getForeground()).setVisible(true);
    }//GEN-LAST:event_btnUpdate7ActionPerformed

    private void btnUpdate8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate8ActionPerformed
        this.dispose();
        new UpdateAlbum(albumInfo(7), lblAlbumName8.getForeground()).setVisible(true);
    }//GEN-LAST:event_btnUpdate8ActionPerformed

    private void btnUpdate9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate9ActionPerformed
        this.dispose();
        new UpdateAlbum(albumInfo(8), lblAlbumName9.getForeground()).setVisible(true);
    }//GEN-LAST:event_btnUpdate9ActionPerformed

    private void btnUpdate10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate10ActionPerformed
        this.dispose();
        new UpdateAlbum(albumInfo(9), lblAlbumName10.getForeground()).setVisible(true);
    }//GEN-LAST:event_btnUpdate10ActionPerformed

    private void btnUpdate11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate11ActionPerformed
        this.dispose();
        new UpdateAlbum(albumInfo(10), lblAlbumName11.getForeground()).setVisible(true);
    }//GEN-LAST:event_btnUpdate11ActionPerformed

    private void btnUpdate12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate12ActionPerformed
        this.dispose();
        new UpdateAlbum(albumInfo(11), lblAlbumName12.getForeground()).setVisible(true);
    }//GEN-LAST:event_btnUpdate12ActionPerformed

    private void btnUpdate13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate13ActionPerformed
        this.dispose();
        new UpdateAlbum(albumInfo(12), lblAlbumName13.getForeground()).setVisible(true);
    }//GEN-LAST:event_btnUpdate13ActionPerformed

    private void btnUpdate14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate14ActionPerformed
        this.dispose();
        new UpdateAlbum(albumInfo(13), lblAlbumName14.getForeground()).setVisible(true);
    }//GEN-LAST:event_btnUpdate14ActionPerformed

    private void btnUpdate15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate15ActionPerformed
        this.dispose();
        new UpdateAlbum(albumInfo(14), lblAlbumName15.getForeground()).setVisible(true);
    }//GEN-LAST:event_btnUpdate15ActionPerformed

    private void btnUpdate16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate16ActionPerformed
        this.dispose();
        new UpdateAlbum(albumInfo(15), lblAlbumName16.getForeground()).setVisible(true);
    }//GEN-LAST:event_btnUpdate16ActionPerformed

    private void btnUpdate17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate17ActionPerformed
        this.dispose();
        new UpdateAlbum(albumInfo(16), lblAlbumName17.getForeground()).setVisible(true);
    }//GEN-LAST:event_btnUpdate17ActionPerformed

    private void btnUpdate18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate18ActionPerformed
        this.dispose();
        new UpdateAlbum(albumInfo(17), lblAlbumName18.getForeground()).setVisible(true);
    }//GEN-LAST:event_btnUpdate18ActionPerformed

    private void btnDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete1ActionPerformed
        this.dispose();
        new DeleteAlbum(albumInfo(0)).setVisible(true);
    }//GEN-LAST:event_btnDelete1ActionPerformed

    private void btnDelete2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete2ActionPerformed
        this.dispose();
        new DeleteAlbum(albumInfo(1)).setVisible(true);
    }//GEN-LAST:event_btnDelete2ActionPerformed

    private void btnDelete3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete3ActionPerformed
        this.dispose();
        new DeleteAlbum(albumInfo(2)).setVisible(true);
    }//GEN-LAST:event_btnDelete3ActionPerformed

    private void btnDelete4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete4ActionPerformed
        this.dispose();
        new DeleteAlbum(albumInfo(3)).setVisible(true);
    }//GEN-LAST:event_btnDelete4ActionPerformed

    private void btnDelete5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete5ActionPerformed
        this.dispose();
        new DeleteAlbum(albumInfo(4)).setVisible(true);
    }//GEN-LAST:event_btnDelete5ActionPerformed

    private void btnDelete6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete6ActionPerformed
        this.dispose();
        new DeleteAlbum(albumInfo(5)).setVisible(true);
    }//GEN-LAST:event_btnDelete6ActionPerformed

    private void btnDelete7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete7ActionPerformed
        this.dispose();
        new DeleteAlbum(albumInfo(6)).setVisible(true);
    }//GEN-LAST:event_btnDelete7ActionPerformed

    private void btnDelete8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete8ActionPerformed
        this.dispose();
        new DeleteAlbum(albumInfo(7)).setVisible(true);
    }//GEN-LAST:event_btnDelete8ActionPerformed

    private void btnDelete9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete9ActionPerformed
        this.dispose();
        new DeleteAlbum(albumInfo(8)).setVisible(true);
    }//GEN-LAST:event_btnDelete9ActionPerformed

    private void btnDelete10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete10ActionPerformed
        this.dispose();
        new DeleteAlbum(albumInfo(9)).setVisible(true);
    }//GEN-LAST:event_btnDelete10ActionPerformed

    private void btnDelete11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete11ActionPerformed
        this.dispose();
        new DeleteAlbum(albumInfo(10)).setVisible(true);
    }//GEN-LAST:event_btnDelete11ActionPerformed

    private void btnDelete12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete12ActionPerformed
        this.dispose();
        new DeleteAlbum(albumInfo(11)).setVisible(true);
    }//GEN-LAST:event_btnDelete12ActionPerformed

    private void btnDelete13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete13ActionPerformed
        this.dispose();
        new DeleteAlbum(albumInfo(12)).setVisible(true);
    }//GEN-LAST:event_btnDelete13ActionPerformed

    private void btnDelete14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete14ActionPerformed
        this.dispose();
        new DeleteAlbum(albumInfo(13)).setVisible(true);
    }//GEN-LAST:event_btnDelete14ActionPerformed

    private void btnDelete15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete15ActionPerformed
        this.dispose();
        new DeleteAlbum(albumInfo(14)).setVisible(true);
    }//GEN-LAST:event_btnDelete15ActionPerformed

    private void btnDelete16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete16ActionPerformed
        this.dispose();
        new DeleteAlbum(albumInfo(15)).setVisible(true);
    }//GEN-LAST:event_btnDelete16ActionPerformed

    private void btnDelete17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete17ActionPerformed
        this.dispose();
        new DeleteAlbum(albumInfo(16)).setVisible(true);
    }//GEN-LAST:event_btnDelete17ActionPerformed

    private void btnDelete18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete18ActionPerformed
        this.dispose();
        new DeleteAlbum(albumInfo(17)).setVisible(true);
    }//GEN-LAST:event_btnDelete18ActionPerformed

    private void btnRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRankingActionPerformed
        this.dispose();
        new Ranking().setVisible(true);
    }//GEN-LAST:event_btnRankingActionPerformed

    private void btnColor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColor1ActionPerformed
        Color color = ccAlbumName.showDialog(this, "Escolha uma cor", Color.black);
        lblAlbumName1.setForeground(color);
    }//GEN-LAST:event_btnColor1ActionPerformed

    private void btnColor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColor2ActionPerformed
        Color color = ccAlbumName.showDialog(this, "Escolha uma cor", Color.black);
        lblAlbumName2.setForeground(color);
    }//GEN-LAST:event_btnColor2ActionPerformed

    private void btnColor3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColor3ActionPerformed
        Color color = ccAlbumName.showDialog(this, "Escolha uma cor", Color.black);
        lblAlbumName3.setForeground(color);
    }//GEN-LAST:event_btnColor3ActionPerformed

    private void btnColor4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColor4ActionPerformed
        Color color = ccAlbumName.showDialog(this, "Escolha uma cor", Color.black);
        lblAlbumName4.setForeground(color);
    }//GEN-LAST:event_btnColor4ActionPerformed

    private void btnColor5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColor5ActionPerformed
        Color color = ccAlbumName.showDialog(this, "Escolha uma cor", Color.black);
        lblAlbumName5.setForeground(color);
    }//GEN-LAST:event_btnColor5ActionPerformed

    private void btnColor6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColor6ActionPerformed
        Color color = ccAlbumName.showDialog(this, "Escolha uma cor", Color.black);
        lblAlbumName6.setForeground(color);
    }//GEN-LAST:event_btnColor6ActionPerformed

    private void btnColor7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColor7ActionPerformed
        Color color = ccAlbumName.showDialog(this, "Escolha uma cor", Color.black);
        lblAlbumName7.setForeground(color);
    }//GEN-LAST:event_btnColor7ActionPerformed

    private void btnColor8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColor8ActionPerformed
        Color color = ccAlbumName.showDialog(this, "Escolha uma cor", Color.black);
        lblAlbumName8.setForeground(color);
    }//GEN-LAST:event_btnColor8ActionPerformed

    private void btnColor9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColor9ActionPerformed
        Color color = ccAlbumName.showDialog(this, "Escolha uma cor", Color.black);
        lblAlbumName9.setForeground(color);
    }//GEN-LAST:event_btnColor9ActionPerformed

    private void btnColor10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColor10ActionPerformed
        Color color = ccAlbumName.showDialog(this, "Escolha uma cor", Color.black);
        lblAlbumName10.setForeground(color);
    }//GEN-LAST:event_btnColor10ActionPerformed

    private void btnColor11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColor11ActionPerformed
        Color color = ccAlbumName.showDialog(this, "Escolha uma cor", Color.black);
        lblAlbumName11.setForeground(color);
    }//GEN-LAST:event_btnColor11ActionPerformed

    private void btnColor12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColor12ActionPerformed
        Color color = ccAlbumName.showDialog(this, "Escolha uma cor", Color.black);
        lblAlbumName12.setForeground(color);
    }//GEN-LAST:event_btnColor12ActionPerformed

    private void btnColor13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColor13ActionPerformed
        Color color = ccAlbumName.showDialog(this, "Escolha uma cor", Color.black);
        lblAlbumName18.setForeground(color);
    }//GEN-LAST:event_btnColor13ActionPerformed

    private void btnColor14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColor14ActionPerformed
        Color color = ccAlbumName.showDialog(this, "Escolha uma cor", Color.black);
        lblAlbumName14.setForeground(color);
    }//GEN-LAST:event_btnColor14ActionPerformed

    private void btnColor15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColor15ActionPerformed
        Color color = ccAlbumName.showDialog(this, "Escolha uma cor", Color.black);
        lblAlbumName15.setForeground(color);
    }//GEN-LAST:event_btnColor15ActionPerformed

    private void btnColor16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColor16ActionPerformed
        Color color = ccAlbumName.showDialog(this, "Escolha uma cor", Color.black);
        lblAlbumName16.setForeground(color);
    }//GEN-LAST:event_btnColor16ActionPerformed

    private void btnColor17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColor17ActionPerformed
        Color color = ccAlbumName.showDialog(this, "Escolha uma cor", Color.black);
        lblAlbumName18.setForeground(color);
    }//GEN-LAST:event_btnColor17ActionPerformed

    private void btnColor18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColor18ActionPerformed
        Color color = ccAlbumName.showDialog(this, "Escolha uma cor", Color.black);
        lblAlbumName17.setForeground(color);
    }//GEN-LAST:event_btnColor18ActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        this.dispose();
        new AlbumList().setVisible(true);
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnDetail19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetail19ActionPerformed
        this.dispose();
        new AlbumInfo(albumInfo(18)).setVisible(true);
    }//GEN-LAST:event_btnDetail19ActionPerformed

    private void btnUpdate19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate19ActionPerformed
        this.dispose();
        new UpdateAlbum(albumInfo(18), lblAlbumName19.getForeground()).setVisible(true);
    }//GEN-LAST:event_btnUpdate19ActionPerformed

    private void btnDelete19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete19ActionPerformed
        this.dispose();
        new DeleteAlbum(albumInfo(18)).setVisible(true);
    }//GEN-LAST:event_btnDelete19ActionPerformed

    private void btnColor19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColor19ActionPerformed
        Color color = ccAlbumName.showDialog(this, "Escolha uma cor", Color.black);
        lblAlbumName19.setForeground(color);
    }//GEN-LAST:event_btnColor19ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            javax.swing.UIManager.setLookAndFeel(
                javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnColor1;
    private javax.swing.JButton btnColor10;
    private javax.swing.JButton btnColor11;
    private javax.swing.JButton btnColor12;
    private javax.swing.JButton btnColor13;
    private javax.swing.JButton btnColor14;
    private javax.swing.JButton btnColor15;
    private javax.swing.JButton btnColor16;
    private javax.swing.JButton btnColor17;
    private javax.swing.JButton btnColor18;
    private javax.swing.JButton btnColor19;
    private javax.swing.JButton btnColor2;
    private javax.swing.JButton btnColor3;
    private javax.swing.JButton btnColor4;
    private javax.swing.JButton btnColor5;
    private javax.swing.JButton btnColor6;
    private javax.swing.JButton btnColor7;
    private javax.swing.JButton btnColor8;
    private javax.swing.JButton btnColor9;
    private javax.swing.JButton btnDelete1;
    private javax.swing.JButton btnDelete10;
    private javax.swing.JButton btnDelete11;
    private javax.swing.JButton btnDelete12;
    private javax.swing.JButton btnDelete13;
    private javax.swing.JButton btnDelete14;
    private javax.swing.JButton btnDelete15;
    private javax.swing.JButton btnDelete16;
    private javax.swing.JButton btnDelete17;
    private javax.swing.JButton btnDelete18;
    private javax.swing.JButton btnDelete19;
    private javax.swing.JButton btnDelete2;
    private javax.swing.JButton btnDelete3;
    private javax.swing.JButton btnDelete4;
    private javax.swing.JButton btnDelete5;
    private javax.swing.JButton btnDelete6;
    private javax.swing.JButton btnDelete7;
    private javax.swing.JButton btnDelete8;
    private javax.swing.JButton btnDelete9;
    private javax.swing.JButton btnDetail1;
    private javax.swing.JButton btnDetail10;
    private javax.swing.JButton btnDetail11;
    private javax.swing.JButton btnDetail12;
    private javax.swing.JButton btnDetail13;
    private javax.swing.JButton btnDetail14;
    private javax.swing.JButton btnDetail15;
    private javax.swing.JButton btnDetail16;
    private javax.swing.JButton btnDetail17;
    private javax.swing.JButton btnDetail18;
    private javax.swing.JButton btnDetail19;
    private javax.swing.JButton btnDetail2;
    private javax.swing.JButton btnDetail3;
    private javax.swing.JButton btnDetail4;
    private javax.swing.JButton btnDetail5;
    private javax.swing.JButton btnDetail6;
    private javax.swing.JButton btnDetail7;
    private javax.swing.JButton btnDetail8;
    private javax.swing.JButton btnDetail9;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnRanking;
    private javax.swing.JButton btnUpdate1;
    private javax.swing.JButton btnUpdate10;
    private javax.swing.JButton btnUpdate11;
    private javax.swing.JButton btnUpdate12;
    private javax.swing.JButton btnUpdate13;
    private javax.swing.JButton btnUpdate14;
    private javax.swing.JButton btnUpdate15;
    private javax.swing.JButton btnUpdate16;
    private javax.swing.JButton btnUpdate17;
    private javax.swing.JButton btnUpdate18;
    private javax.swing.JButton btnUpdate19;
    private javax.swing.JButton btnUpdate2;
    private javax.swing.JButton btnUpdate3;
    private javax.swing.JButton btnUpdate4;
    private javax.swing.JButton btnUpdate5;
    private javax.swing.JButton btnUpdate6;
    private javax.swing.JButton btnUpdate7;
    private javax.swing.JButton btnUpdate8;
    private javax.swing.JButton btnUpdate9;
    private javax.swing.JColorChooser ccAlbumName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAlbumName1;
    private javax.swing.JLabel lblAlbumName10;
    private javax.swing.JLabel lblAlbumName11;
    private javax.swing.JLabel lblAlbumName12;
    private javax.swing.JLabel lblAlbumName13;
    private javax.swing.JLabel lblAlbumName14;
    private javax.swing.JLabel lblAlbumName15;
    private javax.swing.JLabel lblAlbumName16;
    private javax.swing.JLabel lblAlbumName17;
    private javax.swing.JLabel lblAlbumName18;
    private javax.swing.JLabel lblAlbumName19;
    private javax.swing.JLabel lblAlbumName2;
    private javax.swing.JLabel lblAlbumName3;
    private javax.swing.JLabel lblAlbumName4;
    private javax.swing.JLabel lblAlbumName5;
    private javax.swing.JLabel lblAlbumName6;
    private javax.swing.JLabel lblAlbumName7;
    private javax.swing.JLabel lblAlbumName8;
    private javax.swing.JLabel lblAlbumName9;
    private javax.swing.JLabel lblPageTitle;
    // End of variables declaration//GEN-END:variables
}
