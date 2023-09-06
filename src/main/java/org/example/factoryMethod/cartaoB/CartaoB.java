package org.example.factoryMethod.cartaoB;

import org.example.factoryMethod.Boleto;
import org.example.factoryMethod.Cartao;

public class CartaoB extends Cartao {
    @Override
    public Boleto criarBoleto(int quantidadeDiasAtraso, double valorBoleto) {
        switch (quantidadeDiasAtraso) {
            case 10:
                return new BoletoCartaoBDezDias(valorBoleto);
            case 30:
                return new BoletoCartaoBTrintaDias(valorBoleto);
            case 60:
                return new BoletoCartaoBSessentaDias(valorBoleto);
            default:
                throw new IllegalArgumentException("Valor inválido!");
        }
    }
}
