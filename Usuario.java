/**
 * Clase Usuario.
 * En este código se define a la clase Usuario, sus atributos, constructores y métodos.
 * @version 07/12/2023
 * @author Jhonatan Emmanuel Amaya Esquivel
 * @author José Guadalupe Baños Monjaraz
 * @author Miguel Nicolás Sarmiento Monroy
 * @author Samuel Ortiz Díaz
 * @author Sergio Bruno Ramírez Gutiérrez
 */
public abstract class Usuario {
    /**
     * Nombre del usuario.
     */
    private String nombre;
    /**
     * Apellido paterno del usuario
     */
    private String apellidoPaterno;
    /**
     * Apellido materno del usuario.
     */
    private String apellidoMaterno;
    /**
     * Edad del usuario.
     */
    private int edad;
    /**
     * Mail/Correo electrónico del usuario.
     */
    private String mail;
    /**
     * Número celular del usuario.
     */
    private String numeroCelular;
    /**
     * Dirección del usuario.
     */
    private String direccion;
    /**
     * Nickname del usuario.
     */
    private String nickname;
    /**
     * Password/Contraseña del usuario.
     */
    private String password;

    /**
     * Constructor que recibe parámetros.
     * @param nombre Nombre del usuario.
     * @param apellidoPaterno Apellido paterno del usuario.
     * @param apellidoMaterno Apellido materno del usuario.
     * @param edad Edad del usuario.
     * @param mail Mail/Correo electrónico del usuario.
     * @param numeroCelular Número celular del usuario.
     * @param direccion Dirección del usuario.
     * @param nickname Nickname del usuario.
     * @param password Password/Contraseña del usuario.
     */
    public Usuario(String nombre, String apellidoPaterno, String apellidoMaterno, int edad, String mail, String numeroCelular, String direccion, String nickname, String password){
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.edad = edad;
        this.mail = mail;
        this.numeroCelular = numeroCelular;
        this.direccion = direccion;
        this.nickname = nickname;
        this.password = password;
    }

    /**
     * Constructor vacío.
     * Inicializa los valores de los atributos por defecto.
     */
    public Usuario(){
        this.nombre = null;
        this.apellidoPaterno = null;
        this.apellidoMaterno = null;
        this.edad = 0;
        this.mail = null;
        this.numeroCelular = null;
        this.direccion = null;
        this.nickname = null;
        this.password = null;
    }

    /**
     * Método get del atributo nombre.
     * @return El nombre del usuario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método set del atributo nombre.
     * @param nombre El nombre del usuario.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método get del atributo apellidoPaterno.
     * @return El apellido paterno del usuario.
     */
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    /**
     * Método set del atributo apellidoPaterno.
     * @param apellidoPaterno El apellido paterno del usuario.
     */
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    /**
     * Método get del atributo apellidoMaterno.
     * @return El apellido materno del usuario.
     */
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    /**
     * Método set del atributo apellidoMaterno
     * @param apellidoMaterno El apellido materno del usuario.
     */
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    /**
     * Método get del atributo edad.
     * @return La edad del usuario.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Método set del atributo edad.
     * @param edad La edad del usuario.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Método get del atributo nickname.
     * @return El nickname del usuario.
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * Método set del atributo nickname.
     * @param nickname El nickname del usuario.
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * Método get del atributo password.
     * @return El password del cliente.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Método set del atributo password.
     * @param password El password del usuario.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Método get del atributo mail.
     * @return El mail del usuario.
     */
    public String getMail() {
        return mail;
    }

    /**
     * Método set del atributo mail.
     * @param mail El mail del usuario.
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * Método get del atributo numeroCelular.
     * @return El número celular del usuario.
     */
    public String getNumeroCelular() {
        return numeroCelular;
    }

    /**
     * Método set del atributo numeroCelular.
     * @param numeroCelular El número celular del usuario.
     */
    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    /**
     * Método get del atributo dirección.
     * @return La dirección del usuario.
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Método set del atributo dirección.
     * @param direccion La dirección del usuario.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}