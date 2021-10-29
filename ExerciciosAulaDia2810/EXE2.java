import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EXE2 {

	public static void main(String[] args) {
		Map<String, String> contacts = new HashMap<>();
		
		Scanner enterData = new Scanner(System.in);
		int userChoice = 0;
		
		while (userChoice != 2) {
			System.out.println("\nPara adicionar um contato digite 0\n"
					+ "Para buscar por um contato digite 1\n"
					+ "Para sair digite 2");
			System.out.print("Informe aqui o número escolhido: ");
			userChoice = enterData.nextInt();
			
			switch(userChoice) {
				case 0: 
					System.out.print("\nInsira o nome do contato: ");
					String name = enterData.next();
					System.out.print("Agora informe o número do contato: ");
					String contactNumber = enterData.next();
					
					while(true) {
						if(contactNumber.matches("[0-9]+")) {
							contacts.put(name, contactNumber);
							break;
						} 
						System.out.print("Informe um número correto para o contato: ");
						contactNumber = enterData.next();
					}
					break;
				case 1:
					String userValue = "";
					System.out.print("\nVocê pode tanto buscar pelo nome como por um prefixo: ");
					userValue = enterData.next().toUpperCase();
					
					System.out.println("Foram encontrados os seguintes contatos"
							+ " com seus respectivos números de telefone: ");
					for (String contact : contacts.keySet()) {
						if (contact.toUpperCase().equals(userValue)) {
							System.out.println(contact + ": " + contacts.get(contact));
						} else if (contact.toUpperCase().contains(userValue)){
							System.out.println(contact + ": " + contacts.get(contact));
						}
					}
					break;
				case 2:
					break;
				default:
					System.out.println("Por favor, digite um número válido!");
					break;
			}
		}
		
		enterData.close();
	}

}
