package Metodos;

public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTV smartTv = new SmartTV();

        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("Canal atual? " + smartTv.canal);
        System.out.println("Volume atual " + smartTv.volume);




    }
}
