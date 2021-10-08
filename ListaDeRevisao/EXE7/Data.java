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
public class Data {
    private int dia;
    private int mes;
    private int ano;
    private String lembrete = "";
    
    public Data(int dia, int mes, int ano) throws Exception {
        setDia(dia);
        setMes(mes);
        setAno(ano);
    }
    
    public int getDia() {
        return this.dia;
    }
    
    public void setDia(int dia) throws Exception {
        if (dia > 0 && dia < 32) {
            this.dia = dia;
        } else {
            throw new Exception("ERRO: parece que você está tentando me passar"
                    + " um dia inválido!");
        }
    }
    
    public int getMes() {
        return this.mes;
    }
    
    public void setMes(int mes) throws Exception {
        if (mes > 0 && mes < 13) {
            this.mes = mes;
        } else {
            throw new Exception("ERRO: parece que você está tentando me passar"
                    + " um mês inválido!");
        }
    }
    
    public int getAno() {
        return this.ano;
    }
    
    public void setAno(int ano) throws Exception {
        if (ano <= 2021) {
            this.ano = ano;
        } else {
            throw new Exception("ERRO: parece que você está tentando me passar"
                    + " um ano inválido!");
        }
    }
    
    public String getLembrete() {
        return this.lembrete;
    }
    
    public void setLembrete(String msg) {
        lembrete += this.toString() + ": " + msg;
    }
    
    public void marcaLembreteComHora(String msg, Hora hora) {
        lembrete = "";
        lembrete += this.toString() + ", " + hora.toString() + ": " + msg;
    }
    
    public void mostraLembreteComHora() {
        System.out.println(this.lembrete);
    }
    
    @Override
    public String toString() {
        return this.getDia() + "/" + this.getMes() + "/" + this.getAno();
    }
}
