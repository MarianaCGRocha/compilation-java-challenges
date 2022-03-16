package com;

import java.util.Random;

public class atividade10 {
    //Array Multidimensional: Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9. Após isso determine o menor número da matriz e a sua posição(linha, coluna).

    public static void main(String[] args) {
        int[][] matRandom = new int[4][4];
        Random numeroRandom = new Random();

        for(int i = 0; i < matRandom.length; i++) {
            for(int j = 0; j < matRandom.length; j++){
                matRandom[i][j] = numeroRandom.nextInt(100);
            }
        }

        int maior = 0, line = 0, col = 0;

        for(int i = 0; i < matRandom.length; ++i) {
            for(int j = 0; j < matRandom.length; j++) {
                if(matRandom[i][j] > maior) {
                    maior = matRandom[i][j];
                    line = i;
                    col = j;
                }
            }
        }
        System.out.println("\t\tMatriz\t\t");
        for(int i = 0; i < matRandom.length; i++) {
            for(int j = 0; j < matRandom.length; j++) {
                System.out.print("\t" + matRandom[i][j]);
            }
            System.out.println();
        }
        System.out.println("\nMaior valor = " + maior);
        System.out.println("Linha: " + line);
        System.out.println("Coluna: " + col);
    }

}
