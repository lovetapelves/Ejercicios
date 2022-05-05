package problemas;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cantidadVeces = 0;
		do {
			System.out.println("por favor digite un numero entre 0 y 5");
			cantidadVeces = sc.nextInt();
		} while (cantidadVeces > 5 || cantidadVeces < 0);
		for (int i = 0; i < cantidadVeces; i++) {
			System.out.println("Hola mundo.");
		}
	}
}
