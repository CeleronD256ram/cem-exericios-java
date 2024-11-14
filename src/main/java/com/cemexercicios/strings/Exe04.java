package com.cemexercicios.strings;

import java.util.Scanner;

public class Exe04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*Crie um programa que receba uma frase e substitua todas as letras
         "a" por "e" com loop */

        System.out.println("Digite uma frase: ");
        String frase = sc.nextLine();

        String novaFrase = "";

        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);

            if (letra == 'a') {
                novaFrase += "e";
            } else {
                novaFrase += letra;
            }

        }
        System.out.println("Frase modificada: " + novaFrase);


    }
}
