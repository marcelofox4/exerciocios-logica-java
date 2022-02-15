package fox.marcelo.desafiosGFTstart4.desafios;

/*
DESAFIO
Crie um programa que leia um número e mostre os números pares até esse número,
inclusive ele mesmo.

Entrada
Você receberá 1 valor inteiro N, onde N > 0.

Saída
Exiba todos os números pares até o valor de entrada, sendo um em cada linha.
*/

import java.io.IOException;
import java.util.Scanner;

public class ExibindoNumerosPares {
    public static void main(String[] args) throws IOException {

        Scanner scannerIn = new Scanner(System.in);

        int N = scannerIn.nextInt();

        if (N >= 0) {

            for (int i = 0; i <= N; i++) {
                if (i % 2 == 0 && i != 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
