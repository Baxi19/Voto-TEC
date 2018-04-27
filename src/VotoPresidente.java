/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fabián
 */
public class VotoPresidente extends Voto{
    CandidaturaPresidente votoCandidaturaPresidente; 

    public VotoPresidente(CandidaturaPresidente votoCandidaturaPresidente, Persona votante) {
        super(votante);
        this.votoCandidaturaPresidente = votoCandidaturaPresidente;
    }

    @Override
    public Persona obtenerVotante() {
        return this.votante;
    }

    public CandidaturaPresidente getVotoCandidaturaPresidente() {
        return votoCandidaturaPresidente;
    }

    public void setVotoCandidaturaPresidente(CandidaturaPresidente votoCandidaturaPresidente) {
        this.votoCandidaturaPresidente = votoCandidaturaPresidente;
    } 
}
