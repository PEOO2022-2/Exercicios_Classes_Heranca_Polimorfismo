package Exec1;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.soma(5);
        System.out.println(calculadora.valor); //5

        calculadora.divisao(2);
        System.out.println(calculadora.valor); // 2.5

        calculadora.multiplicacao(4);
        System.out.println(calculadora.valor); // 10

        calculadora.soma(10);
        System.out.println(calculadora.valor); // 20

        calculadora.resetar();
        System.out.println(calculadora.valor); // 0

        calculadora.soma(2);
        System.out.println(calculadora.valor); // 2
    }
}
