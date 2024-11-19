package caracteristicasPOO;

import java.util.Scanner;

/**
 * The type Animal.
 * Se crea una clase abstracta Animal, que sería la clase más general. De aquí se heredarán los objetos.
 */
public abstract class Animal {
    private String sexo;
    private int edad;
    private String nombre;
    private String tipo;

    /**
     * Constructor parametrizado de clase abstracta Animal.
     *
     * @param sexo el sexo
     * @param edad la edad
     */
    public Animal(String sexo, int edad){
        this.nombre=nombre;
        this.tipo=tipo;
        this.edad=edad;
        this.sexo=sexo;
    }

    /**
     * Establecer nombre.
     *
     * @param nombre el nombre
     */
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    /**
     * Obtener nombre.
     *
     * @param nombre the nombre
     */
    public void getNombre(String nombre){

    }
    public void dormir(){
        System.out.println(nombre+" está durmiendo.");
    }
    public void sonido(){
        sonido();
    }
    /**
     * Establecer tipo.
     *
     * @param tipo the tipo
     */
    public void setTipo(String tipo){
        this.nombre=nombre;
    }

    /**
     * Obtiene el nombre.
     *
     * @return el nombre
     */
    public String getNombre() {
        return nombre;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public int getEdad(){return edad;}



}
