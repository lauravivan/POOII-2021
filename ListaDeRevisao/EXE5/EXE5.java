/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EXE5;

/**
 *
 * @author laura
 */
public class EXE5 {
    
    public static void main(String[] args) {
        try {
            Estudante eu = new Estudante("Laura", 9f, 7.5f, 8f);
            eu.calcularMedia();
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
            new Estudante("Laura", -1f, 7.5f, 8f);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        try {
            new Estudante("Laura", 9f, 7.5f, 15f);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        try {
            Estudante eu = new Estudante("Laura", 9f, 7.5f, 7f);
            eu.atribuirPontoExtra(5, 7f);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
