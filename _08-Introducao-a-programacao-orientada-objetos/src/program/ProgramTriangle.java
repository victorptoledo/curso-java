package program;

import java.util.Scanner;

import entities.Triangle;

public class ProgramTriangle {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Triangle x, y;
		x = new Triangle();
		y = new Triangle();

		System.out.println("Entre com os valores do triângulo X: ");
		x.a = scanner.nextDouble();
		x.b = scanner.nextDouble();
		x.c = scanner.nextDouble();

		System.out.println("Entre com os valores do triângulo Y: ");
		y.a = scanner.nextDouble();
		y.b = scanner.nextDouble();
		y.c = scanner.nextDouble();

		double areaX = x.calculaArea();
		double areaY = y.calculaArea();

		System.out.printf("�rea do triângulo X: %.4f%n", areaX);
		System.out.printf("�rea do triângulo Y: %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("A maior área é X");
		} else {
			System.out.println("A maior área é Y");
		}

		scanner.close();
	}

}