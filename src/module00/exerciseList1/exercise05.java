package module00.exerciseList1;

//5. Conversor de Temperatura (Celsius/Fahrenheit)
//Objetivo: Criar uma função que receba o valor e o tipo de conversão.
public class exercise05 {
    public static double converter(double valor, String tipo) {
        if (tipo.equalsIgnoreCase("CtoF")) {
            return (valor * 9/5) + 32;
        } else if (tipo.equalsIgnoreCase("FtoC")) {
            return (valor - 32) * 5/9;
        } else {
            System.out.println("Tipo de conversão inválido!");
            return 0;
        }
    }

    public static void main(String[] args) {
        double celsius = 30;
        double fahrenheit = 100;

        double resultadoF = converter(celsius, "CtoF");
        double resultadoC = converter(fahrenheit, "FtoC");

        System.out.println(celsius + "°C equivalem a " + resultadoF + "°F");
        System.out.println(fahrenheit + "°F equivalem a " + resultadoC + "°C");
    }
}