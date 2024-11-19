package caracteristicasPOO;

public class Gato extends Animal{
    public Gato(String nombre, int edad){
        super(nombre,edad);
    }
    @Override
    public void sonido(){
        System.out.println(getNombre()+"dice: Miau");
    }

}
