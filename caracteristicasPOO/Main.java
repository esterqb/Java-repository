package caracteristicasPOO;

public class Main {
    Animal gato1=new Gato ("Chirrimiau",4);
    Animal gato2=new Gato ("Mateo",3);
    @Override
    public void sonido(){
        System.out.println(gato1 +" dice: Miau");
        System.out.println(gato2 +" dice: Miau");
    }

}
