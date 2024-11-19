import java.util.ArrayList;

public class teoriaArrayList {
    public static void main (String[] args){
        //un ArrayList es lo que conocíamos en Python como LISTA: son mutables
        //es una estructura de datos que permite almacenar elementos de manera dinámica

        //ventaja sobre array: no hay que definir su tamaño de antemano.
        ArrayList<String> nombres=new ArrayList<>();
        nombres.add("Ester");
        nombres.add("Rafa");
        nombres.add("Jose");
        System.out.println("Lista de nombres: "+nombres.remove(1));
        System.out.println("Lista de nombres: "+nombres.add("Pepe"));
        System.out.println("Lista de nombres: "+nombres.get(2));
        System.out.println("Lista de nombres: "+nombres.getFirst());
        System.out.println("Lista de nombres: "+nombres.removeLast());
        System.out.println("Lista de nombres: "+nombres.set(1,"Carmen"));
        System.out.println("Lista de nombres: "+nombres);

        //Get
        System.out.println("Primer nombre: "+nombres.get(0));
        System.out.println("Primer nombre: "+nombres.getFirst());
        System.out.println("Primer nombre: "+nombres.getLast());

        /*
        * add(): metodo para agregar items
        * get(): permite acceder a un elemento por su index
        * set(): cambia un elemento en una posición específica
         */
        nombres.set(1,"Mamen");
        nombres.add("Lucas");
        nombres.add("Marcos");
        nombres.add("Juan");
        System.out.println("Lista actualizada: "+ nombres);

        /*
        *Operaciones de:
        * Iteración y manipulación de elementos.
         */
        ArrayList<String>frutas=new ArrayList<>();
        frutas.add("manzana");
        frutas.add("plátano");
        frutas.add("cereza");
        frutas.add("aceituna");

        for (int i=0;i< frutas.size();i++){ //recorre el tamaño del array
            System.out.println("Fruta "+ (i+1)+ ": "+frutas.get(i));
        }

        for (String fruta : frutas) { //lo mismo pero con for each
            System.out.println(fruta);
        }

        /*ArrayList de enteros empleando lo siguiente:
        * Buscar un número
        * Clonar o copiar el ArrayList
        * Limpiar o vaciar los elementos de ArrayList
         */
        ArrayList<Integer>numeros=new ArrayList<>();
        numeros.add(2);
        numeros.add(5);
        numeros.add(22);
        System.out.println("Lista: "+numeros);
        int numeroBuscado=30;
        if(numeros.contains(numeroBuscado)){
            System.out.println("El número "+numeroBuscado+" está en la lista.");
        }else{
            System.out.println("El número "+ numeroBuscado+" no está en la lista.");
        }
        System.out.println("¿En qué posición del array está el número 5? En la posición "+numeros.indexOf(5));
        ArrayList<Integer> copia=(ArrayList<Integer>)numeros.clone();
        System.out.println("Copia de la lísta de números a otra lista: "+ copia);
        numeros.clear();
        System.out.println("Lista de números despues de numeros.clear(): "+numeros);
    }
}
