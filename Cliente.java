import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase Cliente, heredera de Usuario.
 * En esta clase se definen 2 atributos adicionales a los heredados correspondientes a la cuenta y lista de mascotas de un Cliente, se declaran constructores y lo métodos
 * que puede ejecutar un objeto de tipo Cliente.
 * @version 07/12/2023
 * @author Jhonatan Emmanuel Amaya Esquivel
 * @author José Guadalupe Baños Monjaraz
 * @author Miguel Nicolás Sarmiento Monroy
 * @author Samuel Ortiz Díaz
 * @author Sergio Bruno Ramírez Gutiérrez
 */

public class Cliente extends Usuario{
    /**
     * Cuenta del cliente.
     */
    private float cuenta;
    /**
     * Lista de mascotas del cliente.
     */
    private ArrayList<Mascota> mascotas;
    Scanner scanner = new Scanner(System.in);

    /**
     * Constructor que recibe parámetros. Inicializa los atributos cuenta y lista de mascotas.
     * @param nombre Nombre del cliente.
     * @param apellidoPaterno Apellido paterno del cliente.
     * @param apellidoMaterno Apellido materno del cliente.
     * @param edad Edad del cliente.
     * @param mail Mail/Correo electrónico del cliente.
     * @param numeroCelular Número celular del cliente.
     * @param direccion Dirección del cliente.
     * @param nickname Nickname del cliente.
     * @param password Password/Contraseña del cliente.
     */
    public Cliente(String nombre, String apellidoPaterno, String apellidoMaterno, int edad, String mail, String numeroCelular, String direccion, String nickname, String password){
        super(nombre, apellidoPaterno, apellidoMaterno, edad, mail, numeroCelular, direccion, nickname, password);
        this.cuenta = 0.0f;
        this.mascotas = new ArrayList<>();
    }

    /**
     * Constructor vacío. Inicializa los atributos a valores por defecto.
     */
    public Cliente(){
        super();
        this.cuenta = 0.0f;
        this.mascotas = new ArrayList<>();
    }

    /**
     * Método para registrar una mascota, se le pregunta al usuario que tipo de mascota quiere registrar, según sea el caso se capturan los datos de un perro o un gato, una vez
     * capturados los datos de la mascota esta se registra a la mascota en el archivo de texto junto al nickname de su dueño como referencia.
     */
    public void registrarUnaMascota(){
        boolean mascotaValida = false;
        while(!mascotaValida){
            System.out.println("----REGISTRAR MASCOTA----");
            System.out.println("Ingrese que desea registrar:");
            System.out.println("Perro - Gato");
            String tipoDeMascota = scanner.nextLine();
            if(tipoDeMascota.equalsIgnoreCase("Perro")){
                mascotaValida = true;
                System.out.println("----PERRO----");
                System.out.println("Ingresa el nombre del perro:");
                String nombrePerro = scanner.nextLine();
                System.out.println("Ingresa la edad del perro en años:");
                int edadPerro = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Ingresa el tipo de pelo del perro, a continuación se muestran referencias:");
                System.out.println("- Sin pelo (Ej. Xoloitzcuintle, Terrier americano)");
                System.out.println("- Pelo corto (Ej. Dóberman, Pitbull, Bulldog, Beagle)");
                System.out.println("- Pelo medio (Ej. Maltés, Husky, Pastor alemán, Border collie)");
                System.out.println("- Pelo largo (Ej.Collie de pelo largo (Lassie), Galgo albano, Yorkshire terrier, Komondor).");
                String tipoDePeloPerro = scanner.nextLine();
                System.out.println("Ingresa la altura del perro, a continuación se presentan referencias:");
                System.out.println("- Miniatura (25cm o menos)");
                System.out.println("- Pequeño (25cm a 40cm)");
                System.out.println("- Mediano (40cm a 60cm)");
                System.out.println("- Grande (60cm a 80cm)");
                System.out.println("- Gigante (80cm o más)");
                String alturaPerro = scanner.nextLine();
                Perro nuevoPerro = new Perro(nombrePerro, edadPerro, tipoDePeloPerro, alturaPerro);
                String nicknameDuenio = getNickname();
                EscritorDeArchivos.escribirPerro(nuevoPerro, nicknameDuenio);

            } else if (tipoDeMascota.equalsIgnoreCase("Gato")) {
                mascotaValida = true;
                System.out.println("----GATO----");
                System.out.println("Ingresa el nombre del gato:");
                String nombreGato = scanner.nextLine();
                System.out.println("Ingresa la edad del gato en años:");
                int edadGato = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Ingresa el tipo de pelo del gato, a continuación se presentan referencias:");
                System.out.println("Sin pelo (Ej.Esfinge, Elfo, Bambino);");
                System.out.println("Pelo medio (Ej. Gato doméstico americano, Siamés, Escocés)");
                System.out.println("Pelo largo(Ej.Persa, Angora, Him).");
                String tipoDePeloGato = scanner.nextLine();
                Gato nuevoGato = new Gato(nombreGato, edadGato, tipoDePeloGato);
                String nicknameDuenio = getNickname();
                EscritorDeArchivos.escribirGato(nuevoGato, nicknameDuenio);
            } else{
                System.out.println("Opción de registro no valida, intenta de nuevo.");
            }
        }
    }

    /**
     * Método para reservar un servicio para una mascota, primero se evalúa si la lista de mascotas contiene mascotas o no, en caso negativo se le notificará al cliente que debe registrar al menos una para continuar el proceso
     * de reserva de servicio, en caso positivo se imprime en pantalla la lista de todas las mascotas registradas del cliente con un índice correspondiente a cada una, posterior a esto el cliente debe ingresar el índice correspondiente
     * a la mascota a la cual le quiere reservar un servicio. Se evalúa que tipo de mascota (Perro o gato) escogió el usuario para la reserva de servicio, según sea el caso, se imprimen los servicios y precios disponibles para dicho tipo
     * de mascota, una vez mostrados los precios, el usuario puede escoger cual servicio reservar, sea cual sea su elección esta se registrara en el registro de servicio.
     */
    public void reservarServicio(){
        if(mascotas.isEmpty()){
            System.out.println("No hay mascotas registradas, registra al menos una para continuar.");
        } else{
            System.out.println("----SOLICITUD DE SERVICIO PARA MASCOTA----");
            System.out.println("Lista de mascotas registradas de: " + getNombre() + " " + getApellidoPaterno() + " " + getApellidoMaterno());
            int indice = 0;
            for(Mascota actual : mascotas){
                System.out.println("Mascota: " + indice);
                if(actual instanceof Perro){
                    Perro perroActual = (Perro)actual;
                    System.out.println("Nombre: " + perroActual.getNombre());
                    System.out.println("Edad: " + perroActual.getEdad() + " años.");
                    System.out.println("Tipo de pelo: " + perroActual.getTipoDePelo());
                    System.out.println("Altura: " + perroActual.getAltura());
                    System.out.println("Tipo de mascota: Perro");
                } else if (actual instanceof Gato) {
                    System.out.println("Nombre: " + actual.getNombre());
                    System.out.println("Edad: " + actual.getEdad());
                    System.out.println("Tipo de pelo: " + actual.getTipoDePelo());
                    System.out.println("Tipo de mascota: Gato");
                }
                indice++;
            }
            System.out.println("Ingresa el indice correspondiente a la mascota a la cual se le quiere reservar un servicio.");
            int seleccionIndice = scanner.nextInt();
            scanner.nextLine();
            int tamanioLista = mascotas.size();
            if(seleccionIndice > tamanioLista){
                System.out.println("Indice no válido, intente de nuevo.");
            } else {
                Mascota eleccion = mascotas.get(seleccionIndice);
                if(eleccion instanceof Perro){
                    Perro perro = (Perro)eleccion;
                    System.out.println("Nombre: " + perro.getNombre());
                    System.out.println("Edad: " + perro.getEdad() + " años.");
                    System.out.println("Tipo de pelo: " + perro.getTipoDePelo());
                    System.out.println("Altura: " + perro.getAltura());
                    System.out.println("Lista de precios para perro " + perro.getAltura().toLowerCase());
                    LectorDeArchivos.leerPreciosBanioPerro();
                    LectorDeArchivos.leerPreciosDentalPerro();
                    LectorDeArchivos.leerPreciosUniasPerro();
                    LectorDeArchivos.leerPreciosPeloPerro();
                    //Lee el servicio elegido por el cliente
                    System.out.println("Ingrese el numero que corresponda al tipo de servicio que requiere");
                    System.out.println("1.-Baño.");
                    System.out.println("2.-Cepillado dental.");
                    System.out.println("3.-Corte de uñas.");
                    System.out.println("4.-Corte de pelo.");
                    int opcion = 0;
                    String tipoDeServicio = new String();
                    opcion = scanner.nextInt();
                    scanner.nextLine();
                    if(opcion == 1){
                        tipoDeServicio = "banio";
                    }else if(opcion == 2){
                        tipoDeServicio = "cepillado";
                    }else if(opcion == 3){
                        tipoDeServicio = "unias";
                    }else if(opcion ==4){
                        tipoDeServicio = "pelo";
                    }else{
                        System.out.println("Opción no valida.");
                    }

                    float precioTotal = LectorDeArchivos.buscarPrecio(perro, tipoDeServicio);
                    Servicio elServicio = new Servicio(tipoDeServicio, perro, this, precioTotal);
                    EscritorDeArchivos.escribirServicio(elServicio);
                    Utilidades.limpPantalla();
                    System.out.println("Servicio registrado con exito.");
                    mascotas.clear();

                } else if (eleccion instanceof Gato) {
                    Gato gato = (Gato)eleccion;
                    System.out.println("Nombre: " + eleccion.getNombre());
                    System.out.println("Edad: " + eleccion.getEdad());
                    System.out.println("Tipo de pelo: " + eleccion.getTipoDePelo());
                    System.out.println("Lista de precios para gato");
                    LectorDeArchivos.leerPreciosBaniosGato();
                    LectorDeArchivos.leerPrecioUniasGato();
                    LectorDeArchivos.leerPrecioDentalGato();

                    System.out.println("Ingrese el numero que corresponda al tipo de servicio que requiere");
                    System.out.println("1.-Baño.");
                    System.out.println("2.-Cepillado dental.");
                    System.out.println("3.-Corte de uñas.");
                    int opcion = 0;
                    String tipoDeServicio = new String();
                    opcion = scanner.nextInt();
                    scanner.nextLine();
                    if(opcion == 1){
                        tipoDeServicio = "banio";
                    }else if(opcion == 2){
                        tipoDeServicio = "cepillado";
                    }else if(opcion == 3){
                        tipoDeServicio = "unias";
                    }else{
                        System.out.println("Opción no valida.");
                    }

                    float precioTotal = LectorDeArchivos.buscarPrecio(gato, tipoDeServicio);
                    Servicio elServicio = new Servicio(tipoDeServicio, gato, this, precioTotal);
                    EscritorDeArchivos.escribirServicio(elServicio);
                    Utilidades.limpPantalla();
                    System.out.println("Servicio registrado con exito.");
                    mascotas.clear();

                }
            }

        }
    }

    /**
     * Método para imprimir el historial de servicios adquiridos por un usuario.
     */
    public void verHistorialDeServicios(){
        System.out.println("----HISTORIAL DE SERVICIOS----");
    }

    /**
     * Método para imprimir la lista de todos los registros disponibles.
     */
    public void verPreciosDeServicios(){
        System.out.println("PRECIOS PERRO:");
        LectorDeArchivos.leerPreciosBanioPerro();
        LectorDeArchivos.leerPreciosPeloPerro();
        LectorDeArchivos.leerPreciosUniasPerro();
        LectorDeArchivos.leerPreciosDentalPerro();
        System.out.println("PRECIOS GATO:");
        LectorDeArchivos.leerPreciosBaniosGato();
        LectorDeArchivos.leerPrecioUniasGato();
        LectorDeArchivos.leerPrecioDentalGato();
    }

    /**
     * Método get del atributo cuenta.
     * @return La cuenta del cliente.
     */
    public float getCuenta() {
        return cuenta;
    }

    /**
     * Método set del atributo cuenta.
     * @param cuenta La cuenta del cliente.
     */
    public void setCuenta(float cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Método get del atributo mascotas.
     * @return La lista de mascotas registradas del cliente.
     */
    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    /**
     * Método set del atributo mascotas.
     * @param mascotas La lista de mascotas del cliente.
     */
    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }
}