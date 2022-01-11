package one.metodosjava.basecamp;

public class Main {

    public static void main(String[] args) {

        // Calculadora
        System.out.println(" === Exercício calculadora ===");
        Calculadora.soma(9, 9);
        Calculadora.subtracao(9, 8);
        Calculadora.multiplicacao(9, 9);
        Calculadora.divisao(9, 2.5);

        // Mensagem
        System.out.println("\n === Exercício mensagem ===");
        Mensagem.obterMensagem(7);
        Mensagem.obterMensagem(16);
        Mensagem.obterMensagem(1);

        // Empréstimo
        System.out.println("\n === Exercício empréstimo ===");
        Emprestimo.calcular(1200, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1200, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1200, Emprestimo.getQuatroParcelas());
        Emprestimo.calcular(1200, 5);

    }
}

