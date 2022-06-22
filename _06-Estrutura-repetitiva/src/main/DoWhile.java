package main;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		char resp;
		do {
			System.out.println("Digite a temperatura em Celsius: ");
			double C = scanner.nextDouble();
			double F = 9.0 * C / 5.0 + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
			System.out.print("Deseja repetir (s/n)? ");
			resp = scanner.next().charAt(0);
		} while (resp != 'n');

		scanner.close();
	}

}