/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import lombok.Data;

@Data
public class Mesa_de_Ayuda {
    private int idMesaDeAyuda;
    private Cliente cliente;
    private TipoDeProblema tipoDeProblema;

    public Mesa_de_Ayuda() {
    }

    public Mesa_de_Ayuda(int idMesaDeAyuda, Cliente cliente, TipoDeProblema tipoDeProblema) {
        this.idMesaDeAyuda = idMesaDeAyuda;
        this.cliente = cliente;
        this.tipoDeProblema = tipoDeProblema;
    }

    public Mesa_de_Ayuda(Cliente cliente, TipoDeProblema tipoDeProblema) {
        this.cliente = cliente;
        this.tipoDeProblema = tipoDeProblema;
    }
    
    
}
