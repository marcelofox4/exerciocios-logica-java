package fox.marcelo.exerciciosDIO.loop;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/

import java.util.Scanner;

public class Ex02Nota {
    public static void main(String[] args) {
        Scanner scannerIn = new Scanner(System.in);

        int gradles;
        boolean gradlesValitation;

        System.out.println("Digite uma nota:");

        while(true){
            gradles = scannerIn.nextInt();
            gradlesValitation = gradles >= 0 && gradles <= 10;

            if (!gradlesValitation) {
                System.out.println("Valor fornecido inválido, favor fornecer uma nota entre 0 e 10");
                continue;
            }
            break;
        }

    }
}
