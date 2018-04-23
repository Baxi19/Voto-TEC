/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fabián
 */

// clase localidad
public class Localidad {
    
    int codigo;           // código de la localidad
    String nombre;        // nombre de la localidad
    Consulado consulado;  // nombre del país donde esta ubicada la localidad

    // constructor
    public Localidad(int codigo, String nombre, Consulado consulado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.consulado = consulado;
    }

    //------------------------getters y setters------------------------//
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Consulado getConsulado() {
        return consulado;
    }

    public void setConsulado(Consulado consulado) {
        this.consulado = consulado;
    }
    
    
}
