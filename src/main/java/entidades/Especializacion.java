/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import lombok.Data;

@Data
public class Especializacion {
    private int idEpecializacion;
    private Tecnico tecnico;
    private String especialidad;
    

    public Especializacion() {
    }

    public Especializacion(int idEpecializacion, Tecnico tecnico, String especialidad) {
        this.idEpecializacion = idEpecializacion;
        this.tecnico = tecnico;
        this.especialidad = especialidad;
    }

    public Especializacion(Tecnico tecnico, String especialidad) {
        this.tecnico = tecnico;
        this.especialidad = especialidad;
    }

}
