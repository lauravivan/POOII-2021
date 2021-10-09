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
public class Estante extends Movel {
    private boolean vazia;
    private int qndDeNichos;
    private boolean organizada;
    private String[] artefatos;
    
    public Estante(String nome, String cor, double dimensao, String material, 
            int qndDeNichos) throws Exception {
        super(nome, cor, dimensao, material);
        setQndDeNichos(qndDeNichos);
    }
    
    public boolean isVazia() {
        return this.vazia;
    }
    
    public void setVazia(boolean vazia) throws Exception {
        if (this.getArtefatos() == null) {
            this.vazia = vazia;
        } else {
            throw new Exception("A estante não está vazia");
        }
    }
    
    public int getQndDeNichos() {
        return this.qndDeNichos;
    }
    
    public void setQndDeNichos(int qndDeNichos) throws Exception {
        if (qndDeNichos > 0 && qndDeNichos <= 20) {
            this.qndDeNichos = qndDeNichos;
        } else {
            throw new Exception("Valor inválido!");
        }
    }
    
    public boolean isOrganizada() {
        return this.organizada;
    }
    
    private void setOrganizada(boolean organizada) {
        this.organizada = organizada;
    }
    
    public String[] getArtefatos() {
        return this.artefatos;
    }
    
    public void setArtefatos(String[] artefatos) throws Exception {
        this.artefatos = new String[this.getQndDeNichos() * 3];
        
        int flag = 1;
        for(int i = 0; i < artefatos.length; i++) {
            if (artefatos[i] == null) {
                flag = 0;
            }
        }
        
        if (artefatos.length > this.artefatos.length) {
            throw new ArrayIndexOutOfBoundsException("Você não tem espaço na estante para"
                    + " isso");
        } else if (artefatos == null) {
            throw new Exception("Você precisa colocar algo na estante");
        } else if (flag == 0) {
            throw new Exception("Você precisa colocar algo na estante");
        } else {
            this.artefatos = artefatos;
        }
    }
    
    public void organizaEstante() throws Exception {
        if (this.isOrganizada()) {
            throw new Exception("A sua estante já está organizada");
        } else if (this.isVazia()) {
            throw new Exception("A sua estante ainda está vazia! Coloque algo nela :)");
        } else {
            setOrganizada(true);
        }
    }
    
    @Override
    public String toString() {
        String estante = "Sua estante: \n";
        for (String artefato : artefatos) {
            estante += artefato + "\n";
        }
        return estante;
    }
    
}
