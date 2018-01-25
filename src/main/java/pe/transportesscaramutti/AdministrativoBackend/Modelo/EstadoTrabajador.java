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
@Table(name="estadoTrabajador")
public class EstadoTrabajador {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idEstadoTrabajador;
    private String descripcionEstadoTrabajador;

    public long getIdEstadoTrabajador() {
        return idEstadoTrabajador;
    }

    public void setIdEstadoTrabajador(long idEstadoTrabajador) {
        this.idEstadoTrabajador = idEstadoTrabajador;
    }

    public String getDescripcionEstadoTrabajador() {
        return descripcionEstadoTrabajador;
    }

    public void setDescripcionEstadoTrabajador(String descripcionEstadoTrabajador) {
        this.descripcionEstadoTrabajador = descripcionEstadoTrabajador;
    }

    @Override
    public String toString() {
        return "EstadoTrabajador{" + "idEstadoTrabajador=" + idEstadoTrabajador + ", descripcionEstadoTrabajador=" + descripcionEstadoTrabajador + '}';
    }
    
    
    
}
