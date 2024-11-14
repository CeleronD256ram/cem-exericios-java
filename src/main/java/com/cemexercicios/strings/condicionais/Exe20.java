package com.cemexercicios.strings.condicionais;

import java.util.Scanner;

public class Exe20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Ler 3 números e verificar se a soma é positiva, negativa ou zero

        System.out.println("Digite 3 números");
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        int numero3 = sc.nextInt();

        int soma = numero1 + numero2 + numero3;

        if (soma > 0) {
            System.out.println("Positivo");
        } else if (soma < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Zero");
        }

    }
}
