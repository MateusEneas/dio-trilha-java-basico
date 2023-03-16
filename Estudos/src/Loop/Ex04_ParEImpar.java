package Loop;

/*
Faça um programa que peça N números inteiros,
calcula e mostre a quantidade de números pares
e a quantidade de números impares.
 */

import java.util.Locale;
import java.util.Scanner;

public class Ex04_ParEImpar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int quantNumeros;
        int numero;
        int quantPares = 0, quantImpares = 0;

        System.out.println("Quantidade de números: ");
        quantNumeros = sc.nextInt();

        int count = 0;

        do {
            System.out.println("Número");
            numero = sc.nextInt();

            if (numero % 2 == 0 ) quantPares++;
            else quantImpares++;
            ++count;
        }while(count < quantNumeros);

        System.out.println("Quantidade de números pares: " + quantPares);
        System.out.println("Quantidade de números Impares: " + quantImpares);

        sc.close();

    }
}
