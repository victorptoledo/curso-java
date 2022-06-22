package main;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n;
		int soma = 0;

		System.out.println("Digite quantas vezes deseja repetir:");
		n = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			int x;
			System.out.println("Digite o valor:");
			x = scanner.nextInt();

			soma += x;

		}

		System.out.println("A soma dos valores é: " + soma);

		scanner.close();

	}

}