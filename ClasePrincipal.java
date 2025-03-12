import java.util.ArrayList;

/**
 * Clase principal de la aplicación.
 * En esta se define el método principal desde el cual se mandan a llamar los distintos métodos para el despliegue de menus de interacción según la opción del usuario.
 * @version 07/12/2023
 * @author Jhonatan Emmanuel Amaya Esquivel
 * @author José Guadalupe Baños Monjaraz
 * @author Miguel Nicolás Sarmiento Monroy
 * @author Samuel Ortiz Díaz
 * @author Sergio Bruno Ramírez Gutiérrez
 */

public class ClasePrincipal {
    public static void main(String[] args){
        int opcionSwitch1;
        ArrayList<Empleado> empleados = new ArrayList<>(); //Para que todos los administradores accedan a los empleados atravez de una arraylist
        LectorDeArchivos.llenarArraylistEmpleados(empleados);
        do{
            opcionSwitch1 = Utilidades.menuPrincipal();
            switch(opcionSwitch1){
                case 1:
                    Utilidades.menuNuevoRegistro(); //Se despliega el menu de interacción para realizar un nuevo registro.
                    Utilidades.limpPantalla();
                    break;
                case 2:
                    Utilidades.menuIngresar(empleados); //Se despliega el menu de interacción para ingresar al sistema con un registro ya existente.
                    Utilidades.limpPantalla();
                    break;
                case 3:
                    Utilidades.limpPantalla();
                    System.out.println("Cerrando sistema..."); //Se imprime este mensaje indicando que se terminara la ejecución del programa.
                    break;
                default:
                    Utilidades.limpPantalla();
                    System.out.println("Opción no válida. Intente de nuevo"); //Mensaje indicando que la opción ingresada no es válida.
            }
        }while(opcionSwitch1 != 3);
    }
}