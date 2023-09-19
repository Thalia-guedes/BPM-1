package org.example.desafio3;

import java.util.Scanner;

public class ConsumoCombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de km: ");
        int km = scanner.nextInt();

        System.out.println("Digite a quantidade de combustivel em litros: ");
        double combustivel = scanner.nextDouble();

        if (combustivel <= 0) {
            System.out.println("O total de combustível deve ser maior que zero.");
            return;
        }

        double consumoMedio = km / combustivel;

        ConsumoMedio formatter = new ConsumoMedio();
        String consumoMedioFormatado = formatter.format(consumoMedio);

        System.out.println("Consumo médio: " + consumoMedioFormatado + " km/l");

        if (consumoMedio > 10) {
            System.out.println("Ótimo consumo! Seu veículo é muito econômico.");
        } else if (consumoMedio > 7) {
            System.out.println("Bom consumo! Seu veículo tem uma boa eficiência.");
        } else {
            System.out.println("Consumo um pouco elevado. Considere uma condução mais eficiente.");
        }
    }
}
