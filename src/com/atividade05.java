package com;

import java.util.Scanner;

public class atividade05 {
    //Tabuada: Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:
    //
    //Tabuada de 5:
    //5 X 1 = 5
    //5 X 2 = 10
    //...
    //5 X 10 = 50

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o valor: ");
        int op = scan.nextInt();

        for(int i = 1; i < 11; i++) {
            int index = i;
            System.out.print(op + " x " + index);
            System.out.print(" = " + i * op + "\n");
        }

    }

}
