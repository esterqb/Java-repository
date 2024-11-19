package POO_explicacion;
/**
* Clase que representa a una persona
 * @author Ester Cubero
* */

public class Persona {
    private String nombre;
    private int edad;
    private double altura;

    //las siguientes clases deben ir dentro de public class Persona ****!!!!!

    //Constructor por defecto
    public Persona(){
        this.nombre="Ester";
        this.edad=25;
        this.altura=1.58;
    }
    /**
    * Constructor parametrizado de la clase Pesona
    * @param nombre Nombre de la persona
    * @param edad Edad de la persona
    * @param altura Altura de la persona
    * */
    public Persona(String nombre, int edad, double altura){
        this.nombre=nombre;
        this.edad=edad;
        this.altura=altura;
    }
    /**
    * Obtiene el nombre de la persona
    * @return El nombre de la persona
    * */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre.
     *
     * @param nombre El nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene edad.
     *
     * @return la edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece edad.
     *
     * @param edad la edad
     */
    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("Edad no válida.");
        }
    }

    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura){
        if (altura > 0) {
            this.altura = altura;
        } else {
            System.out.println("Edad no válida.");
        }
    }

    public static void main(String[] args) {
        //Crear una instancia por el constructor por defecto
        Persona persona1 = new Persona();
        System.out.println("Persona 1 (Constructor por defecto):");
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Edad: "+persona1.getEdad());
        System.out.println("Altura: "+persona1.getAltura());

        //Crear una instancia con el constructor parametrizado
        Persona persona2=new Persona();

    }
}

