/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import lombok.Data;

@Data
public class Cliente {
    private int idCliente;
    private Contrato contrato;
    private int cuit;
    private String razonSocial;
    private String email;
    private boolean estado;

    public Cliente() {
    }

    public Cliente(int idCliente, Contrato contrato, int cuit, String razonSocial, String email, boolean estado) {
        this.idCliente = idCliente;
        this.contrato = contrato;
        this.cuit = cuit;
        this.razonSocial = razonSocial;
        this.email = email;
        this.estado = estado;
    }

    public Cliente(Contrato contrato, int cuit, String razonSocial, String email, boolean estado) {
        this.contrato = contrato;
        this.cuit = cuit;
        this.razonSocial = razonSocial;
        this.email = email;
        this.estado = estado;
    }
    
    
    
}
