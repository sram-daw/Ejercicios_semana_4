package semana3;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca un valor: ");
        int valor = input.nextInt();
        if (valor > 10) {
            System.out.print(valor + " es mayor que 10");
        } else {
            System.out.print(valor + " es menor que 10");
        }
    }
}
