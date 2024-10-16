

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo os dois parâmetros via terminal
        System.out.println("Digite o primeiro número:");
        int parametroUm = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        int parametroDois = scanner.nextInt();

        try {
            // Invocando o método de contar, que pode lançar uma exceção
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            // Capturando e exibindo a exceção caso o primeiro parâmetro seja maior que o segundo
            System.out.println(e.getMessage());
        }

        scanner.close();
    }

    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Verifica se o primeiro parâmetro é maior que o segundo
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        // Calcula a quantidade de interações
        int quantidade = parametroDois - parametroUm;

        // Realiza a contagem e imprime os números
        for (int i = 1; i <= quantidade; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}