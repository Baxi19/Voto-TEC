/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fabián
 */
public class VotoDiputados extends Voto{
    CandidaturaDiputado candidaturaDiputado;

    public VotoDiputados(CandidaturaDiputado candidaturaDiputado, Persona votante) {
        super(votante);
        this.candidaturaDiputado = candidaturaDiputado;
    }

    @Override
    public Persona obtenerVotante(){
        return this.votante;
    }

    public CandidaturaDiputado getCandidaturaDiputado() {
        return candidaturaDiputado;
    }

    public void setCandidaturaDiputado(CandidaturaDiputado candidaturaDiputado) {
        this.candidaturaDiputado = candidaturaDiputado;
    }
    
    
    
}
