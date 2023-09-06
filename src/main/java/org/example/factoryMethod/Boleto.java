package org.example.factoryMethod;

import lombok.Data;

@Data
public abstract class Boleto {
    private final double valor;
    private double multa;
    private double juros;

    protected Boleto(double valor) {
        this.valor = valor;
    };

    public double calcularMulta(){
        return this.valor * this.multa;
    }

    public double calcularJuros(){
        return this.valor * this.juros;
    }

};
