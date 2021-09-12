/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe3;

import java.util.Random;

/**
 *
 * @author laura
 */
public class Baralho {
    //o baralho é composto de 52 cartas
    //13 de cada tipo
    private final static int QUANTIDADE_DE_CARTAS = 52;
    private Carta[] cartas = new Carta[QUANTIDADE_DE_CARTAS];

    public Baralho(Carta[] cartas) {
        int flag = 0;
        
        if (cartas.length != QUANTIDADE_DE_CARTAS) {
            cartas = null;
            flag += 1;
        }
        
        for (int i = 0; i < QUANTIDADE_DE_CARTAS; i++) {
            if ("".equals(cartas[i].getNaipe())){
                cartas = null;
                flag += 1;
            }
        }
        
        for (int i = 0; i < QUANTIDADE_DE_CARTAS; i++) {
            if (cartas[i].getNumero() == 0) {
                cartas = null;
                flag += 1;
            }
        }
        
        this.cartasRepetidas(cartas);

        if (flag == 0) {
            this.cartas = cartas;
        }
    }

    public Carta[] getCartas() {
        return this.cartas;
    }

    public void setCartas(Carta[] cartas) {
        this.cartas = cartas;
    }
    
    public void mostrarBaralho(Baralho baralho) {
        System.out.println("\nSeu baralho: ");
        for (int i = 0; i < QUANTIDADE_DE_CARTAS; i++) {
           System.out.println(baralho.getCartas()[i]);
        }
    }
    
    public void ordernar(Baralho baralho) {
        Carta aux;
        
        System.out.println("\nSeu baralho ordenado: ");
        for (int i = 0; i < QUANTIDADE_DE_CARTAS; i++) {
            for (int j = 0; j < QUANTIDADE_DE_CARTAS; j++) {
                if (baralho.getCartas()[i].getNumero() < baralho.getCartas()[j].getNumero()) {
                    aux = baralho.getCartas()[i];
                    baralho.getCartas()[i] = baralho.getCartas()[j];
                    baralho.getCartas()[j] = aux;
                }
            }
        }
    }

    public void embaralhar(Baralho baralho) {
        Carta aux;
        Random embaralhamento = new Random();
        
        System.out.println("\nSeu baralho embaralhado: ");
        for (int i = 0; i < QUANTIDADE_DE_CARTAS; i++){
            int embaralha = embaralhamento.nextInt(QUANTIDADE_DE_CARTAS);
            
            aux = baralho.getCartas()[i];
            baralho.getCartas()[i] = baralho.getCartas()[embaralha];
            baralho.getCartas()[embaralha] = aux;
        }
    }
    
