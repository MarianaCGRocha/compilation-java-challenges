package com;

import java.util.Arrays;
import java.util.Scanner;

public class atividade03 {
    //Maior e Média: Faça um programa que leia 5 números e informe o maior número e a média desses números.

        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the Array: ");
        int length = scan.nextInt();

        int[] arr = new int[length];
        System.out.println("Enter the " + length + " numbers you want to storage on the Array: ");
        for(int i = 0; i < length; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("The Arrays elements are: ");
        System.out.println(Arrays.toString(arr));

        int maior = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > maior) {
                maior = arr[i];
            }
        }

        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }

        System.out.println("O maior número é: " + maior);
        System.out.print("A média é: ");
        System.out.print(total/length);
    }
}
