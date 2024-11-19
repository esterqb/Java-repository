import java.util.Scanner;

public class lecturaDatos {
    public static void main (String[] args){
        /*Ejercicio 1. Realiza un programa que pida dos números y que luego muestre el resultado
        de su multiplicación.*/
        int num1;
        int num2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un número: ");
        num1=sc.nextInt();
        System.out.println("Introduce otro número: ");
        num2=sc.nextInt();
        System.out.println("El resultado de la multiplicación de "+num1+"x"+num2+"="+num1*num2);

        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

        /*Ejercicio 4. Escribe un programa que sume, reste, multiplique y divida dos números
        introducidos por teclado.*/
        int numero1;
        int numero2;
        System.out.println("Introduce un número: ");
        numero1=sc.nextInt();
        System.out.println("Introduce otro número: ");
        numero2=sc.nextInt();
        System.out.println(numero1+"+"+numero2+"="+numero1+numero2);
        System.out.println(numero1+"-"+numero2+"="+(numero1-numero2));
        System.out.println(numero1+"x"+numero2+"="+numero1*numero2);
        System.out.println(numero1+"/"+numero2+"="+((double)numero1/(double)numero2));

        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

        /*Ejercicio 5. Escribe un programa que calcule el área de un rectángulo.*/
        int ancho;
        int largo;
        System.out.println("Introduce el largo de un rectángulo en cm: ");
        largo=sc.nextInt();
        System.out.println("Introduce el ancho de un rectángulo en cm: ");
        ancho=sc.nextInt();
        System.out.println("El área del rectángulo es de "+largo*ancho+"cm²");

        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

        /*Ejercicio 6. Escribe un programa que calcule el área de un triángulo.*/
        int base;
        int altura;
        System.out.println("Introduce la base de un triángulo en cm: ");
        base=sc.nextInt();
        System.out.println("Introduce la altura de un rectángulo en cm: ");
        altura=sc.nextInt();
        System.out.println("El área del triángulo es de "+(base*altura)/2+"cm²");

        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

        /*Ejercicio 8. Escribe un programa que calcule el salario semanal de un empleado en base
        a las horas trabajadas, a razón de 12 euros la hora.*/
        int horas_trabajadas;
        System.out.println("Nº de horas trabajadas esta semana: ");
        horas_trabajadas=sc.nextInt();
        System.out.println("Salario de esta semana: "+ horas_trabajadas*12);

        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

        /*Ejercicio 9. Realiza un conversor de Mb a Kb.*/
        double Mb;
        System.out.println("Nº de Mb a convertir a Kb: ");
        Mb=sc.nextInt();
        System.out.println(Mb+"Mb = "+Mb*1000+"Kb");

        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

        /*Ejercicio 10. Realiza un conversor de Kb a Mb.*/
        double Kb;
        System.out.println("Nº de Kb a convertir a Mb: ");
        Kb=sc.nextInt();
        System.out.println(Kb+"Kb = "+Kb/1000+"Mb");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

        /*Ejercicio 11. Realiza un programa que calcule la nota que hace falta sacar en el segundo
        examen de la asignatura Programación para obtener la media deseada. Hay
        que tener en cuenta que la nota del primer examen cuenta el 40% y la del
        segundo examen un 60%. Ejemplo de salida esperada:
                    Introduce la nota del primer examen: 7
                    ¿Qué nota quieres sacar en el trimestre? 8.5
                    Para tener un 8.5 en el trimestre necesitas sacar un 9.5 en el segundo examen.*/
        double nota_primero;
        double nota_trimestre;
        System.out.println("Introduce la nota del primer examen: ");
        nota_primero=sc.nextDouble();
        System.out.println("¿Qué nota quieres sacar en el trimestre?: ");
        nota_trimestre=sc.nextDouble();
        System.out.println("Para tener un "+nota_trimestre+" en el trimestre necesitas sacar un "+(nota_trimestre-nota_primero)+nota_primero+"en el segundo examen.");

        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

    }
}
