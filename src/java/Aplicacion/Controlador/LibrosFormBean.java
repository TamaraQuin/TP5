/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion.Controlador;

import Aplicacion.Modelo.Datos.ListadoLibro;
import Aplicacion.Modelo.Libro;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Tami Quinta
 */
@ManagedBean
@ViewScoped
public class LibrosFormBean {
    private Libro unLibro;
    private ListadoLibro listadoLibro;
    private ListadoLibro listadoLibro2;
    private String isbn;
    private String autor;
    private String titulo;
    private String precio;
    private String buscador;
    
    public LibrosFormBean() {
       listadoLibro = new ListadoLibro();
       listadoLibro2 = new ListadoLibro();
    }
    
    public void agregarLibro() {
        setUnLibro(new Libro(getIsbn(), getTitulo(), getAutor(), getPrecio()));
        getListadoLibro().agregarLibros(getUnLibro());
    }
    
    public void buscarLibro() {
        for (int i=0;i<getListadoLibro().getLibros().size();i++) {
            if (getListadoLibro().getLibros().get(i).getTítulo().equals(getBuscador())) {
                getListadoLibro2().getLibros().add(getListadoLibro().getLibros().get(i));
            }
        }
    }
    
    public void reiniciarLista() {
        listadoLibro = new ListadoLibro();
        listadoLibro2 = new ListadoLibro();
    }
    


    /**
     * @return the unLibro
     */
    public Libro getUnLibro() {
        return unLibro;
    }

    /**
     * @param unLibro the unLibro to set
     */
    public void setUnLibro(Libro unLibro) {
        this.unLibro = unLibro;
    }

    /**
     * @return the listadoLibro
     */
    public ListadoLibro getListadoLibro() {
        return listadoLibro;
    }

    /**
     * @param listadoLibro the listadoLibro to set
     */
    public void setListadoLibro(ListadoLibro listadoLibro) {
        this.listadoLibro = listadoLibro;
    }

    /**
     * @return the listadoLibro2
     */
    public ListadoLibro getListadoLibro2() {
        return listadoLibro2;
    }

    /**
     * @param listadoLibro2 the listadoLibro2 to set
     */
    public void setListadoLibro2(ListadoLibro listadoLibro2) {
        this.listadoLibro2 = listadoLibro2;
    }

    /**
     * @return the isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the precio
     */
    public String getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(String precio) {
        this.precio = precio;
    }

    /**
     * @return the buscador
     */
    public String getBuscador() {
        return buscador;
    }

    /**
     * @param buscador the buscador to set
     */
    public void setBuscador(String buscador) {
        this.buscador = buscador;
    }
    
}
