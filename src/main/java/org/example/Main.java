package org.example;

import org.example.factoryMethod.cartaoA.CartaoA;
import org.example.factoryMethod.cartaoB.CartaoB;

public class Main {
    public static void main(String[] args) {
        System.out.println("Boleto A");
        var cartaoA = new CartaoA();
        cartaoA.gerarBoleto(10, 100);
        cartaoA.gerarBoleto(30, 100);
        cartaoA.gerarBoleto(30, 100);

        System.out.println("Cartão B");
        var cartaoB = new CartaoB();
        cartaoB.gerarBoleto(10, 100);
        cartaoB.gerarBoleto(30, 100);
        cartaoB.gerarBoleto(60, 100);
    }
}