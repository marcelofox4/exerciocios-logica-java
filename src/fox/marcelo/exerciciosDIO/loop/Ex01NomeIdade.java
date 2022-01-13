package fox.marcelo.exerciciosDIO.loop;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/

import java.util.Scanner;

public class Ex01NomeIdade {
    public static void main(String[] args) {
        Scanner scannerIn = new Scanner(System.in);

        String name = null;
        int age;

        while(true){
            System.out.println("Digite um Nome:");
            name = scannerIn.next();
            if (name.equals("0")){
                break;
            }
            System.out.println("Digite sua Idade " + name + ":");
            age = scannerIn.nextInt();
            System.out.println("Caso desejar finalizar o programa, digite a tecla 0 no nome.");
        }
        System.out.println("Programa Finalizado!");
    }
}
