package List4.Part1;

import java.util.Scanner;


public class CaixaEletronico {


    public static boolean validarValor(int valor) {
        return valor > 0 && valor % 10 == 0;
    }

    public static int[] calcularNotas(int valor) {

        int notas50 = valor / 50;
        int restoDivisao = valor % 50;

        int notas20 = restoDivisao / 20;
        int notas10 = (restoDivisao % 20) / 10;

        return new int[]{notas50, notas20, notas10};
    }

    public static void exibirResultado(int[] notas) {
        System.out.println("Você tem "
                + notas[0] + " nota(s) de R$50, "
                + notas[1] + " nota(s) de R$20 e "
                + notas[2] + " nota(s) de R$10.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor inteiro (múltiplo de 10): ");
        int valor = sc.nextInt();

        if (!validarValor(valor)) {
            System.out.println("Valor inválido!");
            return;
        }

        int[] notas = calcularNotas(valor);
        exibirResultado(notas);
    }
}




