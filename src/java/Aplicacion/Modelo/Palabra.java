package Aplicacion.Modelo;

import java.util.ArrayList;


public class Palabra {
    private ArrayList<String> cualquiera;

    public Palabra() {
        cualquiera = new ArrayList();
    }

    public Palabra(ArrayList<String> cualquiera) {
        this.cualquiera = cualquiera;
    }

    /**
     * @return the cualquiera
     */
    public ArrayList<String> getCualquiera() {
        return cualquiera;
    }

    /**
     * @param cualquiera the cualquiera to set
     */
    public void setCualquiera(ArrayList<String> cualquiera) {
        this.cualquiera = cualquiera;
    }
    
}
