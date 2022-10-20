package semana3;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca un número:");
        float numeroUsuario = input.nextInt();
        if((numeroUsuario % 2)==0){
            System.out.println("El número "+numeroUsuario+" es par.");
        }else{
            System.out.println("El número "+numeroUsuario+" no es par.");
        }
    }
}
