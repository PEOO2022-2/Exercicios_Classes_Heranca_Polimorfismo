package Exec4;

public class Main {
    public static void main(String[] args) {
        System.out.println("Criando a matriz!");
        MatrizDeInteiros matriz = new MatrizDeInteiros(3,3);
        matriz.apresentaMatriz();

        System.out.println("Preenchendo a matriz!");
        matriz.mudarUmValorNaMatriz(1,1,12);
        matriz.mudarUmValorNaMatriz(1,2,2);

        matriz.mudarUmValorNaMatriz(2,2,4);
        matriz.mudarUmValorNaMatriz(2,3,2);

        matriz.mudarUmValorNaMatriz(3,1,8);
        matriz.mudarUmValorNaMatriz(3,3,1);
        matriz.apresentaMatriz();


        System.out.println("\nA matriz eh quadrada??");
        boolean ehQuadrada = matriz.ehQuadrada(matriz.numLinhas, matriz.numColunas);
        if (ehQuadrada) System.out.println("Matriz eh quadrada!");
        else System.out.println("Matriz nao eh quadrada!");

        System.out.println("\nQual a soma total dos valores?");
        int soma = matriz.somaDeValores();
        System.out.println("Soma de todos os valores da matriz: " + soma);

        int valor = 12;
        System.out.println("\nEsse valor existe? " + valor);
        matriz.buscarValor(valor);
    }
}
