package boletin_dos;

import java.io.BufferedReader;
import java.io.IOException;

public class ejercicio5 {
    public static void ej5 (BufferedReader br) throws IOException {
        System.out.println("Realizar un juego para adivinar un número. Para ello pedir un número N, y luego ir pidiendo números indicando “mayor”" +
                "o “menor” según sea mayor o menor con respecto a N. El proceso termina cuando el usuario acierta.");
        int numero=13;
        int n;
        do{
            System.out.println("Introduce un número: ");
            n=Integer.parseInt(br.readLine());
            if (n>numero){
                System.out.println("Mayor.");
            }else if (n<numero){
                System.out.println("Menor.");
            }
        }while (n!=numero);
        System.out.println("¡Has acertado, enhorabuena!");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

    }
}
