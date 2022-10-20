package semana3;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca una frase:");
        String frase = input.nextLine();
        if (frase.contains("b") | frase.contains("v")) {
            if (frase.contains("b")){
                System.out.println("La frase contiene la letra be.");
                String contienePe = frase.contains("p") ? "La frase contiene la letra pe." : "La frase no contiene la letra pe.";
                System.out.println(contienePe);
            }
            if (frase.contains("v")){
                System.out.println("La frase contiene la letra uve.");
                String contieneUve = frase.contains("u") ? "La frase contiene la letra u." : "La frase no contiene la letra u.";
                System.out.println(contieneUve);
            }
        }else{
            System.out.println("La frase no contiene ni be ni uve");
        }
    }
}