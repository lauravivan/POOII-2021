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
public class Sofa extends Movel {
    private int qndLugares;
    private boolean ocupado;
    private int qndLugaresOcupados;
    
    public Sofa(String nome, String cor, double dimensao, String material, int qndLugares) 
                     throws Exception {
        super(nome, cor, dimensao, material);
        setQndLugares(qndLugares);
    }
    
    public int getQndLugares() {
        return this.qndLugares;
    }
    
    public void setQndLugares(int qndLugares) throws Exception {
        if (qndLugares > 0 && qndLugares <= 6) {
            this.qndLugares = qndLugares;
        } else {
            throw new Exception("Valor inválido!");
        }
    }
    
    public boolean isOcupado() {
        return this.ocupado;
    }
    
    private void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
    
    private int getQndLugaresOcupados() {
        return this.qndLugaresOcupados;
    }
    
    private void setQndLugaresOcupados(int qndLugaresOcupados) {
        this.qndLugaresOcupados = qndLugaresOcupados;
    }
    
    public void sentaNoSofa() throws Exception {
        if (this.getQndLugares() > this.getQndLugaresOcupados()) {
            this.setQndLugaresOcupados(this.getQndLugaresOcupados() + 1);
        } else {
            setOcupado(true);
            throw new Exception("O sofá já está todo ocupado");
        }
    }
    
    public void saiDoSofa() throws Exception {
        if (this.getQndLugaresOcupados() > 0) {
            this.setQndLugaresOcupados(this.getQndLugaresOcupados() - 1);
        } else {
            setOcupado(false);
            throw new Exception("Não há ninguém no sofá");
        }
    }
    
    public void mostraQndLugaresDisponiveis() {
        int lugaresDisponiveis = this.getQndLugares() - this.getQndLugaresOcupados();
        if (lugaresDisponiveis == 0) {
            System.out.println("Não restam mais lugares");
        } else {
            System.out.println("Ainda restam " + lugaresDisponiveis + " lugares");
        }
    }
}
