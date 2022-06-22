package program;

import java.util.Scanner;

import entities.Product;

public class ProgramProduct {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Entre com os dados do produto: ");
		System.out.println("Nome: ");
		String name = scanner.nextLine();
		System.out.println("Pre�o: ");
		double price = scanner.nextDouble();
		System.out.println("Quantidade em estoque: ");
		int quantity = scanner.nextInt();

		Product product = new Product(name, price, quantity);

		product.setName("Computador");
		System.out.println("Nome atualizado: " + product.getName());
		product.setPrice(1200.00);
		System.out.println("Preço atualizado: " + product.getPrice());

		System.out.println();
		System.out.println("Dados do produto: " + product);

		System.out.println();
		System.out.println("Insira o número de produtos que deseja adicionar ao estoque: ");
		quantity = scanner.nextInt();
		product.addProducts(quantity);

		System.out.println();
		System.out.println("Dados atualizados: " + product);

		System.out.println();
		System.out.println("Insira o número de produtos que deseja remover ao estoque: ");
		quantity = scanner.nextInt();
		product.removeProducts(quantity);

		System.out.println();
		System.out.println("Dados atualizados: " + product);

		scanner.close();

	}
}