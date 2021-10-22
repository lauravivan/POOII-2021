/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provapooii;



/**
 *
 * @author laura
 */
public class Cachorro extends Mamifero {
    private String porte;
    private String brinquedoPreferido;
    private boolean sentado;
    private boolean deitado;
    private Hora horaDaAlimentacao;
    
    public Cachorro(String nome, Data dataDeNascimento) throws Exception {
        super(nome, dataDeNascimento);
    }

    public String getPorte() {
        return this.porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getBrinquedoPreferido() {
        return this.brinquedoPreferido;
    }

    public void setBrinquedoPreferido(String brinquedoPreferido) {
        this.brinquedoPreferido = brinquedoPreferido;
    }

    public boolean isSentado() {
        return this.sentado;
    }

    private void setSentado(boolean sentado) {
        this.sentado = sentado;
    }

    public boolean isDeitado() {
        return this.deitado;
    }

    private void setDeitado(boolean deitado) {
        this.deitado = deitado;
    }

    public Hora getHoraDaAlimentacao() {
        return this.horaDaAlimentacao;
    }

    public void setHoraDaAlimentacao(Hora alimentar) {
        this.horaDaAlimentacao = alimentar;
    }
    
    public void latir() {
        System.out.println(this.getNome() + " está latindo");
    }
    
    public void sentar() {
        this.setSentado(true);
        this.setDeitado(false);
    }
    
    public void deitar() {
        this.setDeitado(true);
        this.setSentado(false);
    }
}
