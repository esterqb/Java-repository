package boletin_dos;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class ejercicio4 {
    public static void ej4(BufferedReader br) throws IOException {
        System.out.println("4. Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido.");
        int num;
        ArrayList <Integer> listaNumeros = new ArrayList<>();

        do{
            System.out.println("Introduce un número: ");
            num=Integer.parseInt(br.readLine());
            if (num >= 0) {
                listaNumeros.add(num);
            }
            System.out.println("Se han introducido "+listaNumeros.toArray().length+" números.");
        }while (num>=0);
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

    }
}
