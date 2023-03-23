package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int soma = 0;

        for (int i = 1; i <= 10; i++){
            System.out.println("Digite 10 números para ver a soma deles: ");
            int numeros = sc.nextInt();
            soma += numeros;
        }
        System.out.println("A soma dos números digitados são: " + soma);

        sc.close();
    }
}
