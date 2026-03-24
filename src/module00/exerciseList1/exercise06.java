package module00.exerciseList1;

//6. Média Ponderada de Notas
//Objetivo: Calcular a média de um aluno com pesos diferentes (Ex: Peso 2, 3 e 5).
//Saída Esperada: "Notas: 7.0 (p2), 8.5 (p3), 5.0 (p5). Média Final: 6.45"
public class exercise06 {
    public static double calcularMedia(double n1, double n2, double n3) {
        int p1 = 2;
        int p2 = 3;
        int p3 = 5;

        double somaPesos = p1 + p2 + p3;
        double media = (n1 * p1 + n2 * p2 + n3 * p3) / somaPesos;

        return media;
    }

    public static void main(String[] args) {
        double n1 = 7.0;
        double n2 = 8.5;
        double n3 = 5.0;

        double mediaFinal = calcularMedia(n1, n2, n3);

        System.out.printf(
                "Notas: %.1f (p2), %.1f (p3), %.1f (p5). Média Final: %.2f\n",
                n1, n2, n3, mediaFinal
        );
    }
}