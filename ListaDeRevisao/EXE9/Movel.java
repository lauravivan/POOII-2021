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
public class Movel {
    private String nome;
    private double valor;
    private String descricao;
    private String cor;
    private double dimensao;
    private String material;
    
    public Movel(String nome, String cor, double dimensao, String material) {
        setNome(nome);
        setCor(cor);
        setDimensao(dimensao);
        setMaterial(material);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getDimensao() {
        return this.dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    @Override
    public String toString() {
        return "Nome: " + this.getNome()
                + "Descrição: " + this.getDescricao()
                + "Valor: " + this.getValor()
                + "Cor: " + this.getCor()
                + "Dimensão: " + this.getDimensao()
                + "Material: " + this.getMaterial();
    }
}
