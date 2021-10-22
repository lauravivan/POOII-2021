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
public class Data {
    private int dia;
    private int mes;
    private int ano;
    
    public Data(int dia, int mes, int ano) throws Exception {
        setDia(dia);
        setMes(mes);
        setAno(ano);
    }

    public int getDia() {
        return this.dia;
    }

    public void setDia(int dia) throws Exception {
        if (dia > 0 && dia <= 31) {
            this.dia = dia;
        } else {
            throw new Exception("Você está tentando me passar um dia inválido!");
        }
    }

    public int getMes() {
        return this.mes;
    }

    public void setMes(int mes) throws Exception {
        if (mes > 0 && mes <= 12) {
            this.mes = mes;
        } else {
            throw new Exception("Você está tentando me passar um mês inválido!");
        }
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) throws Exception {
        Calendar anoAtual = Calendar.getInstance();
        if (ano > 0 && ano <= anoAtual.get(Calendar.YEAR)) {
            this.ano = ano;
        } else {
            throw new Exception("Você está tentando me passar um ano inválido!");
        }
    }
    
    @Override
    public String toString() {
        return this.getDia() + "/" + this.getMes() + "/" + this.getAno();
    }
    
}
