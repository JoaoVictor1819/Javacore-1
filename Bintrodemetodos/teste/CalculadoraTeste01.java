package javacore.Bintrodemetodos.teste;

import javacore.Bintrodemetodos.dominio.Calculadora;

public class CalculadoraTeste01 {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.multiplicacao(10, 10);
        calculadora.somarDoisNumeros(10, 5);
        double retur = calculadora.divisaoDoisNumeros(20, 2);
        System.out.println(retur);
    }
}