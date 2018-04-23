
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
public class CandidaturaDiputado_1 {
    PartidoPolitico partidoPolitico;     // partido politico asociado al diputado
    ArrayList<Persona> diputados;        // personas que ocuparan los puestos de diputado
    Provincia provincia;                 // provincia que representarán los diputados
    char tipo;                           // propietario (p) o suplente (s)
    int posicion;                        // posicion en la que se registró la candidatura en la lista de candidaturas
    Persona admin;                       // admin actual que registró la candidatura a diputados
} 
