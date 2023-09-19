package org.example.desafio1;

import java.util.Arrays;
import java.util.Scanner;

public class NumerosDecrescentes {
    public static void main(String[] args) {

        int[] numeros = {15, 8, 32, 7, 19, 10};

        Arrays.sort(numeros);

        int inicio = 0;
        int fim = numeros.length - 1;

        while (inicio < fim) {
            int numTemporario = numeros[inicio];
            numeros[inicio] = numeros[fim];
            numeros[fim] = numTemporario;

            inicio++;
            fim--;
        }

        System.out.println("Lista ordenada em ordem decrescente:");

        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}


