package manejo_de_clases_y_objetos;

import java.util.ArrayList;

/**
 * Representa a una fruta y varias de sus caracteristicas.
 *
 * @author Sergio Estenban Cardozo Vega
 */
public class Fruit {
    public String name;
    private float averageWeight;
    public ArrayList<String> colors;

    /**
     * Modifica el valor del atributo
     *
     * @param name Representa el nombre de la fruta
     */
    public void setColor(String name) {
        this.name = name;
    }

    /**
     * Muestra la lista de colores del objeto "Fruit"
     *
     * @return Lista de colores que tiene el objeto
     */
    public ArrayList<String> getColors() {
        return colors;
    }
}
