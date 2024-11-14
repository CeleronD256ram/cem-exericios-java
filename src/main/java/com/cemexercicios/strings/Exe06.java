package com.cemexercicios.strings;

import java.util.Scanner;

public class Exe06 {
    public static void main(String[] args) {
    //Verificar se a palavra é um palindromo
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palvra: ");
        String palavra = sc.nextLine();

        //Remove os espaços em branco e convertemos para letra minúscula
        String palavraFormatada = palavra.replaceAll("\\s+", "").toLowerCase();
        boolean palindromo = true;


        for (int i = 0; i < palavraFormatada.length() / 2; i++) {
            char a = palavraFormatada.charAt(i);
            char b = palavraFormatada.charAt(palavraFormatada.length() - i - 1);

            if (a != b) {
                palindromo = false;
                break;

            }

        }

        if (palindromo) {
            System.out.println("A palavra é um palindromo");

        } else {
            System.out.println("A palavra não é um palindromo");
        }




    }
}
