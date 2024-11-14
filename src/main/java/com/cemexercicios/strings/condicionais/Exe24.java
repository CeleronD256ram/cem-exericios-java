package com.cemexercicios.strings.condicionais;

import java.util.Scanner;

public class Exe24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //solicite 2 números e exiba se o primeiro é divisivel pelo segundo

        System.out.println("Digite o primeiro número: ");
        int numero1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int numero2 = sc.nextInt();

        if (numero1 % numero2 == 0) {
            System.out.println("O primeiro é divisível pelo segundo");

        } else {
            System.out.println("O primeiro não é divisível pelo segundo");
        }
        
    }

}
