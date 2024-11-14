package com.cemexercicios.strings.condicionais;

import java.util.Scanner;

public class Exe19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // verificar se a soma dos 3 números é divido por 5

        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        int numero3 = sc.nextInt();

        int soma = numero1 + numero2 + numero3;
        if (soma % 5 == 0) {
            System.out.println(soma + " é divisível por 5");
        } else {
            System.out.println("Não é divisível por 5");
        }





    }
}
