package com;

import java.util.Scanner;

public class atividade09 {
    //Números Aleatórios: Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor. Ao final, mostre os números e seus sucessores.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira os valores da Array: ");
        int[] arr = new int[20];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            System.out.println(arr[i] + 1);
        }
    }

}
