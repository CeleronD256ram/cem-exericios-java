package com.cemexercicios.strings.condicionais;

import java.util.Scanner;

public class Exe15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Leia 3 números e exiba o maior

        System.out.println("Digite o primeiro número: ");
        int numero1 = sc.nextInt();
        System.out.println("Segundo número: ");
        int numero2 = sc.nextInt();
        System.out.println("Terceiro: ");
        int numero3 = sc.nextInt();

        int maior = numero1;

        if (numero2 > maior) {
            maior = numero2;
        }
        if (numero3 > maior) {
            maior = numero3;
        }

        System.out.println("O maior número é: " + maior);



    }
}
