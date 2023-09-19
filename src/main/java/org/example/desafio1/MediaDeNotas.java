package org.example.desafio1;

import java.util.Scanner;

public class MediaDeNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma nota entre 0 e 10 ");
        double nota = scanner.nextDouble();
        boolean continuar = true;

        while (continuar) {
            while (nota < 0 || nota > 10) {
                System.out.print("Digite a nota (entre 0 e 10): ");
                nota = scanner.nextDouble();

                if (nota < 0 || nota > 10) {
                    System.out.println("Nota inválida. A nota deve estar entre 0 e 10.");
                }
            }

            if (nota >= 8) {
                System.out.println("Aprovado");
            } else if (nota >= 6 || nota < 8) {
                System.out.println("Recuperaçao");
            } else if (nota < 6) {
                System.out.println("Reprovado!");
            }

            System.out.print("Deseja verificar outra nota? (S para sim, qualquer tecla para sair): ");
            String resposta = scanner.next();
            continuar = resposta.equalsIgnoreCase("S");
        }

    }
}
