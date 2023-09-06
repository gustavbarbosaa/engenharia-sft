package org.example.factoryMethod.cartaoB;

import org.example.factoryMethod.Boleto;

public class BoletoCartaoBDezDias extends Boleto {
    protected BoletoCartaoBDezDias(double valor) {
        super(valor);
        setJuros(0.04);
        setMulta(0.07);
    }
}
