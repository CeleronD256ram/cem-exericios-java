package com.cemexercicios.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Exe07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Leia duas palavras e verifique se a segunda palavra é uma anagrama da primeira

        System.out.println("Primeira palavra: ");
        String palavra1 = sc.nextLine();
        System.out.println("Segunda palavra: ");
        String palavra2 = sc.nextLine();

        palavra1 = palavra1.replaceAll("\\s+", "").toLowerCase();
        palavra2 = palavra2.replaceAll("\\s+", "").toLowerCase();

        if (palavra1.length() != palavra2.length()) {
            System.out.println("A segunda palavra não é uma anagrama da primeira.");

        } else {
            char[] array1 = palavra1.toCharArray();
            char[] array2 = palavra2.toCharArray();

            Arrays.sort(array1);
            Arrays.sort(array2);

            if (Arrays.equals(array1, array2)) {
                System.out.println("A segunda palavra é um anagrama da primeira.");

            } else {
                System.out.println("A segunda palavra NÃO é um anagrama da primeira.");

            }


        }



    }


}
