package Arrays;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
 */

import java.util.Locale;
import java.util.Scanner;

public class Ex01_OrdemInversa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int[] vetor = {-4 , 46 , 17 , -8 , 29, 50 };

        System.out.println("Vetor: ");

        int count = 0;

        while (count < vetor.length){
            System.out.print(vetor[count] + " ");
            count++;
        }
        System.out.println();

        for (int i = (vetor.length - 1); i >= 0 ; i--){
            System.out.print(vetor[i] + " ");
        }



        sc.close();
    }
}
