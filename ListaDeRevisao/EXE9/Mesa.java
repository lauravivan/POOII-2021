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
public class Mesa extends Movel {
    private Cadeira[] cadeiras;
    private int qndLugaresOcupados;
    
    public Mesa(String nome, String cor, double dimensao, String material, 
            Cadeira[] cadeiras) throws Exception {
        super(nome, cor, dimensao, material);
        setCadeiras(cadeiras);
    }
    
    public Cadeira[] getCadeiras() {
        return this.cadeiras;
    }
    
    public void setCadeiras(Cadeira[] cadeiras) throws Exception {
        if (cadeiras.length >= 0 && cadeiras.length <= 10) {
            this.cadeiras = cadeiras;
        } else {
            throw new ArrayIndexOutOfBoundsException("Você está tentando adicionar "
                    + "cadeiras demais");
        }
    }
    
    private int getQndLugaresOcupados() {
        return this.qndLugaresOcupados;
    }
    
    private void setQndLugaresOcupados(int qndLugaresOcupados) {
        this.qndLugaresOcupados = qndLugaresOcupados;
    }
    
    public void sentarAMesa() throws Exception {
        if (this.getQndLugaresOcupados() < this.cadeiras.length) {
            this.setQndLugaresOcupados(this.getQndLugaresOcupados() + 1);
        } else {
            throw new Exception("A mesa já está cheia");
        }
    }
    
    public void sairDaMesa() throws Exception {
        if (this.getQndLugaresOcupados() > 0) {
            this.setQndLugaresOcupados(this.getQndLugaresOcupados() - 1);
        } else {
            throw new Exception("A mesa está vazia já");
        }
    }
    
    public void mostrarQndLugaresDisponiveis() {
        int lugaresDisponiveis = this.getCadeiras().length - getQndLugaresOcupados();
        
        if (lugaresDisponiveis == 0) {
            System.out.println("Não há lugar disponível à mesa");
        } else {
            System.out.println("Há disponíveis " + lugaresDisponiveis + " lugares à mesa");
        }
    }
    
    
}
