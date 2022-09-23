package Exec4;

public class Main {
    public static void main(String[] args) {
        System.out.println("Criando a matriz!");
        MatrizDeInteiros matriz = new MatrizDeInteiros(3,3);
        matriz.apresentaMatriz();

        System.out.println("\nITEAM A - Preenchendo a matriz!");
        matriz.mudarUmValorNaMatriz(1,1,12);
        matriz.mudarUmValorNaMatriz(1,2,2);

        matriz.mudarUmValorNaMatriz(2,2,4);
        matriz.mudarUmValorNaMatriz(2,3,2);

        matriz.mudarUmValorNaMatriz(3,1,8);
        matriz.mudarUmValorNaMatriz(3,3,1);
        matriz.apresentaMatriz();

        System.out.println("\nITEM B - A matriz eh quadrada??");
        boolean ehQuadrada = matriz.ehQuadrada();
        if (ehQuadrada) System.out.println("Matriz eh quadrada!");
        else System.out.println("Matriz nao eh quadrada!");

        System.out.println("\nITEM C - Qual a soma total dos valores?");
        matriz.somaDeValores();

        System.out.println("\nITEM D - Esse valor existe?");
        matriz.buscarValor(12);
    }
}
