package entornos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mitjana = calcularMitjana("10 0");

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
        return total / numValores;
    }

}