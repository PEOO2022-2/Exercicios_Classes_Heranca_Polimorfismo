package Exec3;

public class Main {
    public static void main(String[] args) {
        Datas data1 = new Datas(11,04,1998);
        data1.avançar();
        System.out.println("data1: " + data1.toString()); // 12/04/1998

        Datas data2 = new Datas(1,04,1998);
        System.out.println("data2: " + data2.toString());

        boolean ehMaisAntiga = data1.ehMaisAntiga(data2.dia, data2.mes, data2.ano);
        if (ehMaisAntiga) System.out.println("A data mais antiga eh: " + data1.toString());
        else System.out.println("A data mais antiga eh: " + data2.toString());
    }
}
