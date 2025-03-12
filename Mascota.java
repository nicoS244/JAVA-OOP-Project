/**
 * Clase abstracta Mascota
 * Se definen los atributos, constructores y métodos de la clase mascota.
 * @version 07/12/2023
 * @author Jhonatan Emmanuel Amaya Esquivel
 * @author José Guadalupe Baños Monjaraz
 * @author Miguel Nicolás Sarmiento Monroy
 * @author Samuel Ortiz Díaz
 * @author Sergio Bruno Ramírez Gutiérrez
 */

public abstract class Mascota {
    /**
     * Nombre de la mascota.
     */
    private String nombre;
    /**
     * Edad de la mascota.
     */
    private int edad;
    /**
     * Tipo de pelo de la mascota.
     */
    private String tipoDePelo;

    /**
     * Constructor que recibe parámetros.
     * @param nombre El nombre de la mascota.
     * @param edad La edad de la mascota
     * @param tipoDePelo Tipo de pelo de la mascota.
     */
    public Mascota(String nombre, int edad, String tipoDePelo){
        this.nombre = nombre;
        this.edad = edad;
        this.tipoDePelo = tipoDePelo;
    }

    /**
     * Constructor vacío.
     * Inicializa los atributos a valores por defecto.
     */
    public Mascota(){
        this.nombre = null;
        this.edad = 0;
        this.tipoDePelo = null;
    }

    /**
     * Método get del atributo nombre.
     * @return El nombre de la mascota
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método set del atributo nombre.
     * @param nombre El nombre de la mascota
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método get del atributo edad.
     * @return La edad de la mascota.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Método set del atributo edad.
     * @param edad La edad de la mascota.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Método get del atributo tipoDePelo.
     * @return El tipo de pelo de la mascota
     */
    public String getTipoDePelo() {
        return tipoDePelo;
    }

    /**
     * Método set del atributo tipoDePelo.
     * @param tipoDePelo El tipo de pelo de la mascota.
     */
    public void setTipoDePelo(String tipoDePelo) {
        this.tipoDePelo = tipoDePelo;
    }
}