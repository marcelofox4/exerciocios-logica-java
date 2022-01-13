package fox.marcelo.exerciciosDIO.arrays;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

public class Ex01OrdemInversa {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6};

        for (int i = numbers.length; i > 0; i--) {
            System.out.println(i);
        }
    }
}
