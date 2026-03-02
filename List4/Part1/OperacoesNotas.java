package List4.Part1;

public class OperacoesNotas {

    public static double calcularMedia(double[] notas) {

        double soma = 0;

        for (double nota : notas)
            soma += nota;

        return soma / notas.length;
    }

    public static int contarAcimaMedia(double[] notas, double media) {

        int contador = 0;

        for (double nota : notas)
            if (nota > media)
                contador++;

        return contador;
    }

    public static double maiorNota(double[] notas) {

        double maior = notas[0];

        for (double nota : notas)
            if (nota > maior)
                maior = nota;

        return maior;
    }

    public static void main(String[] args) {

        double[] notas = {7.5, 4.0, 9.2, 5.5, 8.0, 6.5, 3.2, 10.0, 7.0, 5.8};

        double media = calcularMedia(notas);
        int acimaMedia = contarAcimaMedia(notas, media);
        double maior = maiorNota(notas);

        System.out.println("Média: " + media);
        System.out.println("Alunos acima da média: " + acimaMedia);
        System.out.println("Maior nota: " + maior);
    }
}