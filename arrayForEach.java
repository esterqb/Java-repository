public class arrayForEach {
    public static void main(String[]args){
        String[]paises={"España", "México", "Colombia", "Perú", "Chile", "Argentina", "Ecuador", "Venezuela"};
        //Recorremos la matriz con un bucle for normal:
        for (int i =0; i < paises.length;i++){
            System.out.println("País: "+(i+1)+": "+ paises[i]);
        }
        System.out.println("::::::::::::::::::::::::::::::::::::::::");


        //Recorremos la matriz con un bucle for each: Te despreocupas de dónde empieza y hasta donde llega
        //Problema: no aparecen numerados, pero se podría solucionar con un contador que se incremente en cada vuelta del bucle
        for(String item: paises){ //con esto se recorre cada item de paises
            System.out.println("País: "+item); //y se imprimen
        }

        //con for each:

    }
}
