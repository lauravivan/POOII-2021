/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe3;

/**
 *
 * @author laura
 */
public class EXE3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Carta minhaCarta = new Carta(5, 5);
        } catch (RuntimeException e) {
            System.out.println("Erro: Você está tentando passar como parâmetro um inteiro"
                    + " no lugar de uma String");
        }
        
        try {
            Carta minhaCarta = new Carta("espadas", "copas");
        } catch (RuntimeException e) {
            System.out.println("Erro: Você está tentando passar como parâmetro uma String"
                    + " no lugar de um inteiro");
        }
        
        try {
            Carta minhaCarta = new Carta("espadas", Integer.parseInt("copas"));
        } catch (NumberFormatException e) {
            System.out.println("Erro: Você está tentando transformar uma String em inteiro");
        }

        try {
            Carta[] minhasCartas = new Carta[2];
            minhasCartas[0] = new Carta("espada", 5);
            minhasCartas[1] = new Carta("ouro", 10);

            Baralho meuBaralho = new Baralho(minhasCartas);
            for(int i = 0; i < minhasCartas.length; i++) {
                System.out.println(meuBaralho.getCartas()[i]);
            }
        } catch (NullPointerException e) {
            System.out.println("Erro: O seu baralho é inexistente pois você tentou criá-lo com"
                    + " a quantidade diferente da necessária");
        }
        
        try {
            Carta[] minhasCartas = new Carta[2];
            minhasCartas[0] = new Carta("espada", 5);
            minhasCartas[1] = new Carta("ouro", 4);
            minhasCartas[2] = new Carta("copas", 3);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: você está tentando criar cartas há mais"
                    + " do que é permitido! Tente aumentar o espaço.");
        }
        
        try {
            Carta[] minhasCartas = new Carta[52];
            minhasCartas[0] = new Carta("espadas", 1);
            minhasCartas[1] = new Carta("espadas", 2);
            minhasCartas[2] = new Carta("espadas", 3);
            minhasCartas[3] = new Carta("espadas", 4);
            minhasCartas[4] = new Carta("espadas", 5);
            minhasCartas[5] = new Carta("espadas", 6);
            minhasCartas[6] = new Carta("espadas", 7);
            minhasCartas[7] = new Carta("espadas", 8);
            minhasCartas[8] = new Carta("espadas", 9);
            minhasCartas[9] = new Carta("espadas", 10);
            minhasCartas[10] = new Carta("espadas", 11);
            minhasCartas[11] = new Carta("espadas", 12);
            minhasCartas[12] = new Carta("espadas", 13);
            minhasCartas[13] = new Carta("copas", 1);
            minhasCartas[14] = new Carta("copas", 2);
            minhasCartas[15] = new Carta("copas", 3);
            minhasCartas[16] = new Carta("copas", 4);
            minhasCartas[17] = new Carta("copas", 5);
            minhasCartas[18] = new Carta("copas", 6);
            minhasCartas[19] = new Carta("copas", 7);
            minhasCartas[20] = new Carta("copas", 8);
            minhasCartas[21] = new Carta("copas", 9);
            minhasCartas[22] = new Carta("copas", 10);
            minhasCartas[23] = new Carta("copas", 11);
            minhasCartas[24] = new Carta("copas", 12);
            minhasCartas[25] = new Carta("copas", 13);
            minhasCartas[26] = new Carta("ouro", 1);
            minhasCartas[27] = new Carta("ouro", 2);
            minhasCartas[28] = new Carta("ouro", 3);
            minhasCartas[29] = new Carta("ouro", 4);
            minhasCartas[30] = new Carta("ouro", 5);
            minhasCartas[31] = new Carta("ouro", 6);
            minhasCartas[32] = new Carta("ouro", 7);
            minhasCartas[33] = new Carta("ouro", 8);
            minhasCartas[34] = new Carta("ouro", 9);
            minhasCartas[35] = new Carta("ouro", 10);
            minhasCartas[36] = new Carta("ouro", 11);
            minhasCartas[37] = new Carta("ouro", 12);
            minhasCartas[38] = new Carta("ouro", 13);
            minhasCartas[39] = new Carta("paus", 1);
            minhasCartas[40] = new Carta("paus", 2);
            minhasCartas[41] = new Carta("paus", 3);
            minhasCartas[42] = new Carta("paus", 4);
            minhasCartas[43] = new Carta("paus", 5);
            minhasCartas[44] = new Carta("paus", 6);
            minhasCartas[45] = new Carta("paus", 7);
            minhasCartas[46] = new Carta("paus", 8);
            minhasCartas[47] = new Carta("paus", 9);
            minhasCartas[48] = new Carta("paus", 10);
            minhasCartas[49] = new Carta("paus", 11);
            minhasCartas[50] = new Carta("paus", 12);
            minhasCartas[51] = new Carta("ovos", 40);
            
            Baralho meuBaralho = new Baralho(minhasCartas);
        } catch (NullPointerException e) {
            System.out.println("Erro: Você tentou intanciar no baralho uma carta inválida");
        }
        
        try {
            Carta[] minhasCartas = new Carta[52];
            minhasCartas[0] = new Carta("espadas", 1);
            minhasCartas[1] = new Carta("espadas", 2);
            minhasCartas[2] = new Carta("espadas", 3);
            minhasCartas[3] = new Carta("espadas", 4);
            minhasCartas[4] = new Carta("espadas", 5);
            minhasCartas[5] = new Carta("espadas", 6);
            minhasCartas[6] = new Carta("espadas", 7);
            minhasCartas[7] = new Carta("espadas", 8);
            minhasCartas[8] = new Carta("espadas", 9);
            minhasCartas[9] = new Carta("espadas", 10);
            minhasCartas[10] = new Carta("espadas", 11);
            minhasCartas[11] = new Carta("espadas", 12);
            minhasCartas[12] = new Carta("espadas", 12);
            minhasCartas[13] = new Carta("copas", 1);
            minhasCartas[14] = new Carta("copas", 2);
            minhasCartas[15] = new Carta("copas", 3);
            minhasCartas[16] = new Carta("copas", 4);
            minhasCartas[17] = new Carta("copas", 4);
            minhasCartas[18] = new Carta("copas", 6);
            minhasCartas[19] = new Carta("copas", 7);
            minhasCartas[20] = new Carta("copas", 8);
            minhasCartas[21] = new Carta("copas", 9);
            minhasCartas[22] = new Carta("copas", 10);
            minhasCartas[23] = new Carta("copas", 11);
            minhasCartas[24] = new Carta("copas", 12);
            minhasCartas[25] = new Carta("copas", 13);
            minhasCartas[26] = new Carta("ouro", 1);
            minhasCartas[27] = new Carta("ouro", 2);
            minhasCartas[28] = new Carta("ouro", 3);
            minhasCartas[29] = new Carta("ouro", 4);
            minhasCartas[30] = new Carta("ouro", 5);
            minhasCartas[31] = new Carta("ouro", 6);
            minhasCartas[32] = new Carta("ouro", 7);
            minhasCartas[33] = new Carta("ouro", 7);
            minhasCartas[34] = new Carta("ouro", 9);
            minhasCartas[35] = new Carta("ouro", 10);
            minhasCartas[36] = new Carta("ouro", 11);
            minhasCartas[37] = new Carta("ouro", 12);
            minhasCartas[38] = new Carta("ouro", 13);
            minhasCartas[39] = new Carta("paus", 1);
            minhasCartas[40] = new Carta("paus", 2);
            minhasCartas[41] = new Carta("paus", 3);
            minhasCartas[42] = new Carta("paus", 4);
            minhasCartas[43] = new Carta("paus", 5);
            minhasCartas[44] = new Carta("paus", 6);
            minhasCartas[45] = new Carta("paus", 7);
            minhasCartas[46] = new Carta("paus", 8);
            minhasCartas[47] = new Carta("paus", 9);
            minhasCartas[48] = new Carta("paus", 10);
            minhasCartas[49] = new Carta("paus", 11);
            minhasCartas[50] = new Carta("paus", 12);
            minhasCartas[51] = new Carta("paus", 13);
            
            Baralho meuBaralho = new Baralho(minhasCartas);
        } catch (NullPointerException e) {
            System.out.println("Erro: Você tentou intanciar uma carta ou várias cartas"
                    + " repetidas");
        }
  
        Carta[] minhasCartas = new Carta[52];
        minhasCartas[0] = new Carta("espadas", 1);
        minhasCartas[1] = new Carta("espadas", 2);
        minhasCartas[2] = new Carta("espadas", 3);
        minhasCartas[3] = new Carta("espadas", 4);
        minhasCartas[4] = new Carta("espadas", 5);
        minhasCartas[5] = new Carta("espadas", 6);
        minhasCartas[6] = new Carta("espadas", 7);
        minhasCartas[7] = new Carta("espadas", 8);
        minhasCartas[8] = new Carta("espadas", 9);
        minhasCartas[9] = new Carta("espadas", 10);
        minhasCartas[10] = new Carta("espadas", 11);
        minhasCartas[11] = new Carta("espadas", 12);
        minhasCartas[12] = new Carta("espadas", 13);
        minhasCartas[13] = new Carta("copas", 1);
        minhasCartas[14] = new Carta("copas", 2);
        minhasCartas[15] = new Carta("copas", 3);
        minhasCartas[16] = new Carta("copas", 4);
        minhasCartas[17] = new Carta("copas", 5);
        minhasCartas[18] = new Carta("copas", 6);
        minhasCartas[19] = new Carta("copas", 7);
        minhasCartas[20] = new Carta("copas", 8);
        minhasCartas[21] = new Carta("copas", 9);
        minhasCartas[22] = new Carta("copas", 10);
        minhasCartas[23] = new Carta("copas", 11);
        minhasCartas[24] = new Carta("copas", 12);
        minhasCartas[25] = new Carta("copas", 13);
        minhasCartas[26] = new Carta("ouro", 1);
        minhasCartas[27] = new Carta("ouro", 2);
        minhasCartas[28] = new Carta("ouro", 3);
        minhasCartas[29] = new Carta("ouro", 4);
        minhasCartas[30] = new Carta("ouro", 5);
        minhasCartas[31] = new Carta("ouro", 6);
        minhasCartas[32] = new Carta("ouro", 7);
        minhasCartas[33] = new Carta("ouro", 8);
        minhasCartas[34] = new Carta("ouro", 9);
        minhasCartas[35] = new Carta("ouro", 10);
        minhasCartas[36] = new Carta("ouro", 11);
        minhasCartas[37] = new Carta("ouro", 12);
        minhasCartas[38] = new Carta("ouro", 13);
        minhasCartas[39] = new Carta("paus", 1);
        minhasCartas[40] = new Carta("paus", 2);
        minhasCartas[41] = new Carta("paus", 3);
        minhasCartas[42] = new Carta("paus", 4);
        minhasCartas[43] = new Carta("paus", 5);
        minhasCartas[44] = new Carta("paus", 6);
        minhasCartas[45] = new Carta("paus", 7);
        minhasCartas[46] = new Carta("paus", 8);
        minhasCartas[47] = new Carta("paus", 9);
        minhasCartas[48] = new Carta("paus", 10);
        minhasCartas[49] = new Carta("paus", 11);
        minhasCartas[50] = new Carta("paus", 12);
        minhasCartas[51] = new Carta("paus", 13);

        Baralho meuBaralho = new Baralho(minhasCartas);
       
        meuBaralho.mostrarBaralho(meuBaralho);
       
        meuBaralho.embaralhar(meuBaralho);    
        for (int i = 0; i < meuBaralho.getCartas().length; i++) {
            System.out.println(meuBaralho.getCartas()[i]);
        }
        
        meuBaralho.ordernar(meuBaralho);
        for (int i = 0; i < meuBaralho.getCartas().length; i++) {
            System.out.println(meuBaralho.getCartas()[i]);
        }  
    }
    
}
