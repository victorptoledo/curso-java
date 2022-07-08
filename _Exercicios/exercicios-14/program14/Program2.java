package program14;

import entities14.Pessoa;
import entities14.PessoaFisica;
import entities14.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Pessoa> listPessoa = new ArrayList<Pessoa>();
        Double soma = 0.0;

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println();
            System.out.println("Tax payer #" + i + " data: ");

            System.out.print("Individual or company (i/c)? ");
            char tipoPessoa = sc.next().charAt(0);
            sc.nextLine();

            if (tipoPessoa == 'i' || tipoPessoa == 'I') {
                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Anual income: ");
                Double rendaAnual = sc.nextDouble();

                System.out.print("Health expenditures: ");
                Double gastosSaude = sc.nextDouble();

                listPessoa.add(new PessoaFisica(name, rendaAnual, gastosSaude));

            } else if (tipoPessoa == 'c' || tipoPessoa == 'C') {

                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Anual income: ");
                Double rendaAnual = sc.nextDouble();

                System.out.print("Number of employees: ");
                int numeroEmpregados = sc.nextInt();

                listPessoa.add(new PessoaJuridica(name, rendaAnual, numeroEmpregados));
            }
        }

        System.out.println();
        System.out.println("TAXES PAID: ");
        for (Pessoa pessoa : listPessoa) {
            soma = soma += pessoa.calculaImposto();
            System.out.println(pessoa);
        }

        System.out.println();
        System.out.println("TOTAL TAXES: R$ " + soma);

        sc.close();
    }
}
