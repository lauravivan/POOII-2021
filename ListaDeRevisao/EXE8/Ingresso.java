/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EXE8;

/**
 *
 * @author laura
 */
public class Ingresso {
    private float valorEmReais;
    
    public Ingresso(float valorEmReais) throws Exception {
        setValorEmReais(valorEmReais);
    }
    
    public float getValorEmReais() {
        return this.valorEmReais;
    }
    
    public void setValorEmReais(float valorEmReais) throws Exception {
        if (valorEmReais > 0) {
            this.valorEmReais = valorEmReais;
        } else {
            throw new Exception("Tente informar um valor válido para o ingresso");
        }
    }
    
    public void imprimeValor() {
        System.out.printf("O ingresso custa R$%.2f%n", this.getValorEmReais());
    }
}
