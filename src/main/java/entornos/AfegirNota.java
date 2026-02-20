package cide.programacion.com;
import java.util.Scanner;

public class AfegirNota {

    public static String leerNumerosAString() {
        Scanner sc = new Scanner(System.in);
        StringBuilder resultado = new StringBuilder();
        
        System.out.println("Introdueix nombres (introduiex una lletra per finalitzar):");

      
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
