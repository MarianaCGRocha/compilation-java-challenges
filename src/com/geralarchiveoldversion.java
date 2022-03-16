package com;

import static java.lang.Math.abs;

public class geralarchiveoldversion {

    /*
    Maior e Média: Faça um programa que leia 5 números e informe o maior número e a média desses números.


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

        System.out.println("Continua aqui...");

    }

     */

    /*public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira a Length da Array: ");
        int length = scan.nextInt();
        System.out.println("Insira " + length + "valores para a Array: ");

        int[] arr = new int[length];

        for(int i = 0; i < length; i++){
            arr[i] = scan.nextInt();
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0)
        }
    }*/

    /*
    Nota: Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.
     */
    /* public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira a nota: ");
        int nota = scan.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("Nota inválida! Insira outro valor.");
            nota = scan.nextInt();
        }

    }

     */
    /*
    Maior e Média: Faça um programa que leia 5 números e informe o maior número e a média desses números.
     */
    /* public static void main(String[] args) {
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

     */
    /*
    Par e Ímpar: Faça um programa que peça N números inteiros. Calcule e mostre a quantidade de números pares e a quantidade de números impares.
     */
    /* public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pares = 0;
        int impares = 0;

        System.out.println("Length: ");
        int length = scan.nextInt();

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

     */
    /*
    Tabuada: Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. O usuário deve informar de qual numero ele deseja ver a tabuada.
     */

    /* public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o valor: ");
        int op = scan.nextInt();

        for(int i = 1; i < 11; i++) {
            int index = i;
            System.out.print(op + " x " + index);
            System.out.print(" = " + i * op);
        }

    }

     */
    /*
    Fatorial: Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
     */

    /*public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valor = scan.nextInt();
        int fat = 1;

        for(int i = 2; i <= valor; i++) {
            fat *= i;
        }
        System.out.println("O fatorial de " + valor + " é igual a " + fat);
    }
     */

    /*
    Ordem Inversa: Faça um Programa que leia um vetor de 5 números inteiros e mostre-os na ordem inversa.
     */

    /* public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Length: ");
        int length = scan.nextInt();

        int[] arr = new int[length];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        for(int i = arr.length - 1; i >= 0; i--){
            System.out.println(arr[i]);
        }

    }
    */
    /*
    Faça um Programa que leia um vetor de 6 caracteres, e diga quantas consoantes foram lidas. Imprima as consoantes.
     */
    /* public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira a palavra a ser adicionada à Array: ");
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
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

    }

     */
    /*Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor. Ao final,
    mostre os números e seus sucessores.
     */
    /*public static void main(String[] args) {
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

     */
    /*
    Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9. Após isso determine o menor número da matriz e a sua posição(linha, coluna).
     */
    /*public static void main(String[] args) {
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

     */

    /* public static void main(String[] args) throws IOException {
        String value;
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        value = scan.readLine();
        for (int i = 2; i <= Integer.parseInt(value); i++) {

            if (i % 2 == 0) {

                System.out.println(i);

            }

        }
    }

     */

        /* public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int x1,y1,x2,y2;
            //se estiver na mesma linha ou mesma coluna ou mesma diagonal, gasta 1 movimento
            //se estiver em qualquer outra posição, a rainha gastará 2 movimentos!

            while(true){
                x1 = sc.nextInt();
                y1 = sc.nextInt();
                x2 = sc.nextInt();
                y2 = sc.nextInt();
                if(x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0) break; //condição de parada
                if(x1 == x2 && y1 == y2)
                    System.out.println("0");
                else if(x1 == x2 || y1 == y2)
                    System.out.println("1");
                else if(abs(x1-x2) == abs(y1-y2))
                    System.out.println("1");
                else
                    System.out.println("2");
            }
            sc.close();
        }
    }
         */


}