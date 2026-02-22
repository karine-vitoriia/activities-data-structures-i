package Atividade1;

import java.util.Scanner;

public class CriteriosSenhas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma senha com pelo menos 8 caracteres e pelo menos um caractere especial:");
        String senha = sc.nextLine();

        boolean temEspecial = false;
        int tamanhoSemEspaco = 0;

        for (int i = 0; i < senha.length(); i++) {

            char c = senha.charAt(i);

            if (c != ' ') {   // ignora espaços
                tamanhoSemEspaco++;

                if (!Character.isLetterOrDigit(c)) {
                    temEspecial = true;
                }
            }
        }

        if (tamanhoSemEspaco >= 8 && temEspecial) {
            System.out.println("Senha válida!");
        } else {
            System.out.println("Senha inválida!");

            if (tamanhoSemEspaco < 8) {
                System.out.println("- Deve possuir pelo menos 8 caracteres (sem contar espaços).");
            }

            if (!temEspecial) {
                System.out.println("- Deve conter pelo menos um caractere especial.");
            }
        }
    }
}