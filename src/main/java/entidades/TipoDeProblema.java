/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import lombok.Data;

@Data
public class TipoDeProblema {
    private int idTipoDeProblema;
    private Especializacion especialidad;
    private Tecnico refuerzo;
    private int tiempoEstimado;

    public TipoDeProblema() {
    }

    public TipoDeProblema(int idTipoDeProblema, Especializacion especialidad, Tecnico refuerzo, int tiempoEstimado) {
        this.idTipoDeProblema = idTipoDeProblema;
        this.especialidad = especialidad;
        this.refuerzo = refuerzo;
        this.tiempoEstimado = tiempoEstimado;
    }

    public TipoDeProblema(Especializacion especialidad, Tecnico refuerzo, int tiempoEstimado) {
        this.especialidad = especialidad;
        this.refuerzo = refuerzo;
        this.tiempoEstimado = tiempoEstimado;
    }
    
    
    
}
