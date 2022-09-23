package Exec1;

public class Calculadora {
    public float valor = 0;

    //Podemos fazer essa classe com ou sem construtor!

    void soma(float entrada) {
        this.valor = this.valor + entrada;
    }

    void subtracao(float entrada) {
        this.valor = this.valor - entrada;
    }

    void multiplicacao(float entrada) {
        this.valor = this.valor * entrada;
    }

    void divisao(float entrada) {
        this.valor = this.valor / entrada;
    }

    void resetar() {
        this.valor = 0;
    }
}
