package Heranca;

import java.util.Locale;
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Funcionario funcionario = new Funcionario();

        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();


        //Vendedor vendedor_ = (Vendedor) new Funcionario();






        sc.close();
    }
}
