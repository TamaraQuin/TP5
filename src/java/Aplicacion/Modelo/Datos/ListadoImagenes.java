/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion.Modelo.Datos;

import Aplicacion.Modelo.Imagen;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Tami Quinta
 */
public class ListadoImagenes implements Serializable{
    private byte[] imagen;
    private int numImagen;
    
    private ArrayList<Imagen> listaImagenes;
    
    public ListadoImagenes(){
        listaImagenes = new ArrayList();
    }
    
    public void llenarListado(byte[] imgGuardar){
        if (getListaImagenes().isEmpty()){
            setNumImagen(0);
        }
        else{
            setNumImagen(getListaImagenes().size());
        }
        getListaImagenes().add(new Imagen (getNumImagen(), imgGuardar));
    }

    /**
     * @return the imagen
     */
    public byte[] getImagen() {
        return imagen;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    /**
     * @return the numImagen
     */
    public int getNumImagen() {
        return numImagen;
    }

    /**
     * @param numImagen the numImagen to set
     */
    public void setNumImagen(int numImagen) {
        this.numImagen = numImagen;
    }

    /**
     * @return the listaImagenes
     */
    public ArrayList<Imagen> getListaImagenes() {
        return listaImagenes;
    }

    /**
     * @param listaImagenes the listaImagenes to set
     */
    public void setListaImagenes(ArrayList<Imagen> listaImagenes) {
        this.listaImagenes = listaImagenes;
    }
    
}
