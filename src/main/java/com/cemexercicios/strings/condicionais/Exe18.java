package com.cemexercicios.strings.condicionais;

import java.util.Scanner;

public class Exe18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Receber duas notas, tirar a media e verificar se o aluno foi aprovado(média mairo que 6)

        System.out.println("Nota 1: ");
        double nota1 = sc.nextDouble();
        System.out.println("Nota 2: ");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2;
        if (media > 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }





    }
}
