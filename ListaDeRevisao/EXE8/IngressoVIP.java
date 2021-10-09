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
public class IngressoVIP extends Ingresso {
    private float valorAdicional;
    
    public IngressoVIP(float valorEmReais, float valorAdicional) throws Exception {
        super(valorEmReais);
        setValorAdicional(valorAdicional);
    }
    
    public float getValorAdicional() {
        return this.valorAdicional;
    }
    
    public void setValorAdicional(float valorAdicional) throws Exception {
        if (valorAdicional > 0) {
            this.valorAdicional = valorAdicional;
        } else {
            throw new Exception("Tente informar um valor válido para o adicional!");
        }
    }
    
    public float valorDoIngressoVIP() {
        float valorDoIngresso = this.getValorEmReais() + this.getValorAdicional();
        return valorDoIngresso;
    }
}
