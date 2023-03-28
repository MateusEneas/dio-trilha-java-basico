package Classes;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Carro carro = new Carro();

        System.out.print("Qual a cor do seu carro: ");
        String cor = sc.next();
        carro.setCor(cor);
        System.out.print("Qual o modelo do seu carro: ");
        String modelo = sc.next();
        carro.setModelo(modelo);
        System.out.print("Qual a capacidade do tanque do seu carro: ");
        double capacidadeTanque = sc.nextDouble();
        carro.setCapacidadeTanque(capacidadeTanque);

        System.out.println("A cor do carro é: " + carro.getCor());
        System.out.println("O modelo do carro é : " + carro.getModelo());
        System.out.println("A capacidade do tanque do carro é de: " + carro.getCapacidadeTanque() + " Litros");
        System.out.println("O valor total para encher o tanque do carro é de: R$" + carro.totalValorTanque(5.99));

        Carro carro2 = new Carro();

        System.out.print("Qual a cor do seu carro: ");
        String cor2 = sc.next();
        carro2.setCor(cor2);
        System.out.print("Qual o modelo do seu carro: ");
        String modelo2 = sc.next();
        carro2.setModelo(modelo2);
        System.out.print("Qual a capacidade do tanque do seu carro: ");
        double capacidadeTanque2 = sc.nextDouble();
        carro2.setCapacidadeTanque(capacidadeTanque2);

        System.out.println("A cor do carro é: " + carro2.getCor());
        System.out.println("O modelo do carro é : " +carro2.getModelo());
        System.out.println("A capacidade do tanque do carro é de: " + carro2.getCapacidadeTanque() + " Litros");
        System.out.println("O valor total para encher o tanque do carro é de: R$" + carro2.totalValorTanque(5.99));

        sc.close();
    }
}
