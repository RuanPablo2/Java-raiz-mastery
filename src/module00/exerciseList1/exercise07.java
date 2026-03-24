package module00.exerciseList1;

//7. Verificador de Palíndromo
//Objetivo: Receber uma String e verificar se ela é lida da mesma forma de trás para frente.
//Saída Esperada: "A palavra 'radar' é um palíndromo. A palavra 'java' não é."
public class exercise07 {
    public static boolean ehPalindromo(String texto) {
        texto = texto.toLowerCase();
        int inicio = 0;
        int fim = texto.length() - 1;

        while (inicio < fim) {
            if (texto.charAt(inicio) != texto.charAt(fim)) {
                return false;
            }
            inicio++;
            fim--;
        }

        return true;
    }

    public static void main(String[] args) {
        String palavra1 = "radar";
        String palavra2 = "java";

        if (ehPalindromo(palavra1)) {
            System.out.println("A palavra '" + palavra1 + "' é um palíndromo.");
        } else {
            System.out.println("A palavra '" + palavra1 + "' não é.");
        }

        if (ehPalindromo(palavra2)) {
            System.out.println("A palavra '" + palavra2 + "' é um palíndromo.");
        } else {
            System.out.println("A palavra '" + palavra2 + "' não é.");
        }
    }
}