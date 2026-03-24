package module00.exerciseList1;

//4. Fatorial de um Número
//Objetivo: Calcular o fatorial (n!) usando um laço 'for'.
//Saída Esperada: "O fatorial de 5 é: 120"
public class exercise04 {
    public static void main(String[] args) {
        int n = 5;
        int fatorial = 1;

        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + n + " é: " + fatorial);
    }
}