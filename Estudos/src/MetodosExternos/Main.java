package MetodosExternos;

public class Main {
    public static void main(String[] args) {

        System.out.println("Exercício calculadora");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(5, 2);
        Calculadora.divisao(200 , 10);

        System.out.println("Exercicio mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(3);

        System.out.println("Exercicio empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

    }
}
