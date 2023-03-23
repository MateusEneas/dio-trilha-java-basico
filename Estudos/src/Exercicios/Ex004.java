package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Quantas vezes gostaria de ver se nome na tela: ");
        int qtdVezes = sc.nextInt();
        int count = 0;

        while (count < qtdVezes){
            System.out.println(nome);
            count++;
        }


        sc.close();
    }
}
