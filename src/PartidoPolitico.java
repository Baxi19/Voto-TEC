
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

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
    String imagePath;

    public PartidoPolitico(String nombre, int codigo, String escala, String fechaFundacion, int telefono, String direccion, String imagePath) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.escala = escala;
        this.fechaFundacion = fechaFundacion;
        this.telefono = telefono;
        this.direccion = direccion;
        this.imagePath = imagePath;
    }

    public PartidoPolitico(String nombre, int codigo, String escala, String fechaFundacion, int telefono, String direccion) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.escala = escala;
        this.fechaFundacion = fechaFundacion;
        this.telefono = telefono;
        this.direccion = direccion;
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

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
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

    
    
}
