package manejo_de_clases_y_objetos;

/**
 * Representa a un computador y varias de sus funcionalidades
 *
 * @author Sergio Esteban Cardozo Vega
 */
public class Computer {

    public String brand;
    public boolean powerOn;
    protected int storage;
    protected int ram;
    private String serial;
    private String user;

    /**
     * Crea una instancia de la clase
     *
     * @param brand Marca del computador que se va a crear
     */
    public Computer(String brand) {
        this.brand = brand;
    }

    /**
     * Enciende el computador
     */
    public void turnOn() {
        powerOn = true;
    }

    /**
     * Apaga el computador
     */
    public void shutDown() {
        powerOn = false;
    }

    /**
     * Utiliza la Memoria Ram del computador
     */
    private void useRam() {
        if (ram > 0) {
            ram = -1;
        }
    }

    /**
     * Utiliza el almacenamiento del computador
     */
    private void useStorage() {
        if (storage > 0) {
            storage = -1;
        }
    }

    /**
     * Muestra el usuario que utiliza el computador
     *
     * @return El usuario del computador
     */
    public String getUser() {
        return user;
    }

    /**
     * Modifica el usuario que utiliza el computador
     *
     * @param user El usuario del computador
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * Muestra el serial del computador unicamente a clases del mismo paquete
     *
     * @return Serial del computador
     */
    protected String getSerial() {
        return serial;
    }

}