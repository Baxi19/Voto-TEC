/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fabián
 */
public class Diputado {
    Persona diputado;
    Provincia provincia;
    String tipo;
    int posicion;

    public Diputado(Persona diputado, Provincia provincia, String tipo, int posicion) {
        this.diputado = diputado;
        this.provincia = provincia;
        this.tipo = tipo;
        this.posicion = posicion;
    }

    public Persona getDiputado() {
        return diputado;
    }

    public void setDiputado(Persona diputado) {
        this.diputado = diputado;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    
    
}
