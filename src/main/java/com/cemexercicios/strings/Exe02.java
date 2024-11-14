package com.cemexercicios.strings;

import java.util.Scanner;

public class Exe02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = sc.nextLine();

        char[] letras = palavra.toCharArray();

        for (char letra : letras) {
            System.out.println(letra);
        }

    }
}
