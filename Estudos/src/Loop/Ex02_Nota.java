package Loop;


/*Faça um programa que peça uma nota entre 0 e 10.
Mostre uma mensagem caso o valor seja inválido e
continue pedindo até que o usuário informe um valor válido
 */

import java.util.Locale;
import java.util.Scanner;

public class Ex02_Nota {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double nota;

        System.out.print("Nota: ");
        nota = sc.nextDouble();

        while(nota < 0 || nota > 10){
            System.out.println("Nota inválida");
            System.out.print("Digite novamente a sua nota: ");
            nota = sc.nextDouble();
        }

        System.out.println("A sua nota é: " + nota);





        sc.close();


    }
}
