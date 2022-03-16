package com;

import java.util.Scanner;

public class atividade06 {
    //Fatorial: Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
    //Ex.: 5!=5.4.3.2.1=120

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o valor cujo fatorial se deseja obter: ");
        int valor = scan.nextInt();
        int fat = 1;

        for(int i = 2; i <= valor; i++) {
            fat *= i;
        }
        System.out.println("O fatorial de " + valor + " é igual a " + fat);
    }

}
