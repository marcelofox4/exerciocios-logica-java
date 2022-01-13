package fox.marcelo.exerciciosDIO.arrays;

/*
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
*/

import java.util.Random;

public class Ex04ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();
        
        int[][] arrayMulti = new int[4][4];

        for (int i = 0; i < arrayMulti.length; i++) {
            for (int j = 0; j < arrayMulti[i].length; j++) {
                arrayMulti[i][j] = random.nextInt(9);
            }
        }

        System.out.println("Matriz: ");
        for (int[] linha : arrayMulti ) {
            for (int coluna : linha ) {
                System.out.print(coluna + " ");
            }
            System.out.println();
        }
    }
}
