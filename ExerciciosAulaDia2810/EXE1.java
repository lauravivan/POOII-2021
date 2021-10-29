import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class EXE1 {

	public static void main(String[] args) {
		Set<Double> userValues = new HashSet<>();

		Scanner enterData = new Scanner(System.in);
		
		System.out.print("Informe um valor real (Insira 99 para parar): ");
		while (true) {
			Double value = enterData.nextDouble();
			if (value == 99) {
				break;
			}
			userValues.add(value);
			System.out.print("Informe um valor real (Insira 99 para parar): ");
		}
		
		enterData.close();
		
		Iterator<Double> toShowValues = userValues.iterator();
		System.out.print("\nSeus valores criados: ");
		while (toShowValues.hasNext()) {
			System.out.print(toShowValues.next() + " ");
		}
	}

}
