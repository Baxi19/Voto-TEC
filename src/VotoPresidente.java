/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fabián
 */
public class VotoPresidente {
    Persona votante;
    CandidaturaPresidente votoCandidaturaPresidente; 

    public VotoPresidente(Persona votante, CandidaturaPresidente votoCandidaturaPresidente) {
        this.votante = votante;
        this.votoCandidaturaPresidente = votoCandidaturaPresidente;
    }

    public Persona getVotante() {
        return votante;
    }

    public void setVotante(Persona votante) {
        this.votante = votante;
    }

    public CandidaturaPresidente getVotoCandidaturaPresidente() {
        return votoCandidaturaPresidente;
    }

    public void setVotoCandidaturaPresidente(CandidaturaPresidente votoCandidaturaPresidente) {
        this.votoCandidaturaPresidente = votoCandidaturaPresidente;
    } 
}
