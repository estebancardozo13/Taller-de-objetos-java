package manejo_de_clases_y_objetos;

/**
 * Representa a un carro y varias de sus funcionalidades
 *
 * @author Sergio Esteban Cardozo Vega
 */
public class Car {

    public String brand;
    public int maxSpeed;
    protected int maxPassengers;
    protected int currentPassengers;
    private int speed;
    private String license;
    private int fuel = 100;

    /**
     * Crea una instancia de la clase.
     *
     * @param brand Marca del carro que se va a crear
     */
    public Car(String brand) {
        this.brand = brand;
    }

    /**
     * Acelera el carro, modifica su velocidad y gasta su combustible
     */
    public void accelerate() {
        if (speed < maxSpeed && fuel > 0) {
            speed = +1;
            useFuel();
        }
    }

    /**
     * Detiene el carro y modifica su velocidad
     */
    public void stop() {
        if (speed > 0) {
            speed -= 1;
        }
    }

    /**
     * Recoge un pasajero y modifica los pasajeros actuales del carro
     */
    public void pickUpPassenger() {
        if (currentPassengers < maxPassengers) {
            currentPassengers += 1;
        }
    }

    /**
     * Usa el combustible disponible del carro
     */
    private void useFuel() {
        fuel -= 1;
    }

    /**
     * Muestra la licencia del carro unicamente a clases del mismo paquete
     *
     * @return La licencia del carro.
     */
    protected String getLicense() {
        return this.license;
    }
}
