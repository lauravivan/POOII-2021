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
public class Hora {
    private int horas;
    private int minutos;
    
    public Hora(int horas, int minutos) throws Exception {
        setHoras(horas);
        setMinutos(minutos);
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) throws Exception {
        if (horas >= 00 && horas <= 23) {
            this.horas = horas;
        } else {
            throw new Exception("Você está tentando me passar horas inválidas!");
        }
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) throws Exception {
        if (minutos >= 00 && minutos <= 59) {
            this.minutos = minutos;
        } else {
            throw new Exception("Você está tentando me passar minutos inválidos!");
        }
    }
    
    @Override
    public String toString() {
        return this.getHoras() + ":" + this.getMinutos();
    }
}
