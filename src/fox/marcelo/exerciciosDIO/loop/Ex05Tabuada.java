package fox.marcelo.exerciciosDIO.loop;

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/

import java.util.Scanner;

public class Ex05Tabuada {
    public static void main(String[] args) {
        Scanner scannerIn = new Scanner(System.in);

        int numberMultiplicationTable;

        System.out.println("Digite o número da tabuada que você deseja exibir:");
        numberMultiplicationTable = scannerIn.nextInt();

        System.out.println("Tabuada do " + numberMultiplicationTable + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numberMultiplicationTable + " x " + i + " = " + (numberMultiplicationTable * i));
        }
    }
}
