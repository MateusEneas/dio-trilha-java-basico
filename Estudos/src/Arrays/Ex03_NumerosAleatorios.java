package Arrays;

/*
Faça um programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
 */

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Ex03_NumerosAleatorios {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Random random = new Random();

        int[] numAleatorios = new int[20];

        for (int i = 0 ; i < numAleatorios.length ; i++){
            int numero = random.nextInt(100);
            numAleatorios[i] = numero;
        }

        System.out.println("Números aleatórios: ");
        for (int numero : numAleatorios) {
            System.out.print(numero + " ");
        }

        System.out.println();
        System.out.println("Sucessores dos números aleatórios: ");
        for (int numero : numAleatorios) {
            System.out.print((numero+1) + " ");
        }

        sc.close();
    }
}
