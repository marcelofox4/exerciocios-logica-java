package fox.marcelo.exerciciosDIO.arrays;

/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/

public class Ex02Consoantes {
    public static void main(String[] args) {

        char[] arraysChar = {'M', 'P', 'A', 'O', 'J', 'L'};
        int consonantsCount = 0;
        int vowelsCount = 0;

        for (char arr : arraysChar){
            switch (arr){
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':{
                    vowelsCount++;
                    break;
                }
                default:{
                    consonantsCount++;
                }
            }
        }
        System.out.println("Quantidade de Consoantes no Array? " + consonantsCount);
        System.out.println("Quantidade de Vogais no Array? " + vowelsCount);
    }
}
