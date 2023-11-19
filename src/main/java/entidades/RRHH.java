/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import lombok.Data;

@Data
public class RRHH {
    private int idrrhh;
    private Tecnico tecnico;
    private Incidentes incidentes;
    private String reporte;
    private boolean estado;

    public RRHH() {
    }

    public RRHH(int idrrhh, Tecnico tecnico, Incidentes incidentes, String reporte, boolean estado) {
        this.idrrhh = idrrhh;
        this.tecnico = tecnico;
        this.incidentes = incidentes;
        this.reporte = reporte;
        this.estado = estado;
    }

    public RRHH(Tecnico tecnico, Incidentes incidentes, String reporte, boolean estado) {
        this.tecnico = tecnico;
        this.incidentes = incidentes;
        this.reporte = reporte;
        this.estado = estado;
    }
    
    
}
