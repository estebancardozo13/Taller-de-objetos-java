package manejo_de_clases_y_objetos;

import java.util.Date;

/**
 * Representa a una persona y varias de sus caracteristicas.
 *
 * @author Sergio Esteban Cardozo Vega
 */
public class Person {
    public String name;
    public String lastName1;
    public String lastName2;
    public Date dateBirth;
    public float height;

    /**
     * Crea una instancia de la clase, solicitando los parametros necesarios
     *
     * @param name      Nombre de la persona
     * @param lastName1 Primer Apellido de la persona
     * @param lastName2 Segundo Apellido de la persona
     * @param dateBirth Fecha de nacimiento de la persona
     * @param height    Altura de la persona
     */
    public Person(String name, String lastName1, String lastName2, Date dateBirth, float height) {
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.dateBirth = dateBirth;
        this.height = height;
    }

    /**
     * Modifica el valor del atributo
     *
     * @param name nombre de la persona
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Muestra el valor del atributo
     *
     * @return valor del atributo name
     */
    public String getName() {
        return this.name;
    }

}

