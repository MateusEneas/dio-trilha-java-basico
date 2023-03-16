package Loop;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
 */

import java.util.Locale;
import java.util.Scanner;

public class Ex03_MaiorEMedia {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int numero;
        int count = 0;
        int maiorNumero = 0;
        int soma = 0;
        do {
            System.out.println("Digite um número: ");
            numero = sc.nextInt();
            soma = soma + numero;
            if(numero > maiorNumero){
                maiorNumero = numero;
            }
            ++count;
        }while(count < 5);

        System.out.println("O maior número é: " + maiorNumero);
        System.out.println("A média dos números é: " + (soma/5));




        sc.close();


    }
}
