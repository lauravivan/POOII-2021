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
public class Cadeira extends Movel {
    private Mesa mesa;
    private boolean ocupada;
    
    public Cadeira(String nome, String cor, double dimensao, String material) {
        super(nome, cor, dimensao, material);
    }
    
    public Mesa getMesa() {
        return this.mesa;
    }
    
    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }
    
    private boolean isOcupada() {
        return this.ocupada;
    }
    
    private void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }
    
    public void sentaNaCadeira() throws Exception {
        if (this.isOcupada()) {
            throw new Exception("A cadeira está ocupada");
        } else {
            this.setOcupada(true);
        }
    }
    
    public void saiDaCadeira() throws Exception {
        if (this.isOcupada()) {
            this.setOcupada(false);
        } else {
            throw new Exception("A cadeira está livre");
        }
    }
}
