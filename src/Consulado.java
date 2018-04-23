/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fabián
 */

//clase consulado/país para identificar y asociar a los votantes a un punto de voto
public class Consulado {  
    
    String nombre;    // nombre del país
    int codigo;       // código que identifica al país

    
    // contructor 
    public Consulado(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    // ----------------getters y setters--------------------//
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
    
    
    
}
