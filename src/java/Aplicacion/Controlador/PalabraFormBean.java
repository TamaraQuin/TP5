/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion.Controlador;

import Aplicacion.Modelo.Palabra;
import java.util.Collections;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Tami Quinta
 */
@ManagedBean
@ViewScoped
public class PalabraFormBean {

    private Palabra listaPalabras;
    private String palabras;
    
    /**
     * Creates a new instance of NewJSFManagedBean
     */
    public PalabraFormBean() {
        listaPalabras = new Palabra();
    }

    /**
     * @return the listaPalabras
     */
    public Palabra getListaPalabras() {
        return listaPalabras;
    }
    
    public void agregarPalabra() {
        getListaPalabras().getCualquiera().add(getPalabras());
    }
    
    public void borrarlistado(){
        listaPalabras = new Palabra();
    }
    
    public void ordenarLista(){
        Collections.sort(getListaPalabras().getCualquiera());
    }

    /**
     * @param listaPalabras the listaPalabras to set
     */
    public void setListaPalabras(Palabra listaPalabras) {
        this.listaPalabras = listaPalabras;
    }

    /**
     * @return the palabras
     */
    public String getPalabras() {
        return palabras;
    }

    /**
     * @param palabras the palabras to set
     */
    public void setPalabras(String palabras) {
        this.palabras = palabras;
    }
    
}
