package fox.marcelo.exerciciosDIO.loop;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/

import java.util.Scanner;

public class Ex06Fatorial {
    public static void main(String[] args) {
        Scanner scannerIn = new Scanner(System.in);

        int number;
        int factorial = 1;

        System.out.println("Digite o número que deseja para cálculo do fatorial:");
        number = scannerIn.nextInt();

        for (int i = number; i >= 1; i--) {
            factorial *= i;
        }

        System.out.println("Fatorial de " + number + " é: " + factorial);
    }
}
