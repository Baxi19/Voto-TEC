/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fabián
 */
public abstract class Voto {
    public Persona votante;

    public Voto(Persona votante) {
        this.votante = votante;
    }

    public abstract Persona obtenerVotante();

    
}
