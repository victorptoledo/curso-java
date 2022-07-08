package program14;

import entities14.Circle;
import entities14.Rectangle;
import entities14.Shape;
import enums14.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Shape> shapeList = new ArrayList<Shape>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println();
            System.out.println("Shape #" + i + " data");

            System.out.print("Rectangle or Circle (r/c)? ");
            char shapeChar = sc.next().charAt(0);

            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());

            if (shapeChar == 'r' || shapeChar == 'R') {

                System.out.print("Width: ");
                Double width = sc.nextDouble();

                System.out.print("Height: ");
                Double height = sc.nextDouble();

                shapeList.add(new Rectangle(color, width, height));

            } else if (shapeChar == 'c' || shapeChar == 'C') {

                System.out.print("Radius: ");
                Double radius = sc.nextDouble();

                shapeList.add(new Circle(color, radius));
            }
        }

        System.out.println();
        System.out.println("SHAPE AREAS: ");
        for (Shape shape : shapeList) {
            System.out.printf(" %.2f%n", shape.area());
        }

        sc.close();
    }
}
