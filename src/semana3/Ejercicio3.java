package semana3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int leche = 1;
        int cacao = 2;
        double avellanas = 7.20;
        double azucar = 0.90;
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca un producto: ");
        String ingrediente = input.nextLine();
        if (ingrediente.equals("azúcar")) { //Si el usuario introduce "azúcar" con tilde, indica al programa que es igual que "azucar" sin tilde.
            ingrediente = "azucar";
        }
        switch (ingrediente) {
            case "leche":
                System.out.print("El precio de la leche es " + leche + "€");
                break;
            case "cacao":
                System.out.print("El precio del cacao es " + cacao + "€");
                break;
            case "avellanas":
                System.out.print("El precio de las avellanas es " + avellanas + "€/kg");
                break;
            case "azucar":
                System.out.print("El precio del azúcar es " + azucar + "€/kg");
                break;
            default:
                System.out.print("Por favor, introduzca el nombre del producto correctamente.");
        }
    }
}
