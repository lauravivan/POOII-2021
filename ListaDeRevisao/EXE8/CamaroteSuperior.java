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
public class CamaroteSuperior extends IngressoVIP {
    private float valorAdicional;
    
    public CamaroteSuperior(float valorEmReais, float ValorAdicional, float valorAdicional) throws Exception {
        super(valorEmReais, valorAdicional);
        setValorAdicional(valorAdicional);
    }
    
    public float getValorAdicional() {
        return this.valorAdicional;
    }
    
    public void setValorAdicional(float valorAdicional) throws Exception {
        if (valorAdicional > 0) {
            this.valorAdicional = valorAdicional;
        } else {
            throw new Exception("Informe um valor válido por favor!");
        }
    }
    
    public float valorDoIngresso() {
        float valorDoIngresso = this.valorDoIngressoVIP() + this.valorAdicional;      
        return valorDoIngresso;
    }
}
