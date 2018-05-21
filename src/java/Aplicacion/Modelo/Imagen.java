package Aplicacion.Modelo;

import java.io.Serializable;


public class Imagen implements  Serializable {
    private int auxImag;
    private byte[] Imagen;

    public Imagen() {
    }

    public Imagen(int auxImag, byte[] Imagen) {
        this.auxImag = auxImag;
        this.Imagen = Imagen;
    }

    /**
     * @return the auxImag
     */
    public int getAuxImag() {
        return auxImag;
    }

    /**
     * @param auxImag the auxImag to set
     */
    public void setAuxImag(int auxImag) {
        this.auxImag = auxImag;
    }

    /**
     * @return the Imagen
     */
    public byte[] getImagen() {
        return Imagen;
    }

    /**
     * @param Imagen the Imagen to set
     */
    public void setImagen(byte[] Imagen) {
        this.Imagen = Imagen;
    }
    
    
}
