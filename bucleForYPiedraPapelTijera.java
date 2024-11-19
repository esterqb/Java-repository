public class bucleForYPiedraPapelTijera {
    public static void main(String[]args){
        System.out.println("20 números aleatorios entre 0 y 10");
        System.out.println("Sin llegar a 10 (con decimales):");
        for (int i=1; i<=20; i++){
            System.out.println(Math.round(Math.random()*10));
        }
        System.out.println("Genera al azar un piedra papel o tijera: ");
        switch ((int)(Math.random()*3)){
            case 0:
                System.out.println("Piedra");
                break;
            case 1:
                System.out.println("Papel");
                break;
            case 2:
                System.out.println("Tijera");
                break;
        }

        int dia=(int)(Math.random()*7)+1;//+1 para saltarte el 0
        switch(dia){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        }

    }
}
