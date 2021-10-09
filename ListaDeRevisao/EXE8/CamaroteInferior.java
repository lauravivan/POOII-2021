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
public class CamaroteInferior extends IngressoVIP {
    private int localizacao;
    
    public CamaroteInferior(float valorEmReais, float valorAdicional, int localizacao) throws Exception {
        super(valorEmReais, valorAdicional);
        setLocalizacao(localizacao);
    }
    
    public int getLocalizacao() {
        return this.localizacao;
    }
    
    public void setLocalizacao(int localizacao) throws Exception {
        if (localizacao > 0) {
            this.localizacao = localizacao;
        } else {
            throw new Exception("O valor que você está tentando informar é inválido!");
        }
    }
    
    public void imprimeLocalizacao() {
        System.out.println("CADEIRA " + this.getLocalizacao());
    } 
}
