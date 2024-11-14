package com.cemexercicios.strings;

import java.util.Scanner;

public class Exe11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Leia uma palavra e exiba a quantidade de vogais

        System.out.println("Digite uma palavra: ");
        String palavra = sc.nextLine();

        int quantidadeVogais = 0;

        for (int i = 0; i < palavra.length(); i++) {
            char letra = Character.toLowerCase(palavra.charAt(i));

            //verifica se a letra é uma vogal
            if (letra == 'a'||
                letra == 'e'||
                letra == 'i'||
                letra == 'o'||
                letra == 'u'
            ) {
                quantidadeVogais++;
            }

        }
        System.out.println("Quantidade de vogais: " + quantidadeVogais);



    }
}
