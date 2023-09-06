package org.example.factoryMethod.cartaoA;

import org.example.factoryMethod.Boleto;
import org.example.factoryMethod.Cartao;

public class CartaoA extends Cartao {

    @Override
    public Boleto criarBoleto(int quantidadeDiasAtraso, double valorBoleto) {

        switch (quantidadeDiasAtraso) {
            case 10:
                return new BoletoCartaoADezDias(valorBoleto);
            case 30:
                return new BoletoCartaoATrintaDias(valorBoleto);
            case 60:
                return new BoletoCartaoASessentaDias(valorBoleto);
            default:
                throw new IllegalArgumentException("Valor inválido!");
        }
    }
}
