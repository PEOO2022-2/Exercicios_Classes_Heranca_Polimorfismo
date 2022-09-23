package Exec4;

import java.util.ArrayList;
import java.util.List;

public class MatrizDeInteiros {
    int numLinhas;
    int numColunas;
    int[][] matriz;

    MatrizDeInteiros(int numLinhas, int numColunas) {
        this.numLinhas = numLinhas;
        this.numColunas = numColunas;
        this.matriz = preencherMatrizComZeros(numLinhas, numColunas);
    }

    int[][] preencherMatrizComZeros(int numLinhas, int numColunas) {
        int[][] matriz = new int[numLinhas][numColunas];;
        for (int i = 0; i < numLinhas; i++) {
            for (int j = 0; j < numColunas; j++) {
                matriz[i][j] = 0;
            }
        }
        return matriz;
    }

    void apresentaMatriz() {
        List<Integer> valoresDaLinha = new ArrayList<>();
        System.out.println("");
        for (int i = 0; i < numLinhas; i++) {
            for (int j = 0; j < numColunas; j++) {
                valoresDaLinha.add(this.matriz[i][j]);
            }
            System.out.println(valoresDaLinha);
            valoresDaLinha = new ArrayList<>();
        }
        System.out.println("");
    }

    void mudarUmValorNaMatriz(int linha, int coluna, int valor) {
        linha -= 1;
        coluna -= 1;

        if (linha > this.numLinhas || coluna > this.numColunas) {
            System.out.println("Linha ou coluna não existe na matriz!");
        } else {
            this.matriz[linha][coluna] = valor;
        }
    }

    boolean ehQuadrada(int numLinhas, int numColunas) {
        if (numLinhas == numColunas) return true;
        return false;
    }

    int somaDeValores() {
        int soma = 0;
        for (int i = 0; i < numLinhas; i++) {
            for (int j = 0; j < numColunas; j++) {
                soma += this.matriz[i][j];
            }
        }
        return soma;
    }

    int buscarValor(int valor) {
        System.out.println("Valor buscado: " + valor);

        for (int i = 0; i < numLinhas; i++) {
            for (int j = 0; j < numColunas; j++) {
                if (this.matriz[i][j] == valor) {
                    System.out.println("Valor encontrado na linha: " + i);
                    System.out.println("Valor encontrado na coluna: " + j);
                    return i;
                }
            }
        }
        return -1;
    }
}
