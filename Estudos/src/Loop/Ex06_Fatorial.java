package Loop;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 x 4 x 3 x 2 x 1)
 */

import java.util.Locale;
import java.util.Scanner;

public class Ex06_Fatorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Fatorial: ");
        int fatorial = sc.nextInt();

        int multiplicação = 1;


        for (int i = fatorial; i >= 1 ; i--){
            multiplicação = multiplicação * i;

        }

        System.out.println(fatorial + "!= " + multiplicação);


        sc.close();
    }
}
