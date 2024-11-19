import java.util.Scanner;

public class banderaColores {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String[]color={"rojo","amarillo","verde","blanco","azul", "negro"};
        System.out.println("Introduce un número de franjas que tendrá tu bandera: ");
        int franjas= sc.nextInt();
        System.out.println("-----------------------");
        for (int i = 0; i < franjas; i++){
            System.out.println(color[(int)(Math.random()*color.length)]);
            System.out.println("-----------------------");
        }
    }
}
