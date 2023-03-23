package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int soma = 0;
        double media = 0;

        System.out.print("Quantas idade gostaria de digitar: ");
        int qtdIdade = sc.nextInt();

        for (int i = 1; i <= qtdIdade; i++){
            System.out.println("Digite a idade das "+ qtdIdade + " pessoas para ver a média deles: ");
            int idade = sc.nextInt();
            soma += idade;
            media = soma / qtdIdade;
        }
        System.out.println("A média das idades digitadas são: " + media);

        sc.close();
    }
}
