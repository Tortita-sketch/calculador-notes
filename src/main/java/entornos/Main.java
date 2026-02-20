package entornos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String numeros = leerNumerosAString();
        int mitjana = calcularMitjana(numeros);
        mostrarResultat(mitjana);

    }

    public static int calcularMitjana(String s) {
        Scanner sc = new Scanner(s);
        int total = 0;
        int numValores = 0;

        while (sc.hasNextInt()) {
            int numero = sc.nextInt();
            total += numero;
            numValores++;
        }
        sc.close();
        int mitjana = total / numValores;
        System.out.println("Mitjana: " + mitjana);
        return mitjana;
    }

    public static void mostrarResultat(int mitj) {
        if (mitj >= 5) {
            System.out.println("Has aprovat");
        } else
            System.out.println("Has suspes");
    }

    public static String leerNumerosAString() {
        Scanner sc = new Scanner(System.in);
        StringBuilder resultado = new StringBuilder();

        System.out.println("Introdueix notes (introduiex una lletra per finalitzar):");

        while (sc.hasNextInt()) {
            int numero = sc.nextInt();

            if (resultado.length() > 0) {
                resultado.append(" ");
            }

            resultado.append(numero);
        }

        return resultado.toString();
    }
}