/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fabián
 */
public class VotoDiputados {
    Persona votante;
    CandidaturaDiputado candidaturaDiputado;

    public VotoDiputados(Persona votante, CandidaturaDiputado candidaturaDiputado) {
        this.votante = votante;
        this.candidaturaDiputado = candidaturaDiputado;
    }

    public Persona getVotante() {
        return votante;
    }

    public void setVotante(Persona votante) {
        this.votante = votante;
    }

    public CandidaturaDiputado getCandidaturaDiputado() {
        return candidaturaDiputado;
    }

    public void setCandidaturaDiputado(CandidaturaDiputado candidaturaDiputado) {
        this.candidaturaDiputado = candidaturaDiputado;
    }
    
    
    
}
