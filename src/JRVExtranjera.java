
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
public class JRVExtranjera extends JRV{
    Localidad localidad;

    public JRVExtranjera(Localidad localidad, int codigo, int cantidadElectores, String centroVotacion, String direccion, String pais) {
        super(codigo, cantidadElectores, centroVotacion, direccion, pais);
        this.localidad = localidad;
    }

    public Localidad getLocalidad() {
        return localidad;
    }

    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
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
