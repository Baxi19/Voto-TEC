
import java.io.File;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fabián
 */
public class CandidaturaPresidente {
    Persona Presidente;
    Persona vicepresidentePrincipal;
    Persona vicepresidenteSecundario;
    PartidoPolitico partidoPolitico;
    ImageIcon fotografiaPresidente;
    File planDeGobierno;
    File cv;

    public CandidaturaPresidente(Persona Presidente, Persona vicepresidentePrincipal, Persona vicepresidenteSecundario, PartidoPolitico partidoPolitico, ImageIcon fotografiaPresidente, File planDeGobierno, File cv) {
        this.Presidente = Presidente;
        this.vicepresidentePrincipal = vicepresidentePrincipal;
        this.vicepresidenteSecundario = vicepresidenteSecundario;
        this.partidoPolitico = partidoPolitico;
        this.fotografiaPresidente = fotografiaPresidente;
        this.planDeGobierno = planDeGobierno;
        this.cv = cv;
    }

    public Persona getPresidente() {
        return Presidente;
    }

    public void setPresidente(Persona Presidente) {
        this.Presidente = Presidente;
    }

    public Persona getVicepresidentePrincipal() {
        return vicepresidentePrincipal;
    }

    public void setVicepresidentePrincipal(Persona vicepresidentePrincipal) {
        this.vicepresidentePrincipal = vicepresidentePrincipal;
    }

    public Persona getVicepresidenteSecundario() {
        return vicepresidenteSecundario;
    }

    public void setVicepresidenteSecundario(Persona vicepresidenteSecundario) {
        this.vicepresidenteSecundario = vicepresidenteSecundario;
    }

    public PartidoPolitico getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(PartidoPolitico partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    public ImageIcon getFotografiaPresidente() {
        return fotografiaPresidente;
    }

    public void setFotografiaPresidente(ImageIcon fotografiaPresidente) {
        this.fotografiaPresidente = fotografiaPresidente;
    }

    public File getPlanDeGobierno() {
        return planDeGobierno;
    }

    public void setPlanDeGobierno(File planDeGobierno) {
        this.planDeGobierno = planDeGobierno;
    }

    public File getCv() {
        return cv;
    }

    public void setCv(File cv) {
        this.cv = cv;
    }

    
}
