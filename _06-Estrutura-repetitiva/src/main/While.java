package main;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int x;
		int soma = 0;

		System.out.println("Digite o valor que deseja somar: (0 encerra o programa)");
		x = scanner.nextInt();

		while (x != 0) {
			soma += x;
			System.out.println("Digite o valor que deseja somar: ");
			x = scanner.nextInt();
		}

		System.out.println("A soma dos valores é: " + soma);

		scanner.close();

	}

}