package com.cemexercicios.strings;

import java.util.Scanner;

public class Exe10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //contar espaços sem usar loops

        System.out.println("Digite uma frase: ");
        String frase = sc.nextLine();

        String[] partes = frase.split(" ");

        int quantidadeEspacos = partes.length - 1;
        System.out.println(quantidadeEspacos + " espaços em branco");



    }
}
