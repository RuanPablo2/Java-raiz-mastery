package module00.exerciseList1;

//8. Contador de Vogais e Consoantes
//Objetivo: Percorrer uma frase e contar quantos caracteres são vogais e quantos são consoantes.
//Saída Esperada: "Texto: 'Java Raiz'. Vogais: 4 | Consoantes: 4"
public class exercise08 {
    public static void main(String[] args) {
        String texto = "Java Raiz".toLowerCase();

        int vogais = 0;
        int consoantes = 0;

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (c >= 'a' && c <= 'z') { // verifica se é letra
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vogais++;
                } else {
                    consoantes++;
                }
            }
        }

        System.out.println("Texto: 'Java Raiz'. Vogais: " + vogais + " | Consoantes: " + consoantes);
    }
}