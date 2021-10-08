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
public class EXE6 {
    
    public static void main(String[] args) {
        try {
            Estudante eu = new Estudante("Laura", 9f, 7.5f, 8f);
    
            System.out.printf(eu.getNome() + " ficou com média %.2f%n", 
                    (eu.calcularMedia((nota1, nota2, nota3) -> 
                            (0.4f * nota1) + (0.4f * nota2) + (0.2f * nota3), 
                                eu.getNota1(), eu.getNota2(), eu.getNota3())));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        try {
            Estudante eu = new Estudante("Laura", 9f, 7.5f, 8f);
            eu.atribuirPontoExtra(1, 10f);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        try {
            Estudante eu = new Estudante("Laura", -1f, 7.5f, 8f);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        try {
            Estudante eu = new Estudante("Laura", 9f, 7.5f, 15f);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        try {
            Estudante eu = new Estudante("Laura", 7f, 6f, 8.5f);
    
            System.out.printf(eu.getNome() + " ficou com média %.2f%n", 
                    (eu.calcularMedia((nota1, nota2, nota3) -> 
                            (nota1 + nota2 + nota3) / 3, 
                                eu.getNota1(), eu.getNota2(), eu.getNota3())));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        try {
            Estudante eu = new Estudante("Laura", 7f, 6f, 8.5f);
            eu.atribuirPontoExtra(0, 7f);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
