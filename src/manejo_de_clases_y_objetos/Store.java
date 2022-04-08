package manejo_de_clases_y_objetos;


import java.util.ArrayList;

/**
 * Representa una tienda y varias de sus caracteristicas
 */
public class Store {

    public String name;
    public String address;
    protected ArrayList<String> customers;
    private float profit;
    private String manager;

    /**
     * crea una instancia de la clase solicitando los atributos necesarios
     *
     * @param name    Nombre de la tienda
     * @param address Direccion de la tienda
     * @param manager Administrador de la tienda
     */
    public Store(String name, String address, String manager) {
        this.name = name;
        this.address = address;
        this.manager = manager;
    }

    /**
     * Agrega las ganancias que tiene la tienda
     *
     * @param profit Ganancias de la tienda
     */
    private void addProfit(float profit) {
        this.profit += profit;
    }

    /**
     * Agrega clientes que tiene la tienda
     *
     * @param customer Cliente de la tienda
     */
    protected void addCustomer(String customer) {
        customers.add(customer);
    }

    /**
     * Muestra las ganancias que ha tenido la tienda
     *
     * @return Ganancias de la tienda
     */
    public float getProfit() {
        return profit;
    }

    /**
     * Muestra el nombre del administrador de la tienda
     *
     * @return Administrador de la tienda
     */
    public String getManager() {
        return manager;
    }
}
