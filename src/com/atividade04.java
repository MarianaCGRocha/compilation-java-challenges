package com;

import java.util.Scanner;

public class atividade04 {
    //Par e Ímpar: Faça um programa que peça N números inteiros. Calcule e mostre a quantidade de números pares e a quantidade de números impares.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pares = 0;
        int impares = 0;

        System.out.println("Insira a quantidade de números que você deseja analisar: ");
        int length = scan.nextInt();

        System.out.println("Insira os valores a serem analisados: ");
        int[] arr = new int[length];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scan.nextInt();
        }

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                pares++;
            } else impares++;
        }

        System.out.println("Nº de pares é: " + pares);
        System.out.println("Nº de ímpares é: " + impares);

    }

}
