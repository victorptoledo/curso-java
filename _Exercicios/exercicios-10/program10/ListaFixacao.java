package program10;

import entity10.Empregado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaFixacao {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Empregado> listaEmpregados = new ArrayList<>();

        System.out.print("Quantos funcionários vão ser registrados? ");
        int empregados = scanner.nextInt();

        for (int i = 0; i < empregados; i++) {

            System.out.println("Funcionário #" + i + ":");

            System.out.print("Id: ");
            int id = scanner.nextInt();
            while (temId(listaEmpregados, id)) {
                System.out.println("Id já existe. Tente novamente:");
                id = scanner.nextInt();
            }

            System.out.print("Nome: ");
            scanner.nextLine();
            String name = scanner.nextLine();

            System.out.print("Salário: ");
            double salario = scanner.nextDouble();

            listaEmpregados.add(new Empregado(id, name, salario));
        }

        System.out.println();
        System.out.print("Insira o ID do funcionário que deseja aumentar o salário: ");
        int id = scanner.nextInt();
        Empregado buscaId = listaEmpregados.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (buscaId == null) {
            System.out.println("Esse id não existe");
        } else {
            System.out.print("Insira a porcentagem: ");
            double porcentagem = scanner.nextDouble();
            buscaId.aumentaSalario(porcentagem);
        }

        System.out.println();
        System.out.println("Lista de empregados: ");
        for (Empregado x : listaEmpregados) {
            System.out.println(x.toString());
        }
        scanner.close();
    }

    public static boolean temId(List<Empregado> list, int id) {
        Empregado emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
