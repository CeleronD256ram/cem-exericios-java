package com.cemexercicios.strings.condicionais;

import java.util.Scanner;

public class Exe16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Verifica se o número é par ou impar

        System.out.println("Digite o número: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println(numero + " é par");
        } else {
            System.out.println(numero + " é impar");
        }

    }

}
