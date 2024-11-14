package com.cemexercicios.strings;

import java.util.Scanner;

public class Exe03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Crie um programa que receba uma frase e substitua todas as letras "a" por "e"

        System.out.println("Digite uma frase: ");
        String frase = sc.nextLine();

        String novaFrase = frase.replace("a", "e");

        System.out.println("Frase após a modificação: " + novaFrase);




    }
}
