package Exec3;

public class Datas {
    int dia;
    int mes;
    int ano;

    Datas(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    void avançar() {
        this.dia += 1;
    }

    boolean ehMaisAntiga(int dia, int mes, int ano) {
        if (this.ano < ano) return true;
        if (this.ano > ano) return false;

        if (this.ano == ano && this.mes < mes) return true;
        if (this.ano == ano && this.mes > mes) return false;

        if (this.ano == ano && this.mes == mes && this.dia < dia) return true;
        if (this.ano == ano && this.mes == mes && this.dia > dia) return false;
        return false;
    }

    public String toString() {
        return String.format("%s/%s/%s", this.dia, this.mes, this.ano);
    }
}
