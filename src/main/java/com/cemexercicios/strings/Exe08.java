package com.cemexercicios.strings;

import java.util.Scanner;

public class Exe08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Receba um nome completo e exiba somente o primeiro nome

        System.out.println("Digite o nome completo: ");
        String nomeCompleto = sc.nextLine();

        //Dividi o nome em partes separadas por espaços em branco
        String[] partesNome = nomeCompleto.split(" ");

        //obter primeiro nome
        String primeiroNome = partesNome[0];

        System.out.println("Primeiro nome: " + primeiroNome);



    }
}
