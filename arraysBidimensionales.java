import java.util.Arrays;

public class arraysBidimensionales {
    public static void main (String[] args){
        int [][] n =new int[3][2];
        n[0][0]=1; //fila-columna
        n[0][1]=2;
        n[1][0]=3;
        n[1][1]=4;
        n[2][0]=5;
        n[2][1]=6;
        System.out.println(Arrays.deepToString(n));
        //anidado:
        int fila, columna;
        for(fila=0;fila<3;fila++){
            System.out.println("Fila:" + fila);
                for(columna=0;columna<2;columna++){
                    System.out.println(n[fila][columna]);
                }
        }


    }
}
