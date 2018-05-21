
package Aplicacion.Controlador;

import Aplicacion.Modelo.Datos.ListadoImagenes;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.text.ParseException;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseId;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
import org.primefaces.model.UploadedFile;

@ManagedBean
@ViewScoped
public class ImagenesFormBean implements Serializable{
    private transient UploadedFile file=null;
    private byte[] imagen;
    private byte[] nuevaImagen;
    private ListadoImagenes listadoImagenes;
    
    public ImagenesFormBean() {
        listadoImagenes = new ListadoImagenes();
    }
    
     public void agregarImagen() throws ParseException {
        
        setImagen(file.getContents());
        getListadoImagenes().llenarListado(imagen);
        FacesMessage message = new FacesMessage("Succesful", file.getFileName() + " is uploaded.");
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
    
    public StreamedContent getImagenSubida() throws IOException{
        FacesContext Context = FacesContext.getCurrentInstance();
        if (Context.getCurrentPhaseId() == PhaseId.RENDER_RESPONSE){
            return new DefaultStreamedContent();
        }
        else{
            if(getImagen() == null){
                return null;
            }
            else{
                return new DefaultStreamedContent(new ByteArrayInputStream(getImagen()),"img.png");
            }
        }
       
    }
    
    public StreamedContent getImagenSubidaListado() throws IOException {
        FacesContext context = FacesContext.getCurrentInstance();
        if (context.getCurrentPhaseId() == PhaseId.RENDER_RESPONSE) {
            return new DefaultStreamedContent();
        }
        else {
            String nuevaImg = context.getExternalContext().getRequestParameterMap().get("numI");
            int in = Integer.parseInt(nuevaImg);
            setNuevaImagen(getListadoImagenes().getListaImagenes().get(in).getImagen());
            if (getNuevaImagen() == null) {
                return null;
            }
            else {
                return new DefaultStreamedContent(new ByteArrayInputStream(getNuevaImagen()));
            }
        }
    }
   
    public void reiniciarImagen() {
        listadoImagenes = new ListadoImagenes();
    }

    /**
     * @return the file
     */
    public UploadedFile getFile() {
        return file;
    }

    /**
     * @param file the file to set
     */
    public void setFile(UploadedFile file) {
        this.file = file;
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
     * @return the nuevaImagen
     */
    public byte[] getNuevaImagen() {
        return nuevaImagen;
    }

    /**
     * @param nuevaImagen the nuevaImagen to set
     */
    public void setNuevaImagen(byte[] nuevaImagen) {
        this.nuevaImagen = nuevaImagen;
    }

    /**
     * @return the listadoImagenes
     */
    public ListadoImagenes getListadoImagenes() {
        return listadoImagenes;
    }

    /**
     * @param listadoImagenes the listadoImagenes to set
     */
    public void setListadoImagenes(ListadoImagenes listadoImagenes) {
        this.listadoImagenes = listadoImagenes;
    }
}

  
