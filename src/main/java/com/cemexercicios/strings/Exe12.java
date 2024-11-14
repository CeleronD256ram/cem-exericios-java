package com.cemexercicios.strings;

import java.util.Scanner;

public class Exe12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Receba um nome completa e exiba somente o ultimo nome.

        System.out.println("Digite o nome completo: ");
        String nomeCompleto = sc.nextLine();

        String[] nomePartes = nomeCompleto.split(" ");
        String ultimoNome = nomePartes[nomePartes.length - 1];

        System.out.println(ultimoNome);




    }


}
