package org.example.desafio1;

import java.util.Scanner;

public class NumerosNegativosPositivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0){
            System.out.println("O numero é positivo");
        }else {
            System.out.println("O numero e negativo");
        }
    }
}
