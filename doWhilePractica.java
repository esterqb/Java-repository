import java.util.Scanner;

public class doWhilePractica {
    public static void main(String[]args){
       // int i=1;
        //do{
          //  System.out.println(i);
            //i++;
        //} while (i<11);

        /*con bucle do while: que termine cuando se introduzca por teclado un número impar*/
        int i;

        do {
            Scanner sc=new Scanner(System.in);
            System.out.println("Introduce un número: ");
            i= sc.nextInt();
            System.out.println(i);
        }while(i%2==0);
    }
    }
