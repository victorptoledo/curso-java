package application;

import java.util.ArrayList;
import java.util.List;

public class Lista {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        // Adicionar valores na lista
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");

        // Inserir em um lugar específico da lista
        list.add(2, "Marcos");

        // Mostra o tamanho da lista
        System.out.println(list.size());

        // Excluir um campo da lista com base no conteúdo
        list.remove("Anna");

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("-------------------------------------------------------------------------------------");

        // Excluir um campo da lista com base na posição
        list.remove(0);

        // Excluir um campo da lista com base na inicial (expressão Lambda)
        list.removeIf(x -> x.charAt(0) == 'M');

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("-------------------------------------------------------------------------------------");

        // Buscar posição na lista com base no conteúdo
        System.out.println("Posição do Bob na lista: " + list.indexOf("Bob"));
        System.out.println("Posição do Bob na lista: " + list.indexOf("Marco"));

        System.out.println("-------------------------------------------------------------------------------------");

        // Filtrar lista por uma letra específica
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').toList();

        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("-------------------------------------------------------------------------------------");

        // Filtrar lista por uma letra específica e parar no primeiro campo encontrado
        String nome = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);

        // Resultado se não tiver campo
        String nome2 = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);

        System.out.println(nome);
        System.out.println(nome2);

    }
}
