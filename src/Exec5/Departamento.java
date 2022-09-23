package Exec5;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    String nome;
    int codigo;
    List<Assalariado> assalariados = new ArrayList<>();
    List<Horista>horistas = new ArrayList<>();
    List<Comissionado> comissionados = new ArrayList<>();

    Departamento(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }
    void gerarFolhaSalarial() {
        float total = 0;
        System.out.println("ASSALARIADOS (NOME E SAlÁRIO):");
        for (Assalariado assalariado: assalariados) {
            System.out.println(assalariado.nome);
            System.out.println(assalariado.valorDaSalario);
            System.out.println();
            total += assalariado.valorDaSalario;
        }

        System.out.println("==========================");
        System.out.println("HORISTAS (NOME E SAlÁRIO):");
        for (Horista horista: horistas) {
            float salario = horista.horasDeTrabalho * horista.valorRecebidoPorHora;
            System.out.println(horista.nome);
            System.out.println(salario);
            total += salario;
        }

        System.out.println("==========================");
        System.out.println("COMISSIONADOs (NOME E SAlÁRIO):");
        for (Comissionado comissionado: comissionados) {
            float salario = comissionado.percentualDaComissão * comissionado.valorTotalDevendas;
            System.out.println(comissionado.nome);
            System.out.println(salario);
            total += salario;
        }

        System.out.println("TOTAL: " + total);
    }
}
