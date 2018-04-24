
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
public class JRV {
    int codigo;
    int cantidadElectores;
    String centroVotacion;
    String direccion;
    String pais;
    ArrayList<MiembroDeMesa> listaMiembrosDeMesa;

    public JRV(int codigo, int cantidadElectores, String centroVotacion, String direccion, String pais) {
        this.codigo = codigo;
        this.cantidadElectores = cantidadElectores;
        this.centroVotacion = centroVotacion;
        this.direccion = direccion;
        this.pais = pais;
        this.listaMiembrosDeMesa = new ArrayList<MiembroDeMesa>();
    }
}
