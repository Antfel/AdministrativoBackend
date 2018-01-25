/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.transportesscaramutti.AdministrativoBackend.Modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author felix
 */
@Entity
@Table(name = "estado_cliente")
public class EstadoCliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idEstadoCliente;
    private String descripcionEstadoCliente;

    public long getIdEstadoCliente() {
        return idEstadoCliente;
    }

    public void setIdEstadoCliente(long idEstadoCliente) {
        this.idEstadoCliente = idEstadoCliente;
    }

    public String getDescripcionEstadoCliente() {
        return descripcionEstadoCliente;
    }

    public void setDescripcionEstadoCliente(String descripcionEstadoCliente) {
        this.descripcionEstadoCliente = descripcionEstadoCliente;
    }

    @Override
    public String toString() {
        return "EstadoCliente{" + "idEstadoCliente=" + idEstadoCliente + ", descripcionEstadoCliente=" + descripcionEstadoCliente + '}';
    }
    
}
