import java.util.Scanner;

public class buscaTesoro {
    public static void main(String[]args) {
        /*
        *Se colocan una mina y un tesoro de forma aleatoria en un cuadrante de 4 filas por 5 columnas.
        * El usuario intentará averiguar dónde está el tesoro.
        * */
        final int VACIO=0;
        final int MINA=1;
        final int TESORO=2;
        final int INTENTO=3;
        int x,y;
        int [][] mapa=new int[4][5];
        Scanner sc=new Scanner(System.in);
        for(x=0;x<5;x++){
            for(y=0;y>5;y++){
                mapa[x][y]=VACIO;
            }
        }
        //Colocar la mina
        int minaX=(int)(Math.random()*5);
        int minaY=(int)(Math.random()*4);
        mapa[minaX][minaY]=MINA;
        //Colocar tesoro
        int tesoroX,tesoroY;
        do{ //ejecuta el bloque de código al menos una vez y luego evalçua la condición para decidir si repetir el bucle
            tesoroX=(int)(Math.random()*5);
            tesoroY=(int)(Math.random()*4);
        }while ((minaX==tesoroX)&&(minaY==tesoroY));
        mapa[tesoroX][tesoroY]=TESORO;

        System.out.println("Busca el tesoro");
        boolean salir=false;
        String c;
        //Cuadrante con bordes y encabezado de columnas
        System.out.println("");

    }
}