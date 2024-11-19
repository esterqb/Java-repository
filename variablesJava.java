import java.util.Scanner;

public class variablesJava {
    public static void main(String[]args){
        /*Ejercicio 1. Escribe un programa en el que se declaren las variables enteras x e y.
        Asignales los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
        el valor de cada variable, la suma, la resta, la división y la multiplicación.*/
        int x=144;
        int y=999;
        System.out.println("El valor de la primera variable 'x' es "+x+" , y el valor de la" +
                "segunda variable 'y' es " + y);
        System.out.println("La suma de x+y="+(x+y));
        System.out.println("La resta de x-y="+(x-y));
        System.out.println("La división de x/y="+((double)x/(double)y));
        System.out.println("La multiplicación de x*y="+(x*y));

        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        /*Ejercicio 4 Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
        convertir deberá estar almacenada en una variable.*/
        double euros;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce la cantidad de euros que quieres convertir a pesetas: ");
        euros=sc.nextDouble();
        System.out.println(euros + "€ = "+euros*166.38+"ptas.");

        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

        /*Ejercicio 5. Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
        convertir deberá estar almacenada en una variable.*/
        double pesetas;
        System.out.println("Introduce la cantidad de pesetas que quieres convertir a euros: ");
        pesetas=sc.nextDouble();
        System.out.println(pesetas + "ptas = "+pesetas/166.38+"€.");

        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

        /*Ejercicio 6. Escribe un programa que calcule el total de una factura a partir de la base
        imponible (precio sin IVA). La base imponible estará almacenada en una variable.*/
        double IVA=1.21;
        double sin_IVA;
        System.out.println("Introduce la cantidad de tu factura: ");
        sin_IVA=sc.nextDouble();
        System.out.println("El precio de tu factura con el IVA es de: "+sin_IVA*IVA+"€.");


    }
}
