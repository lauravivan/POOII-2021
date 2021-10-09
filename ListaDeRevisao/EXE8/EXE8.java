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
public class EXE8 {
    
    public static void main (String[] args) {
        
        try {
            new IngressoNormal(-1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        try {
            new IngressoVIP(400, 100);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        try {
            IngressoVIP meuIngressoVip = new IngressoVIP(80, 70);
            System.out.println(meuIngressoVip.valorDoIngressoVIP());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        try {
            CamaroteInferior meuCamarote = new CamaroteInferior(80, 70, 20);
            meuCamarote.imprimeLocalizacao();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        try {
            CamaroteSuperior meuCamarote = new CamaroteSuperior(80, 70, 100);
            System.out.println(meuCamarote.valorDoIngresso());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
