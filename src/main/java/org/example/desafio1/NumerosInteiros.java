package org.example.desafio1;

import java.util.Scanner;

public class NumerosInteiros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite dois numeros inteiros:");

        System.out.println("Digite o primeiro numero: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo numero: ");
        int num2 = scanner.nextInt();

        if (num1 > num2){
            System.out.println("O numero 1 e o maior numero!");
        }else {
            System.out.println("O numero 2 é o maior numero!");
        }
    }
}
