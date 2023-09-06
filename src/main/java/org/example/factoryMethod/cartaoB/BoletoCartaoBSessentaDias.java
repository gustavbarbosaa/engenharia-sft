package org.example.factoryMethod.cartaoB;

import org.example.factoryMethod.Boleto;

public class BoletoCartaoBSessentaDias extends Boleto {
    protected BoletoCartaoBSessentaDias(double valor) {
        super(valor);
        setJuros(0.12);
        setMulta(0.18);
    }
}
