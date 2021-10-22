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
public class ProvaPOOII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Data data = new Data(10, 10, 2010);
        Cachorro meuDog = new Cachorro("Jobs", data);
        
        meuDog.acordar();
        meuDog.sentar();
        System.out.println(meuDog.isDeitado());
        
        Data dataDeNascimento = new Data(10, 10, 2010);
        Cachorro meuCachorro = new Cachorro("Jobs", dataDeNascimento);
        System.out.printf("O gasto semanal com alimentação foi: %.2f%n", 
        (meuCachorro.calculaGastoComAlimentacao((racao, petiscos) -> 
                ((racao + petiscos) * 7) * 4, 
                    50, 10)));
        
        Data dataDeNascimento = new Data(3, 2, 2015);
        Gato meuGato = new Gato("Goblin", dataDeNascimento);
        System.out.printf("O gasto mensal com alimentação foi: %.3f%n", 
        (meuGato.calculaGastoComAlimentacao((racao, petiscos) -> 
                (racao + petiscos) * 7, 
                    50, 10)));
        
        try {
            Data dataDeNascimento = new Data(14, 10, 2000);
            Hamster meuHamster = new Hamster("Snow", dataDeNascimento, true);
            meuHamster.fazAniversario();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        Data dataDeNascimento = new Data(14, 10, 2015);
        Hamster meuHamster = new Hamster("Snow", dataDeNascimento, true);
        meuHamster.fazAniversario();
        System.out.println(meuHamster.getIdade());
        
        try {
            Data data3 = new Data(40, 10, 2021);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        try {
            Data data2 = new Data(22, 10, 2019);
            Gato gato = new Gato("Freddy", data2);
            
            DataHora horaDaMorte = new DataHora(new Data(22, 10, 2018), new Hora(16, 59));
            gato.setDataDeMorte(horaDaMorte);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
        Data minhaData = new Data(22, 10, 2021);
        Hora minhaHora = new Hora(17, 03);
        DataHora minhaDataHora = new DataHora(minhaData, minhaHora);
        
        System.out.println(minhaData.toString());
        System.out.println(minhaHora.toString());
        System.out.println(minhaDataHora.toString());
        
    }
    
}
