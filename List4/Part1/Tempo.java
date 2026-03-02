package List4.Part1;

import java.util.Scanner;

public class Tempo {

    public static int[] converterTempo(int segundosTotais) {

        int horas = segundosTotais / 3600;
        int resto = segundosTotais % 3600;

        int minutos = resto / 60;
        int segundos = resto % 60;

        return new int[]{horas, minutos, segundos};
    }

    public static void exibirTempo(int[] tempo) {

        System.out.println("Convertendo esses segundos, equivale a:");
        System.out.println("Hora(s): " + tempo[0]);
        System.out.println("Minuto(s): " + tempo[1]);
        System.out.println("Segundo(s): " + tempo[2]);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tempo em segundos:");
        int segundos = sc.nextInt();

        int[] tempoConvertido = converterTempo(segundos);
        exibirTempo(tempoConvertido);

        sc.close();
    }
}