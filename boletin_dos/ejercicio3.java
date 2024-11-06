package boletin_dos;

import java.io.BufferedReader;
import java.io.IOException;

public class ejercicio3 {
    public static void ej3 (BufferedReader br) throws IOException {
        System.out.println("3. Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar.");
        int num;
        do{
            System.out.println("Introduce un número: ");
            num=Integer.parseInt(br.readLine());
            if (num%2==0){
                System.out.println("El número es par.");
            }else{
                System.out.println("El número es impar.");
            }
        }while (num!=0);

        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

    }
}
