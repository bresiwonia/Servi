/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import lombok.Data;

@Data
public class Area_Comercial {
    private int idAreaComercial;
    private Cliente cliente;
    private String email;
    private boolean estado;

    public Area_Comercial() {
    }

    public Area_Comercial(int idAreaComercial, Cliente cliente, String email, boolean estado) {
        this.idAreaComercial = idAreaComercial;
        this.cliente = cliente;
        this.email = email;
        this.estado = estado;
    }

    public Area_Comercial(Cliente cliente, String email, boolean estado) {
        this.cliente = cliente;
        this.email = email;
        this.estado = estado;
    }
    
    
    
}
