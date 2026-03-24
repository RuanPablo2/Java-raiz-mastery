package module00.exerciseList1;

//9. Simulador de Saque (Caixa Eletrônico)
//Objetivo: Dado um valor, informar a menor quantidade de notas de 100, 50, 20 e 10.
//Saída Esperada: "Valor: R$ 180. Notas: 1x100, 1x50, 1x20, 1x10"
public class exercise09 {
    public static void main(String[] args) {
        int valor = 180;

        int notas100 = valor / 100;
        valor = valor % 100;

        int notas50 = valor / 50;
        valor = valor % 50;

        int notas20 = valor / 20;
        valor = valor % 20;

        int notas10 = valor / 10;
        valor = valor % 10;

        System.out.println(
                "Valor: R$ 180. Notas: "
                        + notas100 + "x100, "
                        + notas50 + "x50, "
                        + notas20 + "x20, "
                        + notas10 + "x10"
        );
    }
}