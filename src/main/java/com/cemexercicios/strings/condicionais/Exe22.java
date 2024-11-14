package com.cemexercicios.strings.condicionais;

import java.util.Scanner;

public class Exe22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Ler um número inteiro e verificar se ele é divisível por 3 e por 5
        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        if (numero % 3 == 0 && numero % 5 ==0) {
            System.out.println("Número divisível por 3 e 5");
        } else {
            System.out.println("Não é divisivel por 3 e 5");
        }

    }
}
