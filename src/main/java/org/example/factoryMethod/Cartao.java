package org.example.factoryMethod;

public abstract class Cartao {

    public Boleto gerarBoleto(int quantidadeDiasAtraso, double valorBoleto) {
        var boleto = criarBoleto(quantidadeDiasAtraso, valorBoleto);
        System.out.println("Valor R$: " + boleto.getValor());
        System.out.println("Juros R$: " + boleto.getJuros());
        System.out.println("Multa R$: " + boleto.getMulta());

        return boleto;
    }

    public abstract Boleto criarBoleto(int quantidadeDiasAtraso, double valorBoleto);
}
