package module00.exerciseList1;

import java.util.Scanner;

public class exercise01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o capital inicial:");
        Double capital = sc.nextDouble();

        System.out.println("Digite a taxa de juros mensal(%):");
        Double taxa = sc.nextDouble() / 100;

        System.out.println("Digite o tempo em meses:");
        int tempo = sc.nextInt();

        Double montante = capital * Math.pow(1 + taxa, tempo);

        System.out.printf("Investimento inicial: R$%.2f, após %d meses a %.2f: R$ %.2f%n", capital, tempo, taxa * 100, montante);
    }
}