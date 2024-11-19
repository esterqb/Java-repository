import java.util.Scanner;

public class practicaUno {
    public static void main(String[] args) {
        /*1. Leer una cantidad ‘N’ y luego introducir ‘N’ números enteros. Se pide imprimir
        el mayor y el menor y las veces que aparece cada uno. */
        Scanner sc = new Scanner(System.in);
        int num;
        while (true){
            System.out.println("Introduce números. Para salir, introduce 0: ");
            num=sc.nextInt();
            /*int numeros[]={num=sc.nextInt()};*/
            if(num==0){
                break;
            }
        }
        sc.close();
        /*System.out.println(numeros);*/
    }
}
