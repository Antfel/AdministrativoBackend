/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.transportesscaramutti.AdministrativoBackend.Modelo;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author felix
 */
@Entity
@Table(name = "unidad")
public class Unidad {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idUnidad;
    private String placaUnidad;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_tipo_unidad")
    private TipoUnidad tipoUnidad;
    private long ejesUnidad;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_estado_unidad")
    private EstadoUnidad estadoUnidad;

    public long getIdUnidad() {
        return idUnidad;
    }

    public void setIdUnidad(long idUnidad) {
        this.idUnidad = idUnidad;
    }

    public String getPlacaUnidad() {
        return placaUnidad;
    }

    public void setPlacaUnidad(String placaUnidad) {
        this.placaUnidad = placaUnidad;
    }

    public TipoUnidad getTipoUnidad() {
        return tipoUnidad;
    }

    public void setTipoUnidad(TipoUnidad tipoUnidad) {
        this.tipoUnidad = tipoUnidad;
    }

    public long getEjesUnidad() {
        return ejesUnidad;
    }

    public void setEjesUnidad(long ejesUnidad) {
        this.ejesUnidad = ejesUnidad;
    }

    public EstadoUnidad getEstadoUnidad() {
        return estadoUnidad;
    }

    public void setEstadoUnidad(EstadoUnidad estadoUnidad) {
        this.estadoUnidad = estadoUnidad;
    }

    @Override
    public String toString() {
        return "Unidad{" + "idUnidad=" + idUnidad + ", placaUnidad=" + placaUnidad + ", tipoUnidad=" + tipoUnidad + ", ejesUnidad=" + ejesUnidad + ", estadoUnidad=" + estadoUnidad + '}';
    }
    
}
