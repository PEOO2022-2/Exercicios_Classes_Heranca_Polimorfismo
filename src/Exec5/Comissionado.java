package Exec5;

public class Comissionado extends Colaborador {
    public float percentualDaComissão;
    public float valorTotalDevendas;

    Comissionado(String nome, int horasDeTrabalho, float percentualDaComissão, float valorTotalDevendas) {
        this.nome = nome;
        this.horasDeTrabalho = horasDeTrabalho;
        this.percentualDaComissão = percentualDaComissão;
        this.valorTotalDevendas = valorTotalDevendas;
    }
}
