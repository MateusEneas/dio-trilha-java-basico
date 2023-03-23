package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex009 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        String menorNome = "Null";
        int menorIdade = 0;
        int comparacao = 100;

        System.out.print("Quantas pessoas são: " );
        int qtdPessoas = sc.nextInt();
        System.out.println();

        for (int i = 1; i <= qtdPessoas; i++){
            System.out.println("Digite o nome: ");
            String nome = sc.next();
            System.out.println("Digite a idade: ");
            int idade = sc.nextInt();
                if(comparacao > idade){
                comparacao = idade;
                menorNome = nome;
                menorIdade = idade;
            }
        }

        System.out.println("A menor idade tem: " + menorIdade);
        System.out.println("E seu nome é: " + menorNome);

        sc.close();
    }
}
