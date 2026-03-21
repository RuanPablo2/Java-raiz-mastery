package module00.exerciseList1;

public class exercise03 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.print("Array Original: ");
        imprimirArray(array);

        inverterArray(array);

        System.out.print(" | Array Invertido: ");
        imprimirArray(array);
    }

    public static void inverterArray(int[] arr) {
        int inicio = 0;
        int fim = arr.length - 1;

        while (inicio < fim) {
            int temp = arr[inicio];
            arr[inicio] = arr[fim];
            arr[fim] = temp;

            inicio++;
            fim--;
        }
    }

    public static void imprimirArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}