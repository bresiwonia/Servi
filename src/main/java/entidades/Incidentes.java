/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Date;
import lombok.Data;

@Data
public class Incidentes {
    private int idIncidentes;
    private TipoDeProblema tipoDeProblema;
    private Cliente cliente;
    private Tecnico tecnico;
    private String Descripcion;
    private Date fechaReporte;
    private boolean resuelto;

    public Incidentes() {
    }

    public Incidentes(int idIncidentes, TipoDeProblema tipoDeProblema, Cliente cliente, Tecnico tecnico, String Descripcion, Date fechaReporte, boolean resuelto) {
        this.idIncidentes = idIncidentes;
        this.tipoDeProblema = tipoDeProblema;
        this.cliente = cliente;
        this.tecnico = tecnico;
        this.Descripcion = Descripcion;
        this.fechaReporte = fechaReporte;
        this.resuelto = resuelto;
    }

    public Incidentes(TipoDeProblema tipoDeProblema, Cliente cliente, Tecnico tecnico, String Descripcion, Date fechaReporte, boolean resuelto) {
        this.tipoDeProblema = tipoDeProblema;
        this.cliente = cliente;
        this.tecnico = tecnico;
        this.Descripcion = Descripcion;
        this.fechaReporte = fechaReporte;
        this.resuelto = resuelto;
    }
    
    
}
