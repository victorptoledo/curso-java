package program14;

import entities14.Employee;
import entities14.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Employee> employeeList = new ArrayList<Employee>();

        System.out.println("Enter the number of employees: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            
            System.out.println();
            System.out.println("Employee #" + i + " data: ");

            System.out.print("Outsourced (y/n)? ");
            char ch = scanner.next().charAt(0);

            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();

            System.out.print("Hours: ");
            int hours = scanner.nextInt();

            System.out.print("Value per hour: ");
            double valuePerHour = scanner.nextDouble();

            if (ch == 'y') {
                System.out.print("Additional charge: ");
                double additionalCharge = scanner.nextDouble();
                employeeList.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
            } else {
                employeeList.add(new Employee(name, hours, valuePerHour));
            }
        }

        System.out.println();
        System.out.println("PAYMENTS: ");
        for (Employee employee : employeeList) {
            System.out.println(employee.getName() + " - R$ " + String.format("%.2f", employee.payment()));
        }
        scanner.close();
    }
}
