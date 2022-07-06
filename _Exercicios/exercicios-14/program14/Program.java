package program14;

import entities14.ImportedProduct;
import entities14.Product;
import entities14.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {

        List<Product> productsList = new ArrayList<Product>();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Product #" + i + " data: ");

            System.out.print("Common, used or imported (c/u/i)? ");
            char status = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            Double price = sc.nextDouble();

            if (status == 'i' || status == 'I') {
                System.out.print("Customs fee: ");
                Double customFee = sc.nextDouble();
                ImportedProduct importedProduct = new ImportedProduct(name, price, customFee);
                productsList.add(importedProduct);
            } else if (status == 'u' || status == 'U') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date manufactureDate = sdf.parse(sc.next());
                UsedProduct usedProduct = new UsedProduct(name, price, manufactureDate);
                productsList.add(usedProduct);
            } else {
                Product product = new Product(name, price);
                productsList.add(product);
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS");
        for (Product product : productsList) {
            System.out.println(product.priceTag());
        }

        sc.close();
    }
}
