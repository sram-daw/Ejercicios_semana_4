package semana3;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca una palabra:");
        String textoUsuario = input.nextLine();
        if (textoUsuario.length() % 2 == 0) {
            System.out.println("El número de caracteres es par.");
        } else {
            System.out.println("El número de caracteres no es par.");
        }
    }
}

