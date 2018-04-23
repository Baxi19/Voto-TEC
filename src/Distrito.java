
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fabián
 */
public class Distrito {
    
    public int codigo;
    public String nombre;
    public Canton canton;
    public ArrayList<String> listaJRVs;  

    public Distrito(int codigo, String nombre, Canton canton) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.canton = canton;
        this.listaJRVs = new ArrayList<String>();
    }

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

    public Canton getCanton() {
        return canton;
    }

    public void setCanton(Canton canton) {
        this.canton = canton;
    }

    public ArrayList<String> getListaJRVs() {
        return listaJRVs;
    }

    public void setListaJRVs(ArrayList<String> listaJRVs) {
        this.listaJRVs = listaJRVs;
    }
    
    
    
    
    
}
