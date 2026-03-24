package module00.exerciseList1;

import java.util.Scanner;

//1. Cálculo de Juros Compostos
//Objetivo: Receber um capital inicial, taxa de juros mensal e tempo. Calcular o montante final.
//Saída Esperada: "Investimento inicial: R$ 1000.0, após 12 meses a 1%: R$ 1126.83"
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