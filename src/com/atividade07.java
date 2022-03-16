package com;

import java.util.Arrays;
import java.util.Scanner;

public class atividade07 {
    //Ordem Inversa: Faça um Programa que leia um vetor de 5 números inteiros e mostre-os na ordem inversa.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert the length of the Array: ");
        int length = scan.nextInt();
        System.out.println("Insert the elements of the array one by one: ");
        int[] arr = new int[length];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        for(int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }

    }

}
