package fox.marcelo.desafiosGFTstart4.basicos;

/*
DESAFIO
E foi esperança que motivou a Vovó Zazá, uma senhora de 72 anos,
a realizar seu sonho de começar um curso universitário. Ela está fascinada
com tudo o que diz respeito à Universidade: com as aulas, com a biblioteca,
com os projetos de pesquisa e extensão, com o restaurante universitário,
mas especialmente com a carteirinha de estudante que ela pode utilizar
para pagar meia entrada no cinema. Semana passada, Vovó Zazá e seus colegas
de turma foram ao cinema assistir a um filme, mas ficaram estarrecidos com
o aumento do preço do ingresso. Revoltados, eles decidiram fazer uma manifestação
contra o sistema capitalista opressor, agendada para amanhã na Praça General Bertaso.
Vovó Zazá quer colaborar com o movimento fazendo um cartaz com a seguinte palavra de ordem:

QUE ABSURDO! O PREÇO DO CINEMA SUBIU … % !!

Mas ela não é muito boa em Matemática, e está solicitando sua ajuda
para calcular a porcentagem de que precisa para completar o cartaz.

ENTRADA
A única linha da entrada consiste de dois valores A e B (0.00 < A ≤ B ≤ 1000.00),
os quais, fornecidos com exatos dois dígitos após o ponto separador decimal,
representam respectivamente o valor antigo e o valor novo do ingresso do cinema.

SAÍDA
A única linha da saída deve consistir unicamente de um valor, que represente
como uma porcentagem o aumento do valor do ingresso. O valor deve ser acompanhado
do símbolo % e conter exatos dois dígitos após o ponto separador decimal.
*/

import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class OFilme {
    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double result = 0.00;

        if (A >= 0 && A <= B && B <= 1000) {
            result = ((B - A) / A) * 100;
            System.out.println(df.format(result) + "%");
        } else {
            System.out.println(df.format(result) + "%");
        }
        leitor.close();
    }
}
