package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class atividade11 {
    //Faça um programa que leia um valor e retorne todos os valores pares entre 0 e ele, incluindo ele mesmo.

    public static void main(String[] args) throws IOException {
        String value;
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Insira o valor a ser analisado: ");
        value = scan.readLine();
        for (int i = 2; i <= Integer.parseInt(value); i++) {

            if (i % 2 == 0) {

                System.out.println(i);

            }

        }
    }
}
