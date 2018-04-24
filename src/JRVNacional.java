
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
public class JRVNacional extends JRV{
        Distrito distrito;

    public JRVNacional(Distrito distrito, int codigo, int cantidadElectores, String centroVotacion, String direccion, String pais) {
        super(codigo, cantidadElectores, centroVotacion, direccion, pais);
        this.distrito = distrito;
    }

    public JRVNacional(int codigo, int cantidadElectores, String centroVotacion, String direccion, String pais) {
        super(codigo, cantidadElectores, centroVotacion, direccion, pais);
    }
    
    

    public Distrito getDistrito() {
        return distrito;
    }

    public void setDistrito(Distrito distrito) {
        this.distrito = distrito;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantidadElectores() {
        return cantidadElectores;
    }

    public void setCantidadElectores(int cantidadElectores) {
        this.cantidadElectores = cantidadElectores;
    }

    public String getCentroVotacion() {
        return centroVotacion;
    }

    public void setCentroVotacion(String centroVotacion) {
        this.centroVotacion = centroVotacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public ArrayList<MiembroDeMesa> getListaMiembrosDeMesa() {
        return listaMiembrosDeMesa;
    }

    public void setListaMiembrosDeMesa(ArrayList<MiembroDeMesa> listaMiembrosDeMesa) {
        this.listaMiembrosDeMesa = listaMiembrosDeMesa;
    } 
}
