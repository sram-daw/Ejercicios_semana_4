package semana4;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca una palabra: ");
        String palabra = input.nextLine();
        if (palabra.contains("b")) {
            System.out.print("La palabra contiene una \"b\" minúscula.");
        }else{
            System.out.print("La palabra no contiene una \"b\" minúscula.");
        }
    }
}
