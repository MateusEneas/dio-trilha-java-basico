package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex008 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int maiorIdade = 0;

        System.out.println("Quantas pessoas são: ");
        int qtdPessoas = sc.nextInt();


        for (int i = 1; i <= qtdPessoas; i++){
            System.out.println("Digite a idade das " + qtdPessoas + " pessoas para ver quem é maior de idade: ");
            int idade = sc.nextInt();
            if(idade >= 18){
                maiorIdade ++;
            }
        }
        if (maiorIdade <=1){
            System.out.println("Apenas uma pessoa é maior de idade!");
        }else {
            System.out.println("A quantidade de pessoas maiores de idade são: " + maiorIdade);
        }

        sc.close();
    }
}
