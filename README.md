# Desafios e Atividade em Java

## 💡 EXERCÍCIOS ESTRUTURAS DE REPETIÇÃO

### Atividade 01 // Activity 01
🔸[PT/BR] Nome e Idade: Faça um programa que leia conjuntos de dois valores, o primeiro representando o nome do aluno e o segundo representando a sua idade. (Pare o programa inserindo o valor 0 no campo nome) <br/>
🔸[EN] Name and Age: Make a program that reads sets of two values, the first representing the student's name and the second representing their age. (Stop the program by entering the value 0 in the name field)

### Atividade 02 // Activity 02
🔸[PT/BR] Nota: Faça um programa que peça uma nota entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido. <br/>
🔸[EN] Score: Make a program that asks for a grade between zero and ten. Show a message if the value is invalid and keep asking until the user enters a valid value.

### Atividade 03 // Activity 03
🔸[PT/BR] Maior e Média: Faça um programa que leia 5 números e informe o maior número e a média desses números. <br/>
🔸Biggest and Average: Make a program that reads 5 numbers and reports the biggest number and the average of those numbers.

### Atividade 04 // Activity 04
🔸[PT/BR] Par e Ímpar: Faça um programa que peça N números inteiros. Calcule e mostre a quantidade de números pares e a quantidade de números impares. <br/>
🔸[EN] Even and Odd: Write a program that asks for N integers. Calculate and display the number of even numbers and the number of odd numbers.

### Atividade 05 // Activity 05
🔸[PT/BR] Tabuada: Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50

🔸[EN] Tables: Develop a table generator, capable of generating the multiplication table of any integer between 1 to 10. The user must inform which number he wants to see the table for. The output should look like the example below:
5 times table:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50

### Atividade 06 // Activity 06
🔸[PT/BR] Fatorial: Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário. <br/>
🔸[EN] Factor: Write a program that calculates the factorial of a user-supplied integer.
Ex.: 5!=5.4.3.2.1=120

### Activity 07 // Activity 07
🔸[PT/BR] Ordem Inversa: Faça um Programa que leia um vetor de 5 números inteiros e mostre-os na ordem inversa. <br/>
🔸[EN] Inverse Order: Make a Program that reads a vector of 5 integers and displays them in reverse order.
Ex.: 5!=5.4.3.2.1=120

### Atividade 08 // Activity 08
🔸[PT/BR] Consoantes: Faça um Programa que leia um vetor de 6 caracteres, e diga quantas consoantes foram lidas. Imprima as consoantes. <br/>
🔸[EN] Consonants: Make a program that reads a vector of 6 characters, and says how many consonants were read. Print the consonants.

### Atividade 09 // Activity 09
🔸[PT/BR] Números Aleatórios: Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor. Ao final, mostre os números e seus sucessores. <br/>
🔸Random Numbers: Make a program that reads 20 random integers (between 0 and 100) and stores them in a vector/Array. At the end, show the numbers and their successors (number + 1).

### Atividade 10 // Activity 10
🔸[PT/BR] Array Multidimensional: Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9. Após isso determine o menor número da matriz e a sua posição(linha, coluna). <br/>
🔸[EN] Multidimensional Array: Generate and print a 4x4 M array with random values ​​between 0-9. After that determine the smallest number of the matrix and its position (row, column).

### Atividade 11 // Activity 11
🔸[PT/BR] Leia 2 valores de ponto flutuante de dupla precisão A e B, que correspondem a 2 notas de um aluno. A seguir, calcule a média do aluno, sabendo que a nota A tem peso 3.5 e a nota B tem peso 7.5 (A soma dos pesos portanto é 11). Assuma que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.

Entrada
O arquivo de entrada contém 2 valores com uma casa decimal cada um.

Saída
Calcule e imprima a variável MEDIA conforme exemplo abaixo, com 5 dígitos após o ponto decimal e com um espaço em branco antes e depois da igualdade. Utilize variáveis de dupla precisão (double) e como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".

🔸[EN] Read 2 double-precision floating point values ​​A and B, which correspond to 2 grades of a student. Next, calculate the student's average, knowing that grade A has a weight of 3.5 and grade B has a weight of 7.5 (the sum of the weights is therefore 11). Assume that each grade can go from 0 to 10.0, always with one decimal place.

