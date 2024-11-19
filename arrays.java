public class arrays {
    public static void main(String[]args){
        /*arrays de una dimensión*/
        int[]nombre; //se define, o bien int [] nombre= new int[4];
        nombre=new int[4]; //me hace 4 huecos
        nombre[0]=23; //la posición 0 tiene como valor 23
        nombre [1]=-33;
        nombre[2]=0;
        nombre[3]=7; // o bien: int[]nombre={23,-33,0,7}
        System.out.println(nombre[3]+nombre[0]);
        for (int i=0;i< nombre.length;i++){ //recorrer un array con bucle for
            System.out.println(nombre[i]);
        }
    }
}
