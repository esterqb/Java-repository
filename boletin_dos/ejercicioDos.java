package boletin_dos;

import java.io.BufferedReader;
import java.io.IOException;

public class ejercicioDos {
    public static void ej2 (BufferedReader br) throws IOException {
        int num;
        System.out.println("2. Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se introduzca un 0.");
        do {
            System.out.println("Introduce un número: ");
            num=Integer.parseInt(br.readLine());
            if(num>0){
                System.out.println("El número es positivo.");
            }else{
                System.out.println("El número es negativo.");
            }
        } while (num>0);
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

    }
}