Input
The input file contains 2 values ​​with one decimal place each.

Exit
Calculate and print the MEDIA variable as shown below, with 5 digits after the decimal point and with a blank space before and after the equality. Use double precision variables and like all problems, don't forget to print the end of line after the result, otherwise you will get "Presentation Error".

### Atividade 12 // Activity 12
🔸[PT/BR] O jogo de xadrez possui várias peças com movimentos curiosos: uma delas é a dama, que pode se mover qualquer quantidade de casas na mesma linha, na mesma coluna, ou em uma das duas diagonais, conforme exemplifica a figura abaixo:
O grande mestre de xadrez Kary Gasparov inventou um novo tipo de problema de xadrez: dada a posição de uma dama em um tabuleiro de xadrez vazio (ou seja, um tabuleiro 8 × 8, com 64 casas), de quantos movimentos, no mínimo, ela precisa para chegar em outra casa do tabuleiro?
Kary achou a solução para alguns desses problemas, mas teve dificuldade com outros, e por isso pediu que você escrevesse um programa que resolve esse tipo de problema.  

Entrada
A entrada contém vários casos de teste. A primeira e única linha de cada caso de teste contém quatro inteiros X1, Y1, X2 e Y2 (1 ≤ X1, Y1, X2, Y2 ≤ 8). A dama começa na casa de coordenadas (X1, Y1), e a casa de destino é a casa de coordenadas(X2, Y2). No tabuleiro, as colunas são numeradas da esquerda para a direita de 1 a 8 e as linhas de cima para baixo também de 1 a 8. As coordenadas de uma casa na linha X e coluna Y são (X, Y ).
O final da entrada é indicado por uma linha contendo quatro zeros.

Saída
Para cada caso de teste da entrada seu programa deve imprimir uma única linha na saída, contendo um número inteiro, indicando o menor número de movimentos necessários para a dama chegar em sua casa de destino.

 
Exemplo de Entrada	Exemplo de Saída
4 4 6 2
3 5 3 5
5 5 4 3
0 0 0 0

1
0
2

Maratona de Programação da SBC 2008.

🔸[EN] The chess game has several pieces with curious moves: one of them is the queen, which can move any number of spaces in the same row, in the same column, or in one of the two diagonals, as exemplified in the figure below:
Chess grandmaster Kary Gasparov invented a new type of chess problem: given the position of a queen on an empty chess board (i.e. an 8×8 board with 64 squares), how many moves, at least, Does she need to get to another square on the board?
Kary found the solution to some of these problems, but had difficulty with others, so he asked you to write a program that solves this type of problem.

Input
The input contains several test cases. The first and only line of each test case contains four integers X1, Y1, X2 and Y2 (1 ≤ X1, Y1, X2, Y2 ≤ 8). The queen starts at the coordinate square (X1, Y1), and the destination square is the coordinate square (X2, Y2). On the board, columns are numbered from left to right from 1 to 8 and rows from top to bottom are also numbered from 1 to 8. The coordinates of a square in row X and column Y are (X, Y ).
The end of the entry is indicated by a line containing four zeros.

Exit
For each test case in the input, your program should print a single line in the output, containing an integer number, indicating the smallest number of moves necessary for the queen to arrive at her destination square.

 
Example Input Example Output
4 4 6 2
3 5 3 5
5 5 4 3
0 0 0 0

1
0
2

SBC Programming Marathon 2008.

### Atividade 13 // Activity 13
Exception - Try~Catch Hackerrank 30 days Challenge
🔸[EN] Objective
Today, we're getting started with Exceptions by learning how to parse an integer from a string and print a custom error message. Check out the Tutorial tab for learning materials and an instructional video!

Task
Read a string, , and print its integer value; if  cannot be converted to an integer, print Bad String.

Note: You must use the String-to-Integer and exception handling constructs built into your submission language. If you attempt to use loops/conditional statements, you will get a  score.

Input Format
A single string, S.

Constraints
1 <= |S| <= 6, where |S| is the length of string S.
S is composed of either lowercase letters (a to z) or decimal digits (0 - 9).

Output Format
Print the parsed integer value of S, or Bad String if S cannot be converted to an integer.

![Alt Text](https://media.giphy.com/media/vFKqnCdLPNOKc/giphy.gif)

To be continued...
Last update: 16/03/2022

