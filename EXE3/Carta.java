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
public final class Carta {
    public String naipe;
    private int numero;

    public Carta(String naipe, int numero) throws Exception { 
        setNaipe(naipe);
        setNumero(numero);
    }
 
    public String getNaipe() {
        return this.naipe;
    }

    public void setNaipe(String naipe) throws Exception {
    	if (naipe.toUpperCase().equals("ESPADAS") || naipe.toUpperCase().equals("PAUS") ||
            naipe.toUpperCase().equals("COPAS") || naipe.toUpperCase().equals("OURO")) {
            this.naipe = naipe;
    	} else {
            throw new Exception("Erro: parece que você está tentando usar um naipe"
                    + " que não existe!");
        }
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) throws Exception {
    	if (numero > 0 && numero <= 13) {
            this.numero = numero;
    	} else {
            throw new Exception ("Erro: parece que você está tentando usar um número"
                    + " de carta que não existe!");
        }
    }
    
    @Override
    public String toString() {
        return String.valueOf(this.getNumero()) + " de " + this.getNaipe();
    }
}
