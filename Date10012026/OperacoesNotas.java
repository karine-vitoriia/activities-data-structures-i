package Date10012026;

public class OperacoesNotas {

    public static void main(String[] args) {

        double[] notas = {7.5, 4.0, 9.2, 5.5, 8.0, 6.5, 3.2, 10.0, 7.0, 5.8};

        //media

        double media, soma = 0;

        for(int i = 0; i < 10; i++) {
            soma += notas[i];
        }
        media = soma / 10;
        System.out.println("A média aritmética de todas as notas é: "+media);

        //alunos notas acima da media calculada

        int acimaMedia = 0;

        for(int i = 0; i < 10; i++) {
            if (notas[i] > media) {
                acimaMedia++;
            }
        }
        System.out.println("A quantidade de alunos que ficaram com nota acima da média calculada é: "+acimaMedia);


        //maior nota da lista

        double maior = 0;

        for(int i = 0; i < 10; i++) {
            if (notas[i] > maior) {
                maior = notas[i] ;
            }
        }
        System.out.println("O maior número entre eles é o: "+maior);
    }
}