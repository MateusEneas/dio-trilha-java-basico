package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int soma = 0;

        for (int i = 1; i <= 20; i++){
            System.out.println("Digite a idade de 20 pessoas para ver a soma deles: ");
            int idade = sc.nextInt();
            soma += idade;
        }
        System.out.println("A soma das idades digitadas são: " + soma);

        sc.close();
    }
}
