/**
 * Clase Perro, heredera de Mascota.
 * Se define un atributo, constructores y métodos.
 * @version 07/12/2023
 * @author Jhonatan Emmanuel Amaya Esquivel
 * @author José Guadalupe Baños Monjaraz
 * @author Miguel Nicolás Sarmiento Monroy
 * @author Samuel Ortiz Díaz
 * @author Sergio Bruno Ramírez Gutiérrez
 */
public class Perro extends Mascota{
    /**
     * La altura del perro.
     */
    private String altura;

    /**
     * Constructor que recibe parámetros.
     * @param nombre El nombre del perro.
     * @param edad La edad del perro.
     * @param tipoDePelo El tipo de pelo del perro.
     * @param altura La altura del perro.
     */
    public Perro(String nombre, int edad, String tipoDePelo, String altura){
        super(nombre, edad, tipoDePelo);
        this.altura = altura;
    }

    /**
     * Constructor vacío.
     * Inicializa los valores de los atributos por defecto.
     */
    public Perro(){
        super();
        this.altura = null;
    }

    /**
     * Método get del atributo altura.
     * @return La altura del perro.
     */
    public String getAltura() {
        return altura;
    }

    /**
     * Método set del atributo altura.
     * @param altura La altura del perro.
     */
    public void setAltura(String altura) {
        this.altura = altura;
    }

    /**
     * Método para imprimir un ladrido en pantalla.
     */
    public void ladrar(){
        System.out.println("Guauu Guauu");
    }
}