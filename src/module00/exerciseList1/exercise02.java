package module00.exerciseList1;

import java.util.Scanner;

//2. Verificador de Números Primos
//Objetivo: Criar um laço que verifique se um número é divisível apenas por 1 e por ele mesmo.
//Saída Esperada: "O número 17 é primo. O número 20 não é primo."
public class exercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        verificarPrimo(num1);
        verificarPrimo(num2);

        scanner.close();
    }

    public static void verificarPrimo(int numero) {
        if (numero <= 1) {
            System.out.println("O número " + numero + " não é primo.");
            return;
        }

        boolean primo = true;

        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                primo = false;
                break;
            }
        }

        if (primo) {
            System.out.println("O número " + numero + " é primo.");
        } else {
            System.out.println("O número " + numero + " não é primo.");
        }
    }
}