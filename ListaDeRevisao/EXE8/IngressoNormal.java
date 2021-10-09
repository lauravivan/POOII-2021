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
public class IngressoNormal extends Ingresso {
    
    public IngressoNormal(float valorEmReais) throws Exception {
        super(valorEmReais);
    }

    public void imprimeIngressoNormal() {
        System.out.println("INGRESSO NORMAL");
    }
}
