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
@Table(name = "tipo_unidad")
public class TipoUnidad {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idTipoUnidad;
    private String descripcionTipoUnidad;

    public long getIdTipoUnidad() {
        return idTipoUnidad;
    }

    public void setIdTipoUnidad(long idTipoUnidad) {
        this.idTipoUnidad = idTipoUnidad;
    }

    public String getDescripcionTipoUnidad() {
        return descripcionTipoUnidad;
    }

    public void setDescripcionTipoUnidad(String descripcionTipoUnidad) {
        this.descripcionTipoUnidad = descripcionTipoUnidad;
    }

    @Override
    public String toString() {
        return "TipoUnidad{" + "idTipoUnidad=" + idTipoUnidad + ", descripcionTipoUnidad=" + descripcionTipoUnidad + '}';
    }
    
}
