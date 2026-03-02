package List4.Part1;

import java.util.Scanner;

public class CriteriosSenhas {

    public static boolean temCaractereEspecial(String senha) {

        for (int i = 0; i < senha.length(); i++) {
            char c = senha.charAt(i);

            if (c != ' ' && !Character.isLetterOrDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public static int tamanhoSemEspaco(String senha) {

        int contador = 0;

        for (int i = 0; i < senha.length(); i++) {
            if (senha.charAt(i) != ' ') {
                contador++;
            }
        }
        return contador;
    }

    public static boolean validarSenha(String senha) {
        return tamanhoSemEspaco(senha) >= 8 && temCaractereEspecial(senha);
    }

    public static void exibirResultado(String senha) {

        if (validarSenha(senha)) {
            System.out.println("Senha válida!");
        } else {
            System.out.println("Senha inválida!");

            if (tamanhoSemEspaco(senha) < 8)
                System.out.println("- Deve possuir pelo menos 8 caracteres.");

            if (!temCaractereEspecial(senha))
                System.out.println("- Deve conter pelo menos um caractere especial.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma senha:");
        String senha = sc.nextLine();

        exibirResultado(senha);
    }
}