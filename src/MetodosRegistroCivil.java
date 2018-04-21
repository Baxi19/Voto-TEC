
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
public class MetodosRegistroCivil {
    public ArrayList<Persona> listaPersonasEmpadronadas;
    public ArrayList<Persona> listaPersonasVotantes;
    public static MetodosRegistroCivil instance = null;
    
    private MetodosRegistroCivil(){
        this.listaPersonasEmpadronadas = new ArrayList<Persona>();
        this.listaPersonasVotantes = new ArrayList<Persona>();
    }
    
    public String agregarAlRegistro(String nombre, String primerApellido, String segundoApellido, int edad, int cedula, String estadoCivil, String fechaNacimiento, String sexo, String lugarNacimiento, String nacionalidad, boolean fallecido, String domicilioElectoral){
        Persona nuevaPersona = new Persona(nombre, primerApellido, segundoApellido, edad, cedula, estadoCivil, fechaNacimiento, sexo, lugarNacimiento, nacionalidad, fallecido, domicilioElectoral);
        if(nuevaPersona.edad >= 18){
            listaPersonasEmpadronadas.add(nuevaPersona);
            listaPersonasVotantes.add(nuevaPersona);  
            return "Usuario agregado a lista votantes y empadronados";
        }
        listaPersonasEmpadronadas.add(nuevaPersona);
        return "Usuario agregado a la lista de empadronado";
    }
    
    
    public Persona buscarPersonaEmpadronada(int cedula){
        for(int i = 0; i < listaPersonasVotantes.size(); i++){
            if(listaPersonasEmpadronadas.get(i).cedula == cedula){
                return listaPersonasEmpadronadas.get(i);
            }
        }
        return null;
    }
    
    public static MetodosRegistroCivil getInstance(){
        if(instance == null)
            instance = new MetodosRegistroCivil();
        return instance;
    }
}
