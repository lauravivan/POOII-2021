/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provapooii;

import java.util.Calendar;
import java.util.function.BiFunction;

/**
 *
 * @author laura
 */
public abstract class Mamifero {
    private String nome;
    private int idade;
    private String corDoPelo;
    private Data dataDeNascimento;
    private String raça;
    private double peso;
    private DataHora dataDeMorte;
    private final int IDADE_MAXIMA = 18;
    private boolean dormindo;
    private boolean acordado;
    
    public Mamifero(String nome, Data dataDeNascimento) throws Exception {
        setNome(nome);
        setDataDeNascimento(dataDeNascimento);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) throws Exception {
        if (nome.isEmpty() || nome.isBlank()) {
            throw new Exception("Informe um nome válido!");
        } else {
            this.nome = nome;
        }
    }
    
    public int getIdade() {
        return this.idade;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCorDoPelo() {
        return this.corDoPelo;
    }

    public void setCorDoPelo(String corDoPelo) {
        this.corDoPelo = corDoPelo;
    }

    public Data getDataDeNascimento() {
        return this.dataDeNascimento;
    }

    public void setDataDeNascimento(Data dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
        
        Calendar anoAtual = Calendar.getInstance();
        setIdade(anoAtual.get(Calendar.YEAR) - this.getDataDeNascimento().getAno());
    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public DataHora getDataDeMorte() {
        return dataDeMorte;
    }

    public void setDataDeMorte(DataHora dataDeMorte) throws Exception {
        if ((this.getDataDeNascimento() == dataDeMorte.getData()) || 
                this.getDataDeNascimento().getAno() > dataDeMorte.getData().getAno()) {
            throw new Exception("Data inválida!");
        } else {
            this.dataDeMorte = dataDeMorte;
        }
    }

    public boolean isDormindo() {
        return this.dormindo;
    }

    private void setDormindo(boolean dormindo) {
        this.dormindo = dormindo;
    }

    public boolean isAcordado() {
        return this.acordado;
    }

    private void setAcordado(boolean acordado) {
        this.acordado = acordado;
    }
    
    public void acordar() throws Exception {
        if (this.isAcordado()) {
            throw new Exception(this.getNome() + " já está acordada(o)!");
        } else {
            setAcordado(true);
            setDormindo(false);
            System.out.println(this.getNome() + " acordou");
        }
    }
    
    public void dormir() throws Exception {
        if (this.isDormindo()) {
            throw new Exception(this.getNome() + " já está dormindo");
        } else {
            setDormindo(true);
            setAcordado(false);
            System.out.println(this.getNome() + " está dormindo");
        }
    }
    
    public void fazAniversario() throws Exception {
        if (this.getIdade() < IDADE_MAXIMA) {
            this.setIdade(this.getIdade() + 1);
        } else {
            throw new Exception("Infelizmente o seu animal passou da idade máxima");
        }
    }
    
    public static double calculaGastoComAlimentacao(BiFunction<Double, Double, Double> calc, double valorDaRacao, double valorDosPetiscos) {
        return calc.apply(valorDaRacao, valorDosPetiscos);
    }
}
