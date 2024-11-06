package boletin_uno;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;

import static java.lang.Math.PI;

public class boletinUnoMenu {
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean salir = false;

        while (!salir) {
            System.out.println("----- Menú de Ejercicios -----");
            System.out.println("0. Salir");
            System.out.println("1. Pedir los coeficientes de una ecuación de 2o grado, y muestre sus soluciones reales. Si no existen, debe indicarlo.");
            System.out.println("2. Pedir el radio de un círculo y calcular su área.");
            System.out.println("3. Pedir el radio de una circunferencia y calcular su longitud.");
            System.out.println("4. Pedir dos números y decir si son iguales o no.");
            System.out.println("5. Pedir un número e indicar si es positivo o negativo.");
            System.out.println("6. Pedir dos números y decir si uno es múltiplo del otro.");
            System.out.println("7. Pedir dos números y decir cual es el mayor.");
            System.out.println("8. Pedir dos números y decir cual es el mayor o si son iguales.");
            System.out.println("9. Pedir dos números y mostrarlos ordenados de mayor a menor.");
            System.out.println("10. Pedir tres números y mostrarlos ordenados de mayor a menor.");
            System.out.println("11. Pedir un número entre 0 y 9.999 y decir cuantas cifras tiene.");
            System.out.println("12. Pedir un número entre 0 y 9.999 y mostrarlo con las cifras al revés.");
            System.out.println("13. Pedir un número entre 0 y 9.999, decir si es capicúa.");
            System.out.println("14. Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien...");
            System.out.println("15. Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Suponiendo todos los meses de 30 días.");
            System.out.println("16. Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Con meses de 28, 30 y 31 días. Sin años bisiestos.");
            System.out.println("22. Pedir un número de 0 a 99 y mostrarlo escrito.");
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
                case 7:
                    ej7(br);
                    break;
                case 8:
                    ej8(br);
                    break;
                case 9:
                    ej9(br);
                    break;
                case 10:
                    ej10(br);
                    break;
                case 11:
                    ej11(br);
                    break;
                case 12:
                    ej12(br);
                    break;
                case 13:
                    ej13(br);
                    break;
                case 14:
                    ej14(br);
                    break;
                case 15:
                    ej15(br);
                    break;
                case 16:
                    ej16(br);
                    break;
                case 22:
                    ej22(br);
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción del 1 al 22. Pulsa 0 para salir.");
            }
            System.out.println();
        }
    }


    /*1. Pedir los coeficientes de una ecuación de 2o grado, y muestre sus soluciones reales. Si
    no existen, debe indicarlo.*/
    public static void ej1 (BufferedReader br) throws IOException {
        System.out.println("Pedir los coeficientes de una ecuación de 2o grado, y muestre sus soluciones reales. Si no existen, debe indicarlo.");
        double a, b, c;
        System.out.println("Introduce un primer número: ");
        a = Double.parseDouble(br.readLine());

        System.out.println("Introduce un segundo número: ");
        b = Double.parseDouble(br.readLine());

        System.out.println("Introduce un tercer número: ");
        c = Double.parseDouble(br.readLine());

        double x1, x2, d;
        d = ((b * b) - 4 * a * c);
        if (d < 0)
            System.out.println("No existen soluciones reales.");
        else {

            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Solución: " + x1);
            System.out.println("Solución: " + x2);
        }

        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
    }

        /*2. Pedir el radio de un círculo y calcular su área. A=PI*r^2.*/
    public static void ej2 (BufferedReader br) throws IOException {
        System.out.println("Pedir el radio de un círculo y calcular su área. A=PI*r².");
        double radio;
        System.out.println("Introduce el radio de un círculo en cm: ");
        radio = Double.parseDouble(br.readLine());

        System.out.println("El área del círculo con radio " + radio + " es " + Math.round(PI * Math.pow(radio, 2)) + "cm².");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

    }
        /*3. Pedir el radio de una circunferencia y calcular su longitud. L=2*PI*r.*/
    public static void ej3 (BufferedReader br) throws IOException {
        System.out.println("Pedir el radio de una circunferencia y calcular su longitud. L=2*PI*r.");
        double radio2;
        System.out.println("Introduce el radio de una circunferencia en cm: ");
        radio2 = Double.parseDouble(br.readLine());

        System.out.println("El área de una circunferencia con radio " + radio2 + " es " + Math.round(2 * PI * radio2) + "cm².");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

    }
        /*4. Pedir dos números y decir si son iguales o no.*/
    public static void ej4 (BufferedReader br) throws IOException {
        System.out.println("Pedir dos números y decir si son iguales o no.");
        int primnum, segnum;
        System.out.println("Introduce un primer número: ");
        primnum = Integer.parseInt(br.readLine());

        System.out.println("Introduce un segundo número: ");
        segnum = Integer.parseInt(br.readLine());

        if (primnum == segnum) {
            System.out.println(primnum + " y " + segnum + " son iguales");
        } else {
            System.out.println(primnum + " y " + segnum + " no son iguales");
        }
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

    }
        /*5. Pedir un número e indicar si es positivo o negativo.*/
    public static void ej5 (BufferedReader br) throws IOException {
        System.out.println("Pedir un número e indicar si es positivo o negativo.");
        int numerito;
        System.out.println("Introduce un número: ");
        numerito = Integer.parseInt(br.readLine());

        if (numerito < 0) {
            System.out.println(numerito + " es negativo.");
        } else {
            System.out.println(numerito + " es positivo.");
        }
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

    }
        /*6. Pedir dos números y decir si uno es múltiplo del otro.*/
    public static void ej6 (BufferedReader br) throws IOException {
        System.out.println("Pedir dos números y decir si uno es múltiplo del otro.");
        int num1, num2;
        System.out.println("Introduce un número: ");
        num1 = Integer.parseInt(br.readLine());

        System.out.println("Introduce otro número: ");
        num2 = Integer.parseInt(br.readLine());

        if (num1 % num2 == 0) {
            System.out.println(num1 + " es múltiplo de " + num2);
        } else {
            System.out.println(num1 + " no es múltiplo de " + num2);
        }
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

    }
        /*7. Pedir dos números y decir cual es el mayor.*/
    public static void ej7 (BufferedReader br) throws IOException {
        System.out.println("Pedir dos números y decir cual es el mayor.");
        int num1, num2;
        System.out.println("Introduce un número: ");
        num1 = Integer.parseInt(br.readLine());

        System.out.println("Introduce otro número: ");
        num2 = Integer.parseInt(br.readLine());

        if (num1 > num2) {
            System.out.println(num1 + " es mayor que " + num2);
        } else {
            System.out.println(num2 + " es mayor que " + num1);
        }
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
    }
        /*8. Pedir dos números y decir cual es el mayor o si son iguales.*/
    public static void ej8 (BufferedReader br) throws IOException {
        System.out.println("Pedir dos números y decir cual es el mayor o si son iguales.");
        int num1, num2;
        System.out.println("Introduce un número: ");
        num1 = Integer.parseInt(br.readLine());

        System.out.println("Introduce otro número: ");
        num2 = Integer.parseInt(br.readLine());

        if (num1 >= num2) {
            System.out.println(num1 + " es mayor que " + num2);
        } else if (num1 <= num2) {
            System.out.println(num2 + " es mayor que " + num1);
        } else {
            System.out.println(num2 + " es igual que " + num1);
        }
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
    }
        /*9. Pedir dos números y mostrarlos ordenados de mayor a menor.*/
    public static void ej9 (BufferedReader br) throws IOException {
        System.out.println("Pedir dos números y mostrarlos ordenados de mayor a menor.");
        int n1;
        System.out.println("Introduce un número: ");
        n1 = Integer.parseInt(br.readLine());

        int n2;
        System.out.println("Introduce otro número: ");
        n2 = Integer.parseInt(br.readLine());

        if (n1 >= n2) {
            System.out.println(n1 + ">" + n2);
        } else {
            System.out.println(n1 + "<" + n2);
        }
        //int [] arr;
        //arr=new int[n1];
        //arr=new int[n2];
        //System.out.println("Tenemos la lista de números: "+arr);
        /*Ordenador de mayor a menor: "+ arr=-Arrays.sort(-arr)*/
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
    }

        /*10. Pedir tres números y mostrarlos ordenados de mayor a menor.*/
    public static void ej10 (BufferedReader br) throws IOException {

        System.out.println("Pedir tres números y mostrarlos ordenados de mayor a menor.");
        int numero1, numero2, numero3;
        System.out.println("Introduce un primer número: ");
        numero1 = Integer.parseInt(br.readLine());

        System.out.println("Introduce un segundo número: ");
        numero2 = Integer.parseInt(br.readLine());

        System.out.println("Introduce un tercer número: ");
        numero3 = Integer.parseInt(br.readLine());

        if (numero1 >= numero2 && numero1 >= numero3 && numero2 >= numero3) {
            System.out.println(numero1 + ">" + numero2 + ">" + numero3);
        } else if (numero1 >= numero2 && numero1 >= numero3 && numero2 <= numero3) {
            System.out.println(numero1 + ">" + numero3 + ">" + numero2);
        } else if (numero2 >= numero1 && numero2 >= numero3 && numero1 <= numero3) {
            System.out.println(numero2 + ">" + numero1 + ">" + numero3);
        } else if (numero2 >= numero1 && numero2 >= numero3 && numero3 <= numero1) {
            System.out.println(numero2 + ">" + numero3 + ">" + numero1);
        } else if (numero3 >= numero1 && numero3 >= numero2 && numero1 <= numero2) {
            System.out.println(numero3 + ">" + numero1 + ">" + numero2);
        } else if (numero3 >= numero1 && numero3 >= numero2 && numero2 <= numero1) {
            System.out.println(numero3 + ">" + numero2 + ">" + numero1);
        }

        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

        System.out.println("Lo mismo pero con array.");
        Integer[] arr = new Integer[3];
        System.out.println("Introduce un primer número: ");
        arr[0] = Integer.parseInt(br.readLine());

        System.out.println("Introduce un segundo número: ");
        arr[1] = Integer.parseInt(br.readLine());

        System.out.println("Introduce un tercer número: ");
        arr[2] = Integer.parseInt(br.readLine());

        System.out.println("Lista de números: " + arr);
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Lista en orden descendente: " + arr);
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
    }
        /*11. Pedir un número entre 0 y 9.999 y decir cuantas cifras tiene.*/
    public static void ej11 (BufferedReader br) throws IOException {
        int numero_cifras;
        System.out.println("Pedir un número entre 0 y 9.999 y decir cuantas cifras tiene.");
        numero_cifras = Integer.parseInt(br.readLine());

        String cadenanum = String.valueOf(numero_cifras);
        System.out.println("El número " + numero_cifras + " tiene " + cadenanum.length() + " cifras.");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
    }
        /*12. Pedir un número entre 0 y 9.999 y mostrarlo con las cifras al revés.*/
    public static void ej12 (BufferedReader br) throws IOException {
        System.out.println("Pedir un número entre 0 y 9.999 y mostrarlo con las cifras al revés.");
        int cifras_reves;
        System.out.println("Introduce un número: ");
        cifras_reves = Integer.parseInt(br.readLine());

        String cifras_cadena = String.valueOf(cifras_reves); /*el int lo pasamos a cadena*/
        String s2 = ""; /*cadena auxiliar*/

        for (cifras_reves = cifras_cadena.length() - 1; cifras_reves >= 0; cifras_reves--) {
            //la cadena al revés se hace iterando en bucle desde la última cifra y se almacena en la cadena auxiliar, así se van almacenando al revés
            s2 = s2 + cifras_cadena.charAt(cifras_reves);
        }
        System.out.println("El número al revés es " + s2);
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
    }
        /*13. Pedir un número entre 0 y 9.999, decir si es capicúa.*/
    public static void ej13 (BufferedReader br) throws IOException {

        int num_capicua;
        System.out.println("Introduce un número entre 0 y 9999: ");
        num_capicua = Integer.parseInt(br.readLine());
        String numero_capicua = Integer.toString(num_capicua);
        int length_cad = numero_capicua.length();
        boolean capicua = true;
        for (int i = 0; i < length_cad / 2; i++) {
            if (numero_capicua.charAt(i) != numero_capicua.charAt(length_cad - 1 - i)) {
                capicua = false;
                break;
            }
        }
        if (capicua) {
            System.out.println("El número " + numero_capicua + " es capicúa.");
        } else {
            System.out.println("El número " + numero_capicua + " no es capicúa.");
        }

        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
    }
        /*14. Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien...*/
    public static void ej14 (BufferedReader br) throws IOException {

        int nota;
        System.out.println("Introduce tu nota del examen: ");
        nota = Integer.parseInt(br.readLine());
        if (nota < 5) {
            System.out.println("Insuficiente");
        } else if (nota == 5) {
            System.out.println("Suficiente");
        } else if (nota == 6) {
            System.out.println("Bien");
        } else if (nota >= 7 && nota <= 8) {
            System.out.println("Notable");
        } else if (nota >= 9 && nota <= 10) {
            System.out.println("Sobresaliente");
        } else {
            System.out.println("Valor incorrecto. A estudiar.");
        }
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
    }
        /*15. Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Suponiendo todos los meses de 30 días.*/
    public static void ej15 (BufferedReader br) throws IOException {
        System.out.println("15. Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Suponiendo todos los meses de 30 días.");

        int mes,dia;
        System.out.println("Introduce un día: ");
        dia=Integer.parseInt(br.readLine());
        System.out.println("Introduce un mes: ");
        mes=Integer.parseInt(br.readLine());
        if (dia>=1 && dia<=30 && mes>=1 && mes<=12){
            System.out.println("La fecha es correcta.");
        }else{
            System.out.println("La fecha no es correcta.");
        }
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
    }
        /*16. Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Con meses de 28, 30 y 31 días.
        Sin años bisiestos.*/
    public static void ej16 (BufferedReader br) throws IOException {
        System.out.println("16. Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Con meses de 28, 30 y 31 días. Sin años bisiestos.");

        int mes, dia;
        System.out.println("Introduce un día: ");
        dia = Integer.parseInt(br.readLine());
        System.out.println("Introduce un mes: ");
        mes = Integer.parseInt(br.readLine());

        int dias=0;

        if (mes < 1 && mes > 12) {
            System.out.println("La fecha es incorrecta.");
        } else {
            switch(mes){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    dias=31;
                    break;
                case 2:
                    dias=28;
                    break;
                case 4: case 6: case 9: case 11:
                    dias=30;
                    break;
            }
            if (dia>=1 && dia<=dias){
                System.out.println("La fecha es correcta. ");
            }else{
                System.out.println("La fecha es incorrecta.");
            }
        }

        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
    }
        /*22. Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56 mostrar: cincuenta y seis.*/
    public static void ej22 (BufferedReader br) throws IOException {

        System.out.println("Introduce un número del 0 al 99 para mostrarlo por escrito: ");
        int num = Integer.parseInt(br.readLine());
        int unidades, decenas;
        unidades = num % 10;
        decenas = num / 10;
        if (num == 11) {
            System.out.print("once");
        } else if (num == 12) {
            System.out.print("doce");
        } else if (num == 13) {
            System.out.print("trece");
        } else if (num == 14) {
            System.out.print("catorce");
        } else if (num == 15) {
            System.out.print("quince");
        } else if (num == 0) {
            System.out.print("cero");
        } else {
            switch (decenas) {
                case 0:
                    System.out.print("");
                    break;
                case 1:
                    System.out.print("diez");
                    break;
                case 2:
                    System.out.print("veinte");
                    break;
                case 3:
                    System.out.print("treinta");
                    break;
                case 4:
                    System.out.print("cuarenta");
                    break;
                case 5:
                    System.out.print("cincuenta");
                    break;
                case 6:
                    System.out.print("sesenta");
                    break;
                case 7:
                    System.out.print("setenta");
                    break;
                case 8:
                    System.out.print("ochenta");
                    break;
                case 9:
                    System.out.print("noventa");
                    break;
            }
            switch (unidades) {
                case 0:
                    System.out.print("");
                    break;
                case 1:
                    System.out.print("uno");
                    break;
                case 2:
                    System.out.print("dos");
                    break;
                case 3:
                    System.out.print("tres");
                    break;
                case 4:
                    System.out.print("cuatro");
                    break;
                case 5:
                    System.out.print("cinco");
                    break;
                case 6:
                    System.out.print("seis");
                    break;
                case 7:
                    System.out.print("siete");
                    break;
                case 8:
                    System.out.print("ocho");
                    break;
                case 9:
                    System.out.print("nueve");
                    break;
            }
        }
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
    }


    }
