/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EXE9;

/**
 *
 * @author laura
 */
public class Cama extends Movel {
    private String tipo;
    private boolean arrumada;
    private int qndTravesseiros;
    
    public Cama(String nome, String cor, double dimensao, String material, String tipo) {
        super(nome, cor, dimensao, material);
        setTipo(tipo);
    }
    
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public boolean isArrumada() {
        return this.arrumada;
    }
    
    public void setArrumada(boolean arrumada) {
        this.arrumada = arrumada;
    }
    
    public int getQndTravesseiros() {
        return this.qndTravesseiros;
    }
    
    private void setQndTravesseiros(int qndTravesseiros) {
        if (qndTravesseiros > 0 && qndTravesseiros <= 6) {
            this.qndTravesseiros = qndTravesseiros;
        }
    }
    
    public void adicionarTravesseiro() throws Exception {
        if (this.getQndTravesseiros() == 6) {
            throw new Exception("Você não pode mais adicionar travesseiros");
        } else {
            this.setQndTravesseiros(this.getQndTravesseiros() + 1);
        }
    }
    
    public void retirarTravesseiro() throws Exception {
        if (this.getQndTravesseiros() > 0) {
            this.setQndTravesseiros(this.getQndTravesseiros() - 1);
        } else {
            throw new Exception("Não há mais travesseiros na cama");
        }
    }
    
    public void arrumarCama() throws Exception {
        if (this.isArrumada()) {
            throw new Exception("A cama já está arrumada");
        } else {
            this.setArrumada(true);
        }
    }
}
