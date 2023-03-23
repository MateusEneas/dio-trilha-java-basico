package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int numero = 0;
        int soma = 0;

        System.out.println("Quantos números deseja ver a soma em sequencia: ");
        int numeroSequencia = sc.nextInt();

        while (numero <= numeroSequencia){
            numero += 1;
            soma += numero;
            if (numero == numeroSequencia){
                System.out.println("A soma dos numeros de 1 a " + numeroSequencia + " é :" + soma);
            }
        }
        sc.close();

    }
}
