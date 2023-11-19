/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import lombok.Data;

@Data
public class Tecnico {
    private int idTecnico;
    private Especializacion especialidad;
    private boolean estado;
    private String contacto;
    private int tiempoResolucion;

    public Tecnico() {
    }

    public Tecnico(int idTecnico, Especializacion especialidad, boolean estado, String contacto, int tiempoResolucion) {
        this.idTecnico = idTecnico;
        this.especialidad = especialidad;
        this.estado = estado;
        this.contacto = contacto;
        this.tiempoResolucion = tiempoResolucion;
    }

    public Tecnico(Especializacion especialidad, boolean estado, String contacto, int tiempoResolucion) {
        this.especialidad = especialidad;
        this.estado = estado;
        this.contacto = contacto;
        this.tiempoResolucion = tiempoResolucion;
    }
    
    
}
