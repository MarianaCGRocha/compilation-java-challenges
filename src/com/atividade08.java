package com;

import java.util.Scanner;

public class atividade08 {
    //Consoantes: Faça um Programa que leia um vetor de 6 caracteres, e diga quantas consoantes foram lidas. Imprima as consoantes.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira a frase a ser adicionada à Array: ");
        String line = scan.nextLine();
        int vowels = 0, consonants = 0;

        line = line.toLowerCase();
        for(int i = 0; i < line.length(); ++i) {
            char ch = line.charAt(i);


            //check if character is any of a, e, i, o, u
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                ++vowels;
            }
            //check if character is any consonant letter
            else if((ch >= 'a' && ch <= 'z')) {
                ++consonants;
            }
        }
        System.out.println("Nº de vogais: " + vowels);
        System.out.println("Nº de consoantes: " + consonants);

    }

}
