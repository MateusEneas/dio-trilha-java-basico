package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        for (int i = 0; i < 20; i++){
            System.out.println("Eu gosto de estudar Algoritmos!");
        }



        sc.close();

    }
}
