package fox.marcelo.exerciciosDIO.arrays;

/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/

import java.util.Scanner;

public class Ex03NumerosAleatorios {
    public static void main(String[] args) {
        Scanner scannerIn = new Scanner(System.in);

        int[] randomArray = new int[5];
        int number;

        for (int i = 0; i < randomArray.length; i++) {
            System.out.println("Digite o " + (i+1) + "° número:");
            number = scannerIn.nextInt();

            if(number >= 0 && number <= 100){
                randomArray[i] = number;
            }
        }

        System.out.println("Array Aleatório:");
        for (int i = 0; i < randomArray.length; i++) {
            System.out.print(randomArray[i] + " ");
        }
        System.out.println("\n------------------");

        System.out.print("Sucessor de cada número:");
        for (int i = 0; i < randomArray.length; i++) {
            if (i == (randomArray.length - 1)){
                break;
            }
            System.out.print("\n" + randomArray[i] + " -> " + randomArray[i+1]);
        }

    }
}
