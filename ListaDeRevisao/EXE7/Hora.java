/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EXE7;

/**
 *
 * @author laura
 */
public class Hora {
    private int horas;
    private int minutos;
    
    public Hora(int horas, int minutos) throws Exception {
        setHoras(horas);
        setMinutos(minutos);
    }
    
    public int getHoras() {
        return this.horas;
    }
    
    public void setHoras(int horas) throws Exception {
        if (horas >= 0 && horas < 24) {
            this.horas = horas;
        } else {
            throw new Exception("ERRO: você está tentando me passar horas inválidas");
        }
    }
    
    public int getMinutos() {
        return this.minutos;
    }
    
    public void setMinutos(int minutos) throws Exception {
        if (minutos >= 0 && minutos < 60) {
            this.minutos = minutos;
        } else {
            throw new Exception("ERRO: você está tentando me passar minutos inválidos");
        }
    }
    
    @Override
    public String toString() {
        return this.getHoras() + ":" + this.getMinutos();
    }
}
