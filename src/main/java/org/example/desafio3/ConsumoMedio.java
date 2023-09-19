package org.example.desafio3;

import java.text.DecimalFormat;

class ConsumoMedio {
    private DecimalFormat decimalFormat;

    public ConsumoMedio() {
        decimalFormat = new DecimalFormat("0.000");
    }

    public String format(double consumoMedio) {
        return decimalFormat.format(consumoMedio);
    }
}
