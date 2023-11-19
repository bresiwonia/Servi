/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import lombok.Data;

@Data
public class Contrato {
   
    private int idContrato;
    private Cliente cliente;
    private Especializacion especializacion;
    private Double cuotaMensual;

    public Contrato() {
    }

    public Contrato(int idContrato, Cliente cliente, Especializacion especializacion, Double cuotaMensual) {
        this.idContrato = idContrato;
        this.cliente = cliente;
        this.especializacion = especializacion;
        this.cuotaMensual = cuotaMensual;
    }

    public Contrato(Cliente cliente, Especializacion especializacion, Double cuotaMensual) {
        this.cliente = cliente;
        this.especializacion = especializacion;
        this.cuotaMensual = cuotaMensual;
    }
    
    
}
