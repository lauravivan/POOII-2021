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
public class Hamster extends Mamifero {
    private boolean exercitado;
    private boolean docil;
    private Hora horaDeFazerExercicio;
    
    public Hamster(String nome, Data dataDeNascimento, boolean docil) throws Exception {
        super(nome, dataDeNascimento);
        setDocil(docil);
    }

    public boolean isExercitado() {
        return this.exercitado;
    }

    private void setExercitado(boolean exercitado) {
        this.exercitado = exercitado;
    }

    public boolean isDocil() {
        return this.docil;
    }

    public void setDocil(boolean docil) {
        this.docil = docil;
    }  

    public Hora getHoraDeFazerExercicio() {
        return this.horaDeFazerExercicio;
    }

    public void setHoraDeFazerExercicio(Hora exercitar) {
        this.horaDeFazerExercicio = exercitar;
    }

    public void correr() {
        setExercitado(true);
    }
    
    public void tirarDaGaiola() {
        System.out.println(this.getNome() + " está fora da gaiola");
    }
    
    public void colocarNaGaiola() {
        System.out.println(this.getNome() + " está dentro da gaiola");
    }
}
