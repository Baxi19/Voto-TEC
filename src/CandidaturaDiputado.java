
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
public class CandidaturaDiputado {
    PartidoPolitico partidoPolitico;     // partido politico asociado al diputado
    ArrayList<Persona> diputados;        // personas que ocuparan los puestos de diputado
    Provincia provincia;                 // provincia que representarán los diputados
    char tipo;                           // propietario (p) o suplente (s)
    int posicion;                        // posicion en la que se registró la candidatura en la lista de candidaturas
    Persona admin;                       // admin actual que registró la candidatura a diputados

    public CandidaturaDiputado(PartidoPolitico partidoPolitico, ArrayList<Persona> diputados, Provincia provincia, char tipo, int posicion, Persona admin) {
        this.partidoPolitico = partidoPolitico;
        this.diputados = diputados;
        this.provincia = provincia;
        this.tipo = tipo;
        this.posicion = posicion;
        this.admin = admin;
    }

    public PartidoPolitico getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(PartidoPolitico partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    public ArrayList<Persona> getDiputados() {
        return diputados;
    }

    public void setDiputados(ArrayList<Persona> diputados) {
        this.diputados = diputados;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public Persona getAdmin() {
        return admin;
    }

    public void setAdmin(Persona admin) {
        this.admin = admin;
    }
    
} 
