package boletin_dos;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class ejercicioUno {
    public static void ej1 (BufferedReader br) throws IOException {
        System.out.println("1. Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo.");
        int num;
        do {
            System.out.println("Introduce un número: ");
            num = Integer.parseInt(br.readLine());
            System.out.println(Math.round(Math.pow(num,2)));
        } while (num>=0);
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
    }
}
