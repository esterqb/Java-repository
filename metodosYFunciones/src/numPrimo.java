import java.util.Scanner;
public class numPrimo {
    public static void main(String[] args) {
        System.out.println("Introduce un número para saber si es primo: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(esPrimo(num)){
            System.out.println("El número "+num+" es primo.");
        }else{
            System.out.println("El número "+num+" no es primo.");
        }
    }
    //boolean esPrimo
    public static boolean esPrimo(int num){
        if (num<2){
            return false;
        }
        for(int i=2;i<num;i++){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }

}