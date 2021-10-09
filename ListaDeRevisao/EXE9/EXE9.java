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
public class EXE9 {
    
    public static void main(String[] args) {
        
        try {
            Sofa meuSofa = new Sofa("Sofá da Laura", "amarelo", 200, "suede", 3);
            meuSofa.sentaNoSofa();
            meuSofa.mostraQndLugaresDisponiveis();
            meuSofa.sentaNoSofa();
            meuSofa.sentaNoSofa();
            meuSofa.mostraQndLugaresDisponiveis();
            meuSofa.sentaNoSofa();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        try {
            Sofa meuSofa = new Sofa("Sofá da Laura", "amarelo", 200, "suede", 3);
            meuSofa.sentaNoSofa();
            meuSofa.saiDoSofa();
            meuSofa.mostraQndLugaresDisponiveis();
            meuSofa.saiDoSofa();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        try {
            Cama minhaCama = new Cama("Cama da Laura", "marrom", 200, "madeira", "solteiro");
            minhaCama.arrumarCama();
            System.out.println(minhaCama.isArrumada());
            minhaCama.arrumarCama();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        try {
            Cama minhaCama = new Cama("Cama da Laura", "marrom", 200, "madeira", "solteiro");
            minhaCama.adicionarTravesseiro();
            minhaCama.adicionarTravesseiro();
            minhaCama.adicionarTravesseiro();
            minhaCama.adicionarTravesseiro();
            minhaCama.adicionarTravesseiro();
            minhaCama.adicionarTravesseiro();
            minhaCama.adicionarTravesseiro();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        try {
            Cadeira minhaCadeira = 
                    new Cadeira("Cadeira da Laura", "branca", 200, "madeira");
            minhaCadeira.sentaNaCadeira();
            minhaCadeira.saiDaCadeira();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        try {
            Cadeira[] minhasCadeiras = new Cadeira[3];
            minhasCadeiras[0] = new Cadeira("Cadeira 1", "preta", 200, "metal");
            minhasCadeiras[1] = new Cadeira("Cadeira 2", "preta", 200, "metal");
            minhasCadeiras[2] = new Cadeira("Cadeira 3", "preta", 200, "metal");
            
            Mesa minhaMesa = 
                    new Mesa("Mesa da Laura", "branca", 200, "madeira", minhasCadeiras);
            minhaMesa.mostrarQndLugaresDisponiveis();
            minhaMesa.sentarAMesa();
            minhaMesa.sentarAMesa();
            minhaMesa.sentarAMesa();
            minhaMesa.sentarAMesa();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        try {
            Cadeira[] minhasCadeiras = new Cadeira[3];
            minhasCadeiras[0] = new Cadeira("Cadeira 1", "preta", 200, "metal");
            minhasCadeiras[1] = new Cadeira("Cadeira 2", "preta", 200, "metal");
            minhasCadeiras[2] = new Cadeira("Cadeira 3", "preta", 200, "metal");
            
            Mesa minhaMesa = 
                    new Mesa("Mesa da Laura", "branca", 200, "madeira", minhasCadeiras);
            minhaMesa.mostrarQndLugaresDisponiveis();
            minhaMesa.sentarAMesa();
            minhaMesa.sairDaMesa();
            minhaMesa.sairDaMesa();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        try {
            Cadeira[] minhasCadeiras = new Cadeira[3];
            minhasCadeiras[0] = new Cadeira("Cadeira 1", "preta", 200, "metal");
            minhasCadeiras[1] = new Cadeira("Cadeira 2", "preta", 200, "metal");
            minhasCadeiras[2] = new Cadeira("Cadeira 3", "preta", 200, "metal");
            
            Mesa minhaMesa = 
                    new Mesa("Mesa da Laura", "branca", 200, "madeira", minhasCadeiras);
            minhaMesa.mostrarQndLugaresDisponiveis();
            minhaMesa.sentarAMesa();
            minhaMesa.sentarAMesa();
            minhaMesa.sentarAMesa();
            minhaMesa.mostrarQndLugaresDisponiveis();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        try {
            Estante minhaEstante = new Estante("Estante da Laura", "roxo", 200, "madeira", 10);
            String[] minhasCoisas = new String[200];
            minhaEstante.setArtefatos(minhasCoisas);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        
        try {
            Estante minhaEstante = new Estante("Estante da Laura", "roxo", 200, "madeira", 10);
            String[] minhasCoisas = new String[2];
            minhaEstante.setArtefatos(minhasCoisas);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
