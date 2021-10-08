/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EXE6;

/**
 *
 * @author laura
 */
public class Estudante {
    private String nome;
    private float nota1, nota2, nota3;
    
    public Estudante(String nome, float nota1, float nota2, float nota3) throws Exception {
        setNome(nome);
        setNota1(nota1);
        setNota2(nota2);
        setNota3(nota3);
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public float getNota1() {
        return this.nota1;
    }
    
    public void setNota1(float nota) throws Exception {
        if (nota >= 0 && nota <= 10) {
            this.nota1 = nota;
        } else {
            throw new Exception("Erro! Parece que você está tentando me passar"
                    + " uma nota inválida!");
        }
    }
    
    public float getNota2() {
        return this.nota2;
    }
    
    public void setNota2(float nota) throws Exception {
        if (nota >= 0 && nota <= 10) {
            this.nota2 = nota;
        } else {
            throw new Exception("Erro! Parece que você está tentando me passar"
                    + " uma nota inválida!");
        }
    }
    
    public float getNota3() {
        return this.nota3;
    }
    
    public void setNota3(float nota) throws Exception {
        if (nota >= 0 && nota <= 10) {
            this.nota3 = nota;
        } else {
            throw new Exception("Erro! Parece que você está tentando me passar"
                    + " uma nota inválida!");
        }
    }
    
    public void atribuirPontoExtra(int pontoExtra, float nota) throws Exception {
        if (pontoExtra > 0 && pontoExtra <= 3) {
            if (this.nota1 == nota) {
                this.nota1 += pontoExtra;
            } else if (this.nota2 == nota) {
                this.nota2 += pontoExtra;
            } else if (this.nota3 == nota) {
                this.nota3 += pontoExtra;
            } else {
                throw new Exception("Erro: parece que você está tentando me passar "
                        + "uma nota inexistente!");
            }
        } else {
            throw new Exception("Erro: parece que você está tentando me passar um"
                    + " valor inválido como ponto extra! Tente um número de 1 à 3");
        }
    }

    public float calcularMedia(CalculaMedia calc, float nota1, float nota2, float nota3) {
        return calc.calcular(nota1, nota2, nota3);
    }
}
