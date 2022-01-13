package fox.marcelo.exerciciosDIO.loop;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

import java.util.Scanner;

public class Ex04ParEImpar {
    public static void main(String[] args) {
        Scanner scannerIn = new Scanner(System.in);

        int[] numbers = new int[6];
        int oddQuantity = 0;
        int evenQuantity = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Digite um número:");
            numbers[i] = scannerIn.nextInt();

            if (numbers[i] % 2 == 0){
                evenQuantity++;
            }else{
                oddQuantity++;
            }
        }
        System.out.println("Quandidade de números PARES: " + evenQuantity);
        System.out.println("Quandidade de números ÍMPARES: " + oddQuantity);
    }
}
