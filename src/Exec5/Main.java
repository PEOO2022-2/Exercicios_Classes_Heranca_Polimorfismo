package Exec5;

public class Main {

    public static void main(String[]

                                    args) {
        Departamento departamento = new Departamento("Administrativo", 111230);
        Assalariado assalariado = new Assalariado("Pedro", 160, 3000.00f);
        Horista horista = new Horista("Maria", 120, 30.00f);
        Comissionado comissionado = new Comissionado("Arthur", 100, 5.00f, 1000.00f);

        departamento.assalariados.add(assalariado);
        departamento.horistas.add(horista);
        departamento.comissionados.add(comissionado);

        departamento.gerarFolhaSalarial();
    }
}
