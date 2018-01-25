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
@Table(name = "estado_unidad")
public class EstadoUnidad {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idEstadoUnidad;
    private String descripcionEstadoUnidad;

    public long getIdEstadoUnidad() {
        return idEstadoUnidad;
    }

    public void setIdEstadoUnidad(long idEstadoUnidad) {
        this.idEstadoUnidad = idEstadoUnidad;
    }

    public String getDescripcionEstadoUnidad() {
        return descripcionEstadoUnidad;
    }

    public void setDescripcionEstadoUnidad(String descripcionEstadoUnidad) {
        this.descripcionEstadoUnidad = descripcionEstadoUnidad;
    }

    @Override
    public String toString() {
        return "EstadoUnidad{" + "idEstadoUnidad=" + idEstadoUnidad + ", descripcionEstadoUnidad=" + descripcionEstadoUnidad + '}';
    }
    
}
