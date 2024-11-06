package boletin_dos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static boletin_dos.ejercicio4.ej4;
import static boletin_dos.ejercicio5.ej5;
import static boletin_dos.ejercicio6.ej6;
import static boletin_dos.ejercicioUno.ej1;
import static boletin_dos.ejercicioDos.ej2;
import static boletin_dos.ejercicio3.ej3;
public class main {
    public static void main (String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean salir = false;

        while (!salir) {
            System.out.println("----- Menú de Ejercicios Boletín 2: Condicionales y bucles -----");
            System.out.println("0. Salir");
            System.out.println("1. Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo.");
            System.out.println("2. Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se introduzca un 0.");
            System.out.println("3. Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar.");
            System.out.println("4. Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido.");
            System.out.println("5. Realizar un juego para adivinar un número. Para ello pedir un número N, y luego ir pidiendo números indicando “mayor”" +
                    "o “menor” según sea mayor o menor con respecto a N. El proceso termina cuando el usuario acierta.");


            System.out.print("Selecciona una opción: ");

            int opcion=Integer.parseInt(br.readLine());

            switch (opcion) {
                case 0:
                    salir = true;
                    System.out.println("Saliendo del programa...");
                    break;
                case 1:
                    ej1(br);
                    break;
                case 2:
                    ej2(br);
                    break;
                case 3:
                    ej3(br);
                    break;
                case 4:
                    ej4(br);
                    break;
                case 5:
                    ej5(br);
                    break;
                case 6:
                    ej6(br);
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción del 1 al 22. Pulsa 0 para salir.");
            }
            System.out.println();
        }
    }
    /*1. Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo.*/
    /*2. Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se introduzca un 0.*/
    /*3. Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar.*/
    /*4. Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido.*/
    /*5. Realizar un juego para adivinar un número. Para ello pedir un número N, y luego ir pidiendo números indicando “mayor” o “menor” según sea mayor o menor con respecto a N. El proceso termina cuando el usuario acierta. */
}
