package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        int i = 1;

        while(i <= 10){
            System.out.println(nome);
            i++;
        }

        sc.close();

    }
}
