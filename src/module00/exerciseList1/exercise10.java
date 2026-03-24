package module00.exerciseList1;

//10. Sequência de Fibonacci (N termos)
//Objetivo: Gerar os primeiros N números da sequência de Fibonacci.
//Saída Esperada: "Fibonacci (8 termos): 0, 1, 1, 2, 3, 5, 8, 13"
public class exercise10 {
    public static void main(String[] args) {
        int n = 8;

        int a = 0;
        int b = 1;

        System.out.print("Fibonacci (" + n + " termos): ");

        for (int i = 0; i < n; i++) {
            System.out.print(a);

            if (i < n - 1) {
                System.out.print(", ");
            }

            int proximo = a + b;
            a = b;
            b = proximo;
        }
    }
}