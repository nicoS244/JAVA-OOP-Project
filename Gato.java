/**
 * Clase Gato, heredera de Mascota.
 * Se definen constructores y un método.
 * @version 07/12/2023
 * @author Jhonatan Emmanuel Amaya Esquivel
 * @author José Guadalupe Baños Monjaraz
 * @author Miguel Nicolás Sarmiento Monroy
 * @author Samuel Ortiz Díaz
 * @author Sergio Bruno Ramírez Gutiérrez
 */
public class Gato extends Mascota{
    /**
     * Constructor que recibe parámetros.
     * @param nombre Nombre del gato
     * @param edad Edad del gato.
     * @param tipoDePelo Tipo de pelo del gato.
     */
    public Gato(String nombre, int edad, String tipoDePelo){
        super(nombre, edad, tipoDePelo);
    }

    /**
     * Constructor vacío.
     * Inicializa los atributos a valores por defecto.
     */
    public Gato(){
        super();
    }

    /**
     * Método para imprimir un maullido en pantalla.
     */
    public void maullar(){
        System.out.println("Miauu Miauu");
    }
}