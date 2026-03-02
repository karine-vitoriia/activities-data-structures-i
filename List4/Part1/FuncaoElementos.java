package List4.Part1;

public class FuncaoElementos {

    public static boolean verificarElementosUnicos(int[] numeros) {

        for (int i = 0; i < numeros.length; i++) {

            for (int j = i + 1; j < numeros.length; j++) {

                if (numeros[i] == numeros[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void exibirResultado(boolean resultado) {

        if (resultado)
            System.out.println("Todos os números são únicos");
        else
            System.out.println("Existem números repetidos na lista");
    }

    public static void main(String[] args) {

        int[] exemplo = {10, 20, 30, 40, 10};

        boolean resultado = verificarElementosUnicos(exemplo);
        exibirResultado(resultado);
    }
}