package funcionesMatematicas;

import java.util.ArrayList;

public class Main {
    public static void main(String[]args){

    }
    public static boolean esCapicua(int x){
        return true;
    }
    public static boolean esPrimo(int x){
        for (int i=2;i<x;i++){
            if (x%i==0){
                return false;
            }
        }
        return true;
    }
    public static int siguientePrimo(int x){
        while(!esPrimo(x++)){}
        return x;
    }
    public static double potencia(int a, int b){
        return Math.pow(a,b);
    }
    public static int digitos(long x){
        if (x<0){
            x=-x;
        }
        if (x==0){
            return 1;
        }else{
            int n=0;
            while (x>0){
                x=x/10;
                n++;
            }
            return n;
        }
    }
    public static long voltea(long x){
        if(x<0){

        }
        ArrayList<Integer>digitos=new ArrayList<>();
        while(x>0){
            digitos.add((int)(x%10));
            x=x/10;
        }
        long volteado=0;
        for (int i =0;i<digitos.size();i++){
            volteado=(volteado*10)+digitos.get(i);
        }
        return x;
    }
    public static int digitoN(long x,int n){

    }
}