    private void cartasRepetidas(Carta[] cartas) {
        int numero = 0;
        int qntEsp1 = 0;
        int qntEsp2 = 0;
        int qntEsp3 = 0;
        int qntEsp4 = 0;
        int qntEsp5 = 0;
        int qntEsp6 = 0;
        int qntEsp7 = 0;
        int qntEsp8 = 0;
        int qntEsp9 = 0;
        int qntEsp10 = 0;
        int qntEsp11 = 0;
        int qntEsp12 = 0;
        int qntEsp13 = 0;
        
        int qntCop1 = 0;
        int qntCop2 = 0;
        int qntCop3 = 0;
        int qntCop4 = 0;
        int qntCop5 = 0;
        int qntCop6 = 0;
        int qntCop7 = 0;
        int qntCop8 = 0;
        int qntCop9 = 0;
        int qntCop10 = 0;
        int qntCop11 = 0;
        int qntCop12 = 0;
        int qntCop13 = 0;
        
        int qntOuro1 = 0;
        int qntOuro2 = 0;
        int qntOuro3 = 0;
        int qntOuro4 = 0;
        int qntOuro5 = 0;
        int qntOuro6 = 0;
        int qntOuro7 = 0;
        int qntOuro8 = 0;
        int qntOuro9 = 0;
        int qntOuro10 = 0;
        int qntOuro11 = 0;
        int qntOuro12 = 0;
        int qntOuro13 = 0;
        
        int qntPaus1 = 0;
        int qntPaus2 = 0;
        int qntPaus3 = 0;
        int qntPaus4 = 0;
        int qntPaus5 = 0;
        int qntPaus6 = 0;
        int qntPaus7 = 0;
        int qntPaus8 = 0;
        int qntPaus9 = 0;
        int qntPaus10 = 0;
        int qntPaus11 = 0;
        int qntPaus12 = 0;
        int qntPaus13 = 0;
        
        while (numero < QUANTIDADE_DE_CARTAS - 1) {
            switch (cartas[numero].getNaipe().toUpperCase()) {
                case "ESPADAS":
                    switch (cartas[numero].getNumero()) {
                        case 1:
                            qntEsp1 += 1;
                            if (qntEsp1 > 1) {
                                cartas = null;
                                break;
                            }
                            break;
                        case 2:
                            qntEsp2 += 1;
                            if (qntEsp2 > 1) {
                                cartas = null;
                                break;
                            }
                            break;
                        case 3:
                            qntEsp3 += 1;
                            if (qntEsp3 > 1) {
                                cartas = null;
                                break;
                            }
                            break;
                        case 4:
                            qntEsp4 += 1;
                            if (qntEsp4 > 1) {
                                cartas = null;
                                break;
                            }
                            break;
                        case 5:
                            qntEsp5 += 1;
                            if (qntEsp5 > 1) {
                                cartas = null;
                                break;
                            }
                            break;
                        case 6:
                            qntEsp6 += 1;
                            if (qntEsp6 > 1) {
                                cartas = null;
                                break;
                            }
                            break;
                        case 7:
                            qntEsp7 += 1;
                            if (qntEsp7 > 1) {
                                cartas = null;
                                break;
                            }
                            break;
                        case 8:
                            qntEsp8 += 1;
                            if (qntEsp8 > 1) {
                                cartas = null;
                                break;
                            }
                            break;
                        case 9:
                            qntEsp9 += 1;
                            if (qntEsp9 > 1) {
                                cartas = null;
                                break;
                            }
                            break;
                        case 10:
                            qntEsp10 += 1;
                            if (qntEsp10 > 1) {
                                cartas = null;
                                break;
                            }
                            break;
                        case 11:
                            qntEsp11 += 1;
                            if (qntEsp11 > 1) {
                                cartas = null;
                                break;
                            }
                            break;
                        case 12:
                            qntEsp12 += 1;
                            if (qntEsp12 > 1) {
                                cartas = null;
                                break;
                            }
                            break;
                        default:
                            qntEsp13 += 1;
                            if (qntEsp13 > 1) {
                                cartas = null;
                                break;
                            }
                            break;
                    }   break;
                case "COPAS":
                    switch (cartas[numero].getNumero()) {
                        case 1:
                            qntCop1 += 1;
                            if (qntCop1 > 1) {
                                cartas = null;
                                break;
                            }
                            break;
                        case 2:
                            qntCop2 += 1;
                            if (qntCop2 > 1) {
                                cartas = null;
                                break;
                            }
                            break;
                        case 3:
                            qntCop3 += 1;
                            if (qntCop3 > 1) {
                                cartas = null;
                                break;
                            }
                            break;
                        case 4:
                            qntCop4 += 1;
                            if (qntCop4 > 1) {
                                cartas = null;
                                break;
                            }
                            break;
                        case 5:
                            qntCop5 += 1;
                            if (qntCop5 > 1) {
                                cartas = null;
                                break;
                            }
                            break;
                        case 6:
                            qntCop6 += 1;
                            if (qntCop6 > 1) {
                                cartas = null;
                                break;
                            }
                            break;
                        case 7:
                            qntCop7 += 1;
                            if (qntCop7 > 1) {
                                cartas = null;
                                break;
                            }
                            break;
                        case 8:
                            qntCop8 += 1;
                            if (qntCop8 > 1) {
                                cartas = null;
                                break;
                            }
                            break;
                        case 9:
                            qntCop9 += 1;
                            if (qntCop9 > 1) {
                                cartas = null;
                                break;
                            }
                            break;
                        case 10:
                            qntCop10 += 1;
                            if (qntCop10 > 1) {
                                cartas = null;
                                break;
                            }
                            break;
                        case 11:
                            qntCop11 += 1;
                            if (qntCop11 > 1) {
                                cartas = null;
                                break;
                            }
                            break;
                        case 12:
                            qntCop12 += 1;
                            if (qntCop12 > 1) {
                                cartas = null;
                                break;
                            }
                            break;
                        default:
                            qntCop13 += 1;
                            if (qntCop13 > 1) {
                                cartas = null;
                                break;
                            }
                            break;
                    }   break;
                case "OURO":
                    switch (cartas[numero].getNumero()) {
                        case 1:
                            qntOuro1 += 1;
                            if (qntOuro1 > 1) {
                                cartas = null;
                                break;
                            }
                            break;
                        case 2:
                            qntOuro2 += 1;
                            if (qntOuro2 > 1) {
                                cartas = null;
                                break;
                            }
                            break;
                        case 3:
                            qntOuro3 += 1;
                            if (qntOuro3 > 1) {
                                cartas = null;
                                break;
                            }
                            break;
                        case 4:
                            qntOuro4 += 1;
                            if (qntOuro4 > 1) {
                                cartas = null;
                                break;
                            }
                            break;
                        case 5:
                            qntOuro5 += 1;
                            if (qntOuro5 > 1) {
                                cartas = null;
                                break;
                            }
                            break;
                        case 6:
                            qntOuro6 += 1;
                            if (qntOuro6 > 1) {
                                cartas = null;
                                break;
                            }
                            break;
                        case 7:
                            qntOuro7 += 1;
                            if (qntOuro7 > 1) {
                                cartas = null;
                                break;
                            }
                            break;
                        case 8:
                            qntOuro8 += 1;
                            if (qntOuro8 > 1) {
                                cartas = null;
                                break;
                            }
                            break;
                        case 9:
                            qntOuro9 += 1;
                            if (qntOuro9 > 1) {
                                cartas = null;
                                break;
                            }
                            break;
                        case 10:
                            qntOuro10 += 1;
                            if (qntOuro10 > 1) {
                                cartas = null;
                                break;
                            }
                            break;
                        case 11:
                            qntOuro11 += 1;
                            if (qntOuro11 > 1) {
                                cartas = null;
                                break;
                            }
                            break;
                        case 12:
                            qntOuro12 += 1;
                            if (qntOuro12 > 1) {
                                cartas = null;
                                break;
                            }
                            break;
                        default:
                            qntOuro13 += 1;
                            if (qntOuro13 > 1) {
                                cartas = null;
                                break;
                            }
                            break;
                    }   break;
                case "PAUS":
                    switch (cartas[numero].getNumero()) {
                        case 1:
                            qntPaus1 += 1;
                            if (qntPaus1 > 1) {
                                cartas = null;
                                break;
                            }
                            break;
                        case 2:
                            qntPaus2 += 1;
                            if (qntPaus2 > 1) {
                                cartas = null;
                                break;
                            }
                            break;
                        case 3:
                            qntPaus3 += 1;
                            if (qntPaus3 > 1) {
                                cartas = null;
                                break;
                            }
                            break;
                        case 4:
                            qntPaus4 += 1;
                            if (qntPaus4 > 1) {
                                cartas = null;
                                break;
                            }
                            break;
                        case 5:
                            qntPaus5 += 1;
                            if (qntPaus5 > 1) {
                                cartas = null;
                                break;
                            }
                            break;
                        case 6:
                            qntPaus6 += 1;
                            if (qntPaus6 > 1) {
                                cartas = null;
                                break;
                            }
                            break;
                        case 7:
                            qntPaus7 += 1;
                            if (qntPaus7 > 1) {
                                cartas = null;
                                break;
                            }
                            break;
                        case 8:
                            qntPaus8 += 1;
                            if (qntPaus8 > 1) {
                                cartas = null;
                                break;
                            }
                            break;
                        case 9:
                            qntPaus9 += 1;
                            if (qntPaus9 > 1) {
                                cartas = null;
                                break;
                            }
                            break;
                        case 10:
                            qntPaus10 += 1;
                            if (qntPaus10 > 1) {
                                cartas = null;
                                break;
                            }
                            break;
                        case 11:
                            qntPaus11 += 1;
                            if (qntPaus11 > 1) {
                                cartas = null;
                                break;
                            }
                            break;
                        case 12:
                            qntPaus12 += 1;
                            if (qntPaus12 > 1) {
                                cartas = null;
                                break;
                            }
                            break;
                        default:
                            qntPaus13 += 1;
                            if (qntPaus13 > 1) {
                                cartas = null;
                                break;
                            }
                            break;
                    }   break;
                default:
                    break;
            }
            numero++;
        }
    }
}
