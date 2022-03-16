package com;

import java.util.Scanner;

public class atividade01 {
    //Nome e Idade: Faça um programa que leia conjuntos de dois valores, o primeiro representando o nome do aluno e o segundo representando a sua idade. (Pare o programa inserindo o valor 0 no campo nome)

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

        String name;
        int age;


        while(true) {
            System.out.println("Nome: ");
            name = scan.next();
            if(name.equals("0")) break;

            System.out.println("Idade: ");
            age = scan.nextInt();
        }

        System.out.println("Finalizando programa...");

    }
}
