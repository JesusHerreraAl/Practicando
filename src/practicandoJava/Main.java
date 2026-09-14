package practicandoJava;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola mundo este merge sera uno de los primeros");
		Scanner entrada = new Scanner(System.in);
		int opcion = 0;

		String menu = "1- Suma \n2- Resta\n0- Salir";

		do {
			System.out.println(menu);
			System.out.println("Dame una opcion");
			opcion = entrada.nextInt();

			switch (opcion) {
			case 1:
				double a, b;
				System.out.println("Eligio suma");
				System.out.println("Dame el numero");
				a = entrada.nextDouble();
				System.out.println("Dame otro numero");
				b = entrada.nextDouble();
				System.out.println("La suma es: " + suma(a, b));

				break;
			case 2:
				break;
			case 0:
				System.out.println("Adios");
				break;
			default:
				System.out.println("Opcion no valida");
				break;
			
			}

		} while (opcion != 0);

	}

	public static double suma(double a, double b) {
		double total = 0;
		total = a + b;
		return total;

	}

}
