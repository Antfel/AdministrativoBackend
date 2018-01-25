/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.transportesscaramutti.AdministrativoBackend.Modelo.Asignacion;

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
@Table(name = "estado_asignacion_servicio")
public class EstadoAsignacionServicio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idEstadoAsignacionServicio;
    private String descripcionEstadoAsignacionServicio;

    public long getIdEstadoAsignacionServicio() {
        return idEstadoAsignacionServicio;
    }

    public void setIdEstadoAsignacionServicio(long idEstadoAsignacionServicio) {
        this.idEstadoAsignacionServicio = idEstadoAsignacionServicio;
    }

    public String getDescripcionEstadoAsignacionServicio() {
        return descripcionEstadoAsignacionServicio;
    }

    public void setDescripcionEstadoAsignacionServicio(String descripcionEstadoAsignacionServicio) {
        this.descripcionEstadoAsignacionServicio = descripcionEstadoAsignacionServicio;
    }

    @Override
    public String toString() {
        return "EstadoAsignacionServicio{" + "idEstadoAsignacionServicio=" + idEstadoAsignacionServicio + ", descripcionEstadoAsignacionServicio=" + descripcionEstadoAsignacionServicio + '}';
    }
        
}
