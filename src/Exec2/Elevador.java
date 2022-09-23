package Exec2;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Elevador {
    int andarAtual = 0;
    int quantidadeDePessoasAtual = 0;
    int quantidadeTotalDeAndares;
    int capacidadeDoElevador;

    Elevador(int capacidadeDoElevador, int quantidadeTotalDeAndares) {
        this.capacidadeDoElevador = capacidadeDoElevador;
        this.quantidadeTotalDeAndares = quantidadeTotalDeAndares;
    }

    void entrar() {
        if (podeEntrar()) this.quantidadeDePessoasAtual += 1;
    }

    boolean podeEntrar() {
        if (this.quantidadeDePessoasAtual == this.capacidadeDoElevador) return false;
        return true;
    }

    void sair() {
        if (this.quantidadeDePessoasAtual > 0) this.quantidadeDePessoasAtual -= 1;
    }

    void subir() {
        if (this.andarAtual < this.quantidadeTotalDeAndares) this.andarAtual += 1;
    }

    // Polimorfismo
    void subir(int numeroDoAndar) {
        boolean andarExiste = numeroDoAndar <= this.quantidadeTotalDeAndares;
        boolean naoEstouNoUltimoAndar = this.andarAtual < this.quantidadeTotalDeAndares;
        if (andarExiste && naoEstouNoUltimoAndar) this.andarAtual = numeroDoAndar;;
    }

    void descer() {
        if (this.andarAtual > 0) this.andarAtual -= 1;
    }

    void descer(int numeroDoAndar) {
        boolean andarExiste = numeroDoAndar <= this.quantidadeTotalDeAndares && numeroDoAndar >= 0;
        boolean naoEstouNoPrimeiroAndar = this.andarAtual > 0;
        if (andarExiste && naoEstouNoPrimeiroAndar) this.andarAtual = numeroDoAndar;;
    }
}
