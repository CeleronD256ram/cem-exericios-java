package com.cemexercicios.strings.condicionais;

import java.util.Scanner;

public class Exe14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //informe qual número é o maior

        System.out.println("Digite o primeiro número: ");
        int numero1 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        int numero2 = sc.nextInt();

        if (numero1 > numero2) {
            System.out.println("O primeiro número é maior");

        } else if (numero2 > numero1) {
            System.out.println("O segundo número é maior");
        } else {
            System.out.println("Os números são iguais");
        }


    }
}
