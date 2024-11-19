import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import static java.lang.Math.PI;

public class variablesYCondicionales {
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /*1. Pedir los coeficientes de una ecuación de 2o grado, y muestre sus soluciones reales. Si
        no existen, debe indicarlo.*/
        System.out.println("Pedir los coeficientes de una ecuación de 2o grado, y muestre sus soluciones reales. Si no existen, debe indicarlo.");
        double a,b,c;
        System.out.println("Introduce un primer número: ");
        try {
            a=Double.parseDouble(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Introduce un segundo número: ");
        try {
            b=Double.parseDouble(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Introduce un tercer número: ");
        try {
            c=Double.parseDouble(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        double x1,x2,d;
        d=((b*b)-4*a*c);
        if(d<0)
            System.out.println("No existen soluciones reales.");
        else{

            x1=(-b+Math.sqrt(d))/(2*a);
            x2=(-b-Math.sqrt(d))/(2*a);
            System.out.println("Solución: "+x1);
            System.out.println("Solución: "+x2);
        }

        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

        /*2. Pedir el radio de un círculo y calcular su área. A=PI*r^2.*/
        System.out.println("Pedir el radio de un círculo y calcular su área. A=PI*r².");
        double radio;
        System.out.println("Introduce el radio de un círculo en cm: ");
        try {
            radio = Double.parseDouble(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("El área del círculo con radio "+radio+" es "+Math.round(PI*Math.pow(radio,2))+"cm².");

        /*3. Pedir el radio de una circunferencia y calcular su longitud. L=2*PI*r.*/
        System.out.println("Pedir el radio de una circunferencia y calcular su longitud. L=2*PI*r.");
        double radio2;
        System.out.println("Introduce el radio de una circunferencia en cm: ");
        try {
            radio2=Double.parseDouble(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("El área de una circunferencia con radio "+radio2+" es "+Math.round(2*PI*radio2)+"cm².");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

        /*4. Pedir dos números y decir si son iguales o no.*/
        System.out.println("Pedir dos números y decir si son iguales o no.");
        int primnum,segnum;
        System.out.println("Introduce un primer número: ");
        try {
            primnum=Integer.parseInt(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Introduce un segundo número: ");
        try {
            segnum=Integer.parseInt(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if (primnum==segnum) {
            System.out.println(primnum + " y "+ segnum+" son iguales");
        } else{
            System.out.println(primnum + " y "+ segnum+" no son iguales");
        }
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

        /*5. Pedir un número e indicar si es positivo o negativo.*/
        System.out.println("Pedir un número e indicar si es positivo o negativo.");
        int numerito;
        System.out.println("Introduce un número: ");
        try {
            numerito=Integer.parseInt(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if (numerito<0){
            System.out.println(numerito+" es negativo.");
        }else{
            System.out.println(numerito+" es positivo.");
        }
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

        /*6. Pedir dos números y decir si uno es múltiplo del otro.*/
        System.out.println("Pedir dos números y decir si uno es múltiplo del otro.");
        int num1,num2;
        System.out.println("Introduce un número: ");
        try {
            num1=Integer.parseInt(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Introduce otro número: ");
        try {
            num2=Integer.parseInt(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if(num1%num2==0){
            System.out.println(num1 +" es múltiplo de "+num2);
        }else{
            System.out.println(num1 +" no es múltiplo de "+num2);
        }
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

        /*7. Pedir dos números y decir cual es el mayor.*/
        System.out.println("Pedir dos números y decir cual es el mayor.");

        if (num1>num2){
            System.out.println(num1 +" es mayor que "+num2);
        } else {
            System.out.println(num2 +" es mayor que "+num1);
        }
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

        /*8. Pedir dos números y decir cual es el mayor o si son iguales.*/
        System.out.println("Pedir dos números y decir cual es el mayor o si son iguales.");

        if (num1>=num2){
            System.out.println(num1 +" es mayor que "+num2);
        } else if (num1<=num2){
            System.out.println(num2 +" es mayor que "+num1);
        } else{
            System.out.println(num2 +" es igual que "+num1);
        }
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

        /*9. Pedir dos números y mostrarlos ordenados de mayor a menor.*/
        System.out.println("Pedir dos números y mostrarlos ordenados de mayor a menor.");
        int n1;
        System.out.println("Introduce un número: ");
        try {
            n1=Integer.parseInt(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int n2;
        System.out.println("Introduce otro número: ");
        try {
            n2=Integer.parseInt(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if(n1>=n2){
            System.out.println(n1+">"+n2);
        }else{
            System.out.println(n1+"<"+n2);
        }
        //int [] arr;
        //arr=new int[n1];
        //arr=new int[n2];
        //System.out.println("Tenemos la lista de números: "+arr);
                /*Ordenador de mayor a menor: "+ arr=-Arrays.sort(-arr)*/
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

        /*10. Pedir tres números y mostrarlos ordenados de mayor a menor.*/
        System.out.println("Pedir tres números y mostrarlos ordenados de mayor a menor.");
        int numero1,numero2,numero3;
        System.out.println("Introduce un primer número: ");
        try {
            numero1=Integer.parseInt(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Introduce un segundo número: ");
        try {
            numero2=Integer.parseInt(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Introduce un tercer número: ");
        try {
            numero3=Integer.parseInt(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if (numero1>=numero2 && numero1>=numero3 && numero2>=numero3){
            System.out.println(numero1+">"+numero2+">"+numero3);
        }else if(numero1>=numero2 && numero1>=numero3 && numero2<=numero3){
            System.out.println(numero1+">"+numero3+">"+numero2);
        }else if(numero2>=numero1 && numero2>=numero3 && numero1<=numero3){
            System.out.println(numero2+">"+numero1+">"+numero3);
        }else if(numero2>=numero1 && numero2>=numero3 && numero3<=numero1){
            System.out.println(numero2+">"+numero3+">"+numero1);
        }else if(numero3>=numero1 && numero3>=numero2 && numero1<=numero2){
            System.out.println(numero3+">"+numero1+">"+numero2);
        }else if(numero3>=numero1 && numero3>=numero2 && numero2<=numero1){
            System.out.println(numero3+">"+numero2+">"+numero1);
        }

        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

        System.out.println("Lo mismo pero con array.");
        Integer [] arr=new Integer[3];
        System.out.println("Introduce un primer número: ");
        try {
            arr[0]=Integer.parseInt(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Introduce un segundo número: ");
        try {
            arr[1]=Integer.parseInt(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Introduce un tercer número: ");
        try {
            arr[2]=Integer.parseInt(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Lista de números: "+ arr);
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Lista en orden descendente: "+arr);
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

        /*11. Pedir un número entre 0 y 9.999 y decir cuantas cifras tiene.*/
        System.out.println("Pedir un número entre 0 y 9.999 y decir cuantas cifras tiene.");
        int numero_cifras;
        try {
            numero_cifras= Integer.parseInt(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //comprobación de errores

        String cadenanum= String.valueOf(numero_cifras);
        System.out.println("El número "+numero_cifras+" tiene "+ cadenanum.length()+" cifras.");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

        /*12. Pedir un número entre 0 y 9.999 y mostrarlo con las cifras al revés.*/
        System.out.println("Pedir un número entre 0 y 9.999 y mostrarlo con las cifras al revés.");

        System.out.println("Introduce un número: ");
        int cifras_reves;
        try {
            cifras_reves=Integer.parseInt(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String cifras_cadena= String.valueOf(cifras_reves); /*el int lo pasamos a cadena*/
        String s2 = ""; /*cadena auxiliar*/

        for(cifras_reves = cifras_cadena.length()-1; cifras_reves>=0; cifras_reves--)
        {
            //la cadena al revés se hace iterando en bucle desde la última cifra y se almacena en la cadena auxiliar, así se van almacenando al revés
            s2 = s2 + cifras_cadena.charAt(cifras_reves);
        }
        System.out.println("El número "+cifras_reves+" al revés es "+ s2);
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

        /*13. Pedir un número entre 0 y 9.999, decir si es capicúa.*/


        /*14. Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien...*/
        int nota;
        System.out.println("Introduce tu nota del examen: ");
        nota=Integer.parseInt(br.readLine());
        if (nota<5){
            System.out.println("Insuficiente");
        }else if (nota==5){
            System.out.println("Suficiente");
        }else if (nota==6){
            System.out.println("Bien");
        }else if (nota>=7 && nota<=8){
            System.out.println("Notable");
        }else if (nota>=9 && nota<=10) {
            System.out.println("Sobresaliente");
        }else{
            System.out.println("Valor incorrecto. A estudiar.");
        }

        /*15. Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Suponiendo todos los meses de 30 días.*/
        /*16. Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Con meses de 28, 30 y 31 días.
        Sin años bisiestos.*/
        LocalDate fecha;
        System.out.println("Introduce una fecha en formato YYYY-MM-DD: ");
        fecha= LocalDate.ofEpochDay(Integer.parseInt(br.readLine()));
        System.out.println(fecha);

        /*22. Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56 mostrar: cincuenta y seis.*/
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
    }
}
