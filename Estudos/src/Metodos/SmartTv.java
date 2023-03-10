package Metodos;

public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar (){
        ligada = true;
}
    public void desligar (){
        ligada = false;
    }

    public void aumentarVolume(){
        volume += 1;
        System.out.println("Aumento o volume para: " + volume);
    }

    public void diminuirVolume(){
        volume -= 1;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void aumentarCanal(){
        canal += 1;
        System.out.println("O novo canal é: " + canal);
    }

    public void diminuirCanal(){
        canal -= 1;
        System.out.println("O novo canal é: " + canal);
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("O novo canal é: " + canal);
    }

}
