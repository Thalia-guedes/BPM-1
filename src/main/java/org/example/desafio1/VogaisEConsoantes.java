package org.example.desafio1;

import java.util.Scanner;

public class VogaisEConsoantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma letra: ");
        char letra = scanner.next().toLowerCase().charAt(0);
        String vogais = "aeiou";
        String consoantes = "bcdfghjklmnpqrstvwxyz";


        if (vogais.contains(String.valueOf(letra))) {
            System.out.println("A letra é uma vogal.");
        } else if (consoantes.contains(String.valueOf(letra))) {
            System.out.println("A letra é uma consoante.");
        } else {
            System.out.println("Caractere inválido. Por favor, digite uma letra.");
        }
    }
}
