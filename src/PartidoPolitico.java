
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fabián
 */
public class PartidoPolitico {
    String nombre;
    int codigo;
    String escala;
    String fechaFundacion;
    int telefono;
    String direccion;
    ImageIcon bandera;

    public PartidoPolitico(String nombre, int codigo, String escala, String fechaFundacion, int telefono, String direccion, ImageIcon bandera) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.escala = escala;
        this.fechaFundacion = fechaFundacion;
        this.telefono = telefono;
        this.direccion = direccion;
        this.bandera = bandera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEscala() {
        return escala;
    }

    public void setEscala(String escala) {
        this.escala = escala;
    }

    public String getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(String fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ImageIcon getBandera() {
        return bandera;
    }

    public void setBandera(ImageIcon bandera) {
        this.bandera = bandera;
    }
    
    
}
