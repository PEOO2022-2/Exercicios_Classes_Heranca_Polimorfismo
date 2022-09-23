package Exec2;

public class Main {
    public static void main(String[] args) {
        Elevador elevador = new Elevador(10, 12);

        elevador.entrar();
        elevador.entrar();
        elevador.entrar();
        elevador.entrar();
        elevador.entrar();

        elevador.subir();
        System.out.println(" Pessoas: " + elevador.quantidadeDePessoasAtual + " Andar: " + elevador.andarAtual);// 5, 1

        elevador.subir(7);
        System.out.println(" Pessoas: " + elevador.quantidadeDePessoasAtual + " Andar: " + elevador.andarAtual); // 5, 7

        elevador.subir(12);
        System.out.println(" Pessoas: " + elevador.quantidadeDePessoasAtual + " Andar: " + elevador.andarAtual); // 5, 12

        elevador.subir();
        System.out.println(" Pessoas: " + elevador.quantidadeDePessoasAtual + " Andar: " + elevador.andarAtual); // 5, 12 - Nada deve ser feito aqui

        elevador.sair();
        elevador.sair();

        elevador.descer();
        System.out.println(" Pessoas: " + elevador.quantidadeDePessoasAtual + " Andar: " + elevador.andarAtual);// 3, 11

        elevador.descer(0);
        System.out.println(" Pessoas: " + elevador.quantidadeDePessoasAtual + " Andar: " + elevador.andarAtual);// 3, 0

        elevador.descer();
        System.out.println(" Pessoas: " + elevador.quantidadeDePessoasAtual + " Andar: " + elevador.andarAtual);// 3, 0 - nada deve ser feito aqui

    }
}
