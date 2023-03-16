package Loop;

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual número ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:

Tabuada de 5:
5 x 1 = 5
5 x 2 = 10
...
5 x 10 = 50
 */

import java.util.Locale;
import java.util.Scanner;

public class Ex05_Tabuada {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int numero;

        System.out.println("Digite qual número deseja ver a tabuada: ");
        numero = sc.nextInt();

        System.out.println("Tabuada de " + numero + ":");


        for (int i = 0 ; i <= 10 ; i++){
            System.out.println(numero + " X " + i +" = "+ (numero * i) );
        }




        sc.close();
    }
}
