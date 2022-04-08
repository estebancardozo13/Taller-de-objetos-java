package manejo_de_clases_y_objetos;

/**
 * Representa una cuenta bancaria
 *
 * @author Sergio Estenban Cardozo Vega
 */
public class BankAccount {

    private int accountNumber;
    protected boolean activated;

    /**
     * Modifica el estado de la cuenta bancaria.
     *
     * @param activated representa si la cuenta esta activa o no.
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    /**
     * Muestra el estado de la cuenta
     *
     * @return el valor de "true" si la cuenta esta activa o "false" si esta inactiva.
     */
    public boolean getActivated() {
        return activated;
    }
}
