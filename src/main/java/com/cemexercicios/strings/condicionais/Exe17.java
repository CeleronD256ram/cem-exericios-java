package com.cemexercicios.strings.condicionais;

import java.util.Scanner;

public class Exe17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //verifica se o número é positivo

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        if (numero < 0) {
            System.out.println(numero + " é negativo");

        } else if (numero > 0) {
            System.out.println(numero + " é positivo");
        } else {
            System.out.println("Número digitado foi 0");
        }
    }


}
