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
@Table(name = "tipo_servicio")
public class TipoServicio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idTipoServicio;
    private String descripcionTipoServicio;

    public long getIdTipoServicio() {
        return idTipoServicio;
    }

    public void setIdTipoServicio(long idTipoServicio) {
        this.idTipoServicio = idTipoServicio;
    }

    public String getDescripcionTipoServicio() {
        return descripcionTipoServicio;
    }

    public void setDescripcionTipoServicio(String descripcionTipoServicio) {
        this.descripcionTipoServicio = descripcionTipoServicio;
    }

    @Override
    public String toString() {
        return "TipoServicio{" + "idTipoServicio=" + idTipoServicio + ", descripcionTipoServicio=" + descripcionTipoServicio + '}';
    }
    
    
    
}
