package com.cemexercicios.strings.condicionais;

import java.util.Scanner;

public class Exe23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Verificar se uma pessoa é criança(0 a 2), adolescente(13 a 17), adulto (18 a 59) ou idoso(60 ou mais)

        System.out.println("Digite sua idade");
        int idade = sc.nextInt();

        if (idade >= 0 && idade <= 12) {
            System.out.println("Criança");

        } else if (idade >= 13 && idade <= 17) {
            System.out.println("Adolescente");
        } else if (idade >= 18 && idade <= 59) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }


    }
}
