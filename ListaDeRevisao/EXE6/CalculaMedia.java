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
@FunctionalInterface
public interface CalculaMedia {
    
    /**
     *
     * @param nota1
     * @param nota2
     * @param nota3
     * @return 
     */
    public float calcular(float nota1, float nota2, float nota3);
}
