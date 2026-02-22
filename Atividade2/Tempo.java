package Atividade2;

import java.util.Scanner;

public class Tempo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tempo em segundos: ");
        int tempoSegundos= sc.nextInt();

        //conversões: horas = 3.600s e minutos = 60s

        int horas, minutos, segundos, resto;

        horas = tempoSegundos / 3600;
        resto = tempoSegundos % 3600;
        minutos = resto / 60;
        segundos = resto % 60;


        System.out.println("Convertendo esses segundos, equivale a:");
        System.out.println("Hora(s): " + horas);
        System.out.println("Minuto(s): " + minutos);
        System.out.println("Segundo(s): " + segundos);

    }
}
