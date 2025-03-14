import java.io.*;

/**
 * Clase escritora de la aplicación.
 * Se definen métodos para escribir distinta información en los registros de texto.
 * @version 07/12/2023
 * @author Jhonatan Emmanuel Amaya Esquivel
 * @author José Guadalupe Baños Monjaraz
 * @author Miguel Nicolás Sarmiento Monroy
 * @author Samuel Ortiz Díaz
 * @author Sergio Bruno Ramírez Gutiérrez
 */
public class EscritorDeArchivos {
    /**
     * Método para escribir un cliente en el registro de texto.
     * Se obtienen individualmente los atributos del objeto Cliente para crear la cadena que se escribirá en el registro de texto.
     * @param cliente Cliente que se va a escribir en el registro.
     */
    public static void escribirCliente(Cliente cliente){
        try{
            File archivo = new File("RegistroClientes.txt");
            FileWriter escritor = new FileWriter(archivo, true);
            PrintWriter objetoEscritor = new PrintWriter(escritor);
            String cadena = "cliente:";
            String nombre = cliente.getNombre();
            cadena = cadena + nombre + ":";
            String apellidoPaterno = cliente.getApellidoPaterno();
            cadena = cadena + apellidoPaterno + ":";
            String apellidoMaterno = cliente.getApellidoMaterno();
            cadena = cadena + apellidoMaterno + ":";
            int edad = cliente.getEdad();
            cadena = cadena + edad + ":";
            String mail = cliente.getMail();
            cadena = cadena + mail + ":";
            String numeroCelular = cliente.getNumeroCelular();
            cadena = cadena + numeroCelular + ":";
            String direccion = cliente.getDireccion();
            cadena = cadena + direccion + ":";
            String nickname = cliente.getNickname();
            cadena = cadena + nickname + ":";
            String password = cliente.getPassword();
            cadena =  cadena + password;
            objetoEscritor.println(cadena);
            objetoEscritor.close();
        } catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    /**
     * Método para escribir un administrador en el registro de texto.
     * Se obtienen individualmente los atributos del objeto Administrador para crear la cadena que se escribirá en el registro de texto.
     * @param administrador Administrador que se va a escribir en el registro.
     */
    public static void escribirAdministrador(Administrador administrador){
        try{
            File archivo = new File("RegistroAdministradores.txt");
            FileWriter escritor = new FileWriter(archivo, true);
            PrintWriter objetoEscritor = new PrintWriter(escritor);
            String cadena = "administrador:";
            String nombre = administrador.getNombre();
            cadena = cadena + nombre + ":";
            String apellidoPaterno = administrador.getApellidoPaterno();
            cadena = cadena + apellidoPaterno + ":";
            String apellidoMaterno = administrador.getApellidoMaterno();
            cadena = cadena + apellidoMaterno + ":";
            int edad = administrador.getEdad();
            cadena = cadena + edad + ":";
            String mail = administrador.getMail();
            cadena = cadena + mail + ":";
            String numeroCelular = administrador.getNumeroCelular();
            cadena = cadena + numeroCelular + ":";
            String direccion = administrador.getDireccion();
            cadena = cadena + direccion + ":";
            String nickname = administrador.getNickname();
            cadena = cadena + nickname + ":";
            String password = administrador.getPassword();
            cadena =  cadena + password;
            objetoEscritor.println(cadena);
            objetoEscritor.close();
        } catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    /**
     * Método para escribir un perro en el registro de texto.
     * Se obtienen individualmente los atributos del objeto Perro para crear la cadena que se escribirá en el registro de texto, además se concatena al inicio el nickname
     * de su dueño como referencia.
     * @param perro Perro que se va a escribir en el registro.
     * @param nicknameDuenio Nickname del dueño del perro.
     */
    public static void escribirPerro(Perro perro, String nicknameDuenio){
        try{
            File archivo = new File("RegistroMascotas.txt");
            FileWriter escritor = new FileWriter(archivo,true);
            PrintWriter objetoEscritor = new PrintWriter(escritor);
            String cadena = nicknameDuenio + ":";
            cadena = cadena + "perro:";
            String nombreDelPerro = perro.getNombre();
            cadena = cadena + nombreDelPerro + ":";
            int edad = perro.getEdad();
            cadena = cadena + edad + ":";
            String tipoDePelo = perro.getTipoDePelo();
            cadena = cadena + tipoDePelo + ":";
            String altura = perro.getAltura();
            cadena = cadena + altura;

            objetoEscritor.println(cadena);
            objetoEscritor.close();
        }
        catch(IOException e){
            System.out.println(e.toString());
        }
    }

    /**
     * Método para escribir un gato en el registro de texto.
     * Se obtienen individualmente los atributos del objeto Perro para crear la cadena que se escribirá en el registro de texto, además se concatena al inicio el nickname
     * de su dueño como referencia.
     * @param gato Gato que se va a escribir en el registro.
     * @param nicknameDuenio Nickname del dueño del gato.
     */
    public static void escribirGato(Gato gato, String nicknameDuenio){
        try{
            File archivo = new File("RegistroMascotas.txt");
            FileWriter escritor = new FileWriter(archivo,true);
            PrintWriter objetoEscritor = new PrintWriter(escritor);
            String cadena = nicknameDuenio + ":";
            cadena = cadena + "gato:";
            String nombreDelGato = gato.getNombre();
            cadena = cadena + nombreDelGato + ":";
            int edad = gato.getEdad();
            cadena = cadena + edad + ":";
            String tipoDePelo = gato.getTipoDePelo();
            cadena = cadena + tipoDePelo;

            objetoEscritor.println(cadena);
            objetoEscritor.close();
        }
        catch(IOException e){
            System.out.println(e.toString());
        }
    }

    /**
     * Método para escribir un empleado en el registro de texto.
     * Se obtienen individualmente los atributos del objeto Empleado para crear la cadena que se escribirá en el registro de texto.
     * @param elEmpleado Empleado que se va a escribir en el registro.
     */
    public static void escribirEmpleado(Empleado elEmpleado){
        try{
            File archivo = new File("RegistroEmpleados.txt");
            FileWriter escritor = new FileWriter(archivo,true);
            PrintWriter objetoEscritor = new PrintWriter(escritor);
            String cadena = new String();
            String nombre = elEmpleado.getNombre();
            cadena = cadena + nombre + ":";
            String apellidoPaterno = elEmpleado.getApellidoPaterno();
            cadena = cadena + apellidoPaterno + ":";
            String apellidoMaterno = elEmpleado.getApellidoMaterno();
            cadena = cadena + apellidoMaterno + ":";
            String fechaDeNacimiento = elEmpleado.getFechaDeNacimiento();
            cadena = cadena + fechaDeNacimiento + ":";
            String correo = elEmpleado.getMail();
            cadena = cadena + correo + ":";
            String numero = elEmpleado.getNumeroCelular();
            cadena = cadena + numero + ":";
            String direccion = elEmpleado.getDireccion();
            cadena = cadena + direccion;

            objetoEscritor.println(cadena);
            objetoEscritor.close();
        }
        catch(IOException e){
            System.out.println(e.toString());
        }
    }

    /**
     * Método para escribir un servicio en el registro de texto.
     * Se obtienen individualmente los atributos del objeto Servicio para crear la cadena que se escribirá en el registro de texto.
     * @param elServicio El servicio que se va a escribir en el registro.
     */
    public static void escribirServicio(Servicio elServicio){
        try{
            File archivo = new File("RegistroServicios.txt");
            FileWriter escritor = new FileWriter(archivo,true);
            PrintWriter objetoEscritor = new PrintWriter(escritor);
            String cadena = new String();
            Cliente elCliente = elServicio.getElCliente();
            Mascota laMascota = elServicio.getLaMascota();
            String tipoDeServicio = elServicio.getTipoDeServicio();
            cadena = cadena + tipoDeServicio + ":";
            String nicknameCliente = elCliente.getNickname();
            cadena = cadena + nicknameCliente + ":";
            String nombreMascota = laMascota.getNombre();
            cadena = cadena + nombreMascota + ":";
            float costoDelServicio = elServicio.getCostoDelServicio();
            cadena = cadena + costoDelServicio;
            objetoEscritor.println(cadena);
            objetoEscritor.close();
        }
        catch(IOException e){
            System.out.println(e.toString());
        }
    }
}