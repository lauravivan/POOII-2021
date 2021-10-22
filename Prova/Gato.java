/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provapooii;

import java.util.Calendar;

/**
 *
 * @author laura
 */
public class Gato extends Mamifero {
    private boolean peludo;
    private String corDosOlhos;
    
    public Gato(String nome, Data dataDeNascimento) throws Exception {
        super(nome, dataDeNascimento);
    } 

    public boolean isPeludo() {
        return this.peludo;
    }

    public void setPeludo(boolean peludo) {
        this.peludo = peludo;
    }

    public String getCorDosOlhos() {
        return this.corDosOlhos;
    }

    public void setCorDosOlhos(String corDosOlhos) {
        this.corDosOlhos = corDosOlhos;
    }

    public void subirNoMovel() {
        System.out.println(this.getNome() + " subiu no móvel");
    }
    
    public void saltarDoMovel() {
        System.out.println(this.getNome() + " desceu do móvel");
    }
    
    public void miar() {
        System.out.println(this.getNome() + " está miando");
    }
}
