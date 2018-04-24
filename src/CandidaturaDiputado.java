
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
    ArrayList<Diputado> listaDiputados;        // personas que ocuparan los puestos de diputado
    Persona admin;                       // admin actual que registró la candidatura a listaDiputados

    public CandidaturaDiputado(PartidoPolitico partidoPolitico, ArrayList<Diputado> diputados, Persona admin) {
        this.partidoPolitico = partidoPolitico;
        this.listaDiputados = diputados;
        this.admin = admin;
    }

    public PartidoPolitico getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(PartidoPolitico partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    public ArrayList<Diputado> getListaDiputados() {
        return listaDiputados;
    }

    public void setListaDiputados(ArrayList<Diputado> listaDiputados) {
        this.listaDiputados = listaDiputados;
    }

    public Persona getAdmin() {
        return admin;
    }

    public void setAdmin(Persona admin) {
        this.admin = admin;
    }

    
    
} 
