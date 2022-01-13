package fox.marcelo.exerciciosDIO.loop;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

import java.util.Scanner;

public class Ex03MaiorEMedia {
    public static void main(String[] args) {
        Scanner scannerIn = new Scanner(System.in);

        int[] numbers = new int[5];
        double average = 0;
        int higherNumber = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Digite o " + (i+1) + "° número:");
            numbers[i] = scannerIn.nextInt();

            if (numbers[i] > higherNumber){
                higherNumber = numbers[i];
            }

            average += numbers[i];
        }
        System.out.println("Maior número: " + higherNumber);
        System.out.println("Média: " + (average/numbers.length));

    }
}
