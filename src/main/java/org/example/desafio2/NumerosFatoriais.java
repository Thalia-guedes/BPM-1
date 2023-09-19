package org.example.desafio2;

import java.util.Scanner;

public class NumerosFatoriais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero para calcular seu Fatorial: ");
        int numero = scanner.nextInt();

        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        System.out.println("O fatorial do numero: " +numero + " é " +fatorial);
    }
}
