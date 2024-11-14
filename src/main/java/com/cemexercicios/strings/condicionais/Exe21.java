package com.cemexercicios.strings.condicionais;

import java.util.Scanner;

public class Exe21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ler o ano de nascimento e informar se ela está apta a votar


        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        if (idade > 16) {
            System.out.println("Apto a votar");
        } else {
            System.out.println("Não pode votar.");
        }







    }


}
