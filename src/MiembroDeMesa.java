/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fabián
 */
public class MiembroDeMesa{
     Persona miembro;
     String funcion;
     PartidoPolitico partidoPolitico;

    public MiembroDeMesa(Persona miembro, String funcion, PartidoPolitico partidoPolitico) {
        this.miembro = miembro;
        this.funcion = funcion;
        this.partidoPolitico = partidoPolitico;
    }

    public Persona getMiembro() {
        return miembro;
    }

    public void setMiembro(Persona miembro) {
        this.miembro = miembro;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public PartidoPolitico getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(PartidoPolitico partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }
}
