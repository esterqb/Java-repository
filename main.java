import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    public static void main(String[] args) throws IOException {
        /*22. Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56 mostrar: cincuenta y seis.*/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

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
