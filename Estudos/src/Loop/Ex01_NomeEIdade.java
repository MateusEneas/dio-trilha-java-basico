package Loop;

import java.util.Locale;
import java.util.Scanner;

    /*Faça um programa que leia conjuntos de valores,
    o primeiro representando o nome do aluno e o segundo representando a sua idade.
    (Pare o programa inserindo o valor 0 no campo nome)*/

public class Ex01_NomeEIdade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        String nomeAluno;
        int idadeAluno;

        while(true){
            System.out.print("Nome: ");
            nomeAluno = sc.next();
            if (nomeAluno.equals("0"))break;
            System.out.print("Idade: ");
            idadeAluno = sc.nextInt();
        }






        sc.close();

    }
}
