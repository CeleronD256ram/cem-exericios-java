package com.cemexercicios.strings;

import java.util.Scanner;

public class Exe05 {
    public static void main(String[] args) {
        //Verificar se a palavra começa com "A"
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um nome: ");
        String nome = sc.nextLine();

        String passarParaMinusculo = nome.toLowerCase();

        if (passarParaMinusculo.startsWith("a")) {
            System.out.println("Sim, começa com a letra A");

        } else {
            System.out.println("Não!");
        }



    }
}
