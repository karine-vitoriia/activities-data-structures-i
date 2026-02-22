package Atividade1;

import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor inteiro (múltiplo de 10): ");
        int valorRecebido = sc.nextInt();

        if (valorRecebido <= 0 || valorRecebido % 10 != 0) {
            System.out.println("Valor inválido! Digite um número múltiplo de 10.");
            return;
        }
        int notas50, notas20, notas10, resto;

        notas50 = valorRecebido / 50;
        resto = valorRecebido % 50;
        notas20 = resto / 20;
        notas10 = (resto % 20) / 10;


        System.out.println("Você tem " + notas50 + " nota(s) de R$50, " + notas20 + " nota(s) de R$20 e " + notas10 + " nota(s) de R$10.");




    }
}
