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
public class DataHora {
    private Data data;
    private Hora hora;
    
    public DataHora(Data data, Hora hora) {
        setData(data);
        setHora(hora);
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Hora getHora() {
        return hora;
    }

    public void setHora(Hora hora) {
        this.hora = hora;
    }
    
    @Override
    public String toString() {
        return this.getData() + ", " + this.getHora();
    }
}
