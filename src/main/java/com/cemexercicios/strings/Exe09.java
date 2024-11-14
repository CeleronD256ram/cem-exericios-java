package com.cemexercicios.strings;

import java.util.Scanner;

public class Exe09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // contar quantos espaços

        System.out.println("Digite uma frase: ");
        String frase = sc.nextLine();

        int contaEspacos = 0;

        for (int i = 0; i < frase.length(); i++) {
            //Verifica se o caractere atual é um espaço
            if (frase.charAt(i) == ' ') {
                contaEspacos++;
            }

        }
        System.out.println(contaEspacos + " espaços em branco na frase");

    }
}
