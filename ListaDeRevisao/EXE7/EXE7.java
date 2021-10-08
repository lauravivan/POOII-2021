/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EXE7;

/**
 *
 * @author laura
 */
public class EXE7 {
    
    public static void main(String[] args) {
        
        try {
            Data dataAtual = new Data(05, 10, 2021);
            Hora horaAtual = new Hora(18, 31);
            
            System.out.println(dataAtual.toString());
            System.out.println(horaAtual.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        try {
            new Data(35, 10, 2021);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        try {
            new Data(05, 00, 2021);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        try {
            new Data(05, 10, 2022);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        try {
            new Hora(24, 31);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        try {
            new Hora(18, 65);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        try {
            Data dataAtual = new Data(70, -1, 2025);
            System.out.println(dataAtual.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        try {
            Hora horaAtual = new Hora(35, 65);
            System.out.println(horaAtual.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        try {
            Data minhaData = new Data(8, 10, 2021);
            minhaData.setLembrete("Assistir a roda de conversa da Semana de "
                    + "Ciência e Tecnologia");
            System.out.println(minhaData.getLembrete());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        try {
            Data minhaData = new Data(8, 10, 2021);
            Hora horaDoEvento = new Hora(19, 30);
            minhaData.marcaLembreteComHora("Assistir a roda de conversa da Semana de "
                    + "Ciência e Tecnologia", horaDoEvento);
            minhaData.mostraLembreteComHora();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
