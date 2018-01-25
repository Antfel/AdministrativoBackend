/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.transportesscaramutti.AdministrativoBackend.Modelo.Asignacion;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import pe.transportesscaramutti.AdministrativoBackend.Modelo.DetalleOrdenServicio;
import pe.transportesscaramutti.AdministrativoBackend.Modelo.Moneda;
import pe.transportesscaramutti.AdministrativoBackend.Modelo.Trabajador;
import pe.transportesscaramutti.AdministrativoBackend.Modelo.Unidad;

/**
 *
 * @author felix
 */
@Entity
@Table(name = "asignacion_servicio")
public class AsignacionServicio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idAsignacionServicio;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_detalle_orden_servicio", nullable = false)
    private DetalleOrdenServicio ordenServicio;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaAsignacion;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_unidad")
    private Unidad unidad;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_trabajador")
    private Trabajador trabajador;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_estado_asignacion_servicio")
    private EstadoAsignacionServicio estadoAsignacionServicio;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_moneda")
    private Moneda moneda;
    private Double dineroAsignado;
    private String observacionAsignacionServicio;

    public long getIdAsignacionServicio() {
        return idAsignacionServicio;
    }

    public void setIdAsignacionServicio(long idAsignacionServicio) {
        this.idAsignacionServicio = idAsignacionServicio;
    }

    public DetalleOrdenServicio getOrdenServicio() {
        return ordenServicio;
    }

    public void setOrdenServicio(DetalleOrdenServicio ordenServicio) {
        this.ordenServicio = ordenServicio;
    }

    public Date getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(Date fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    public Unidad getUnidad() {
        return unidad;
    }

    public void setUnidad(Unidad unidad) {
        this.unidad = unidad;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    public EstadoAsignacionServicio getEstadoAsignacionServicio() {
        return estadoAsignacionServicio;
    }

    public void setEstadoAsignacionServicio(EstadoAsignacionServicio estadoAsignacionServicio) {
        this.estadoAsignacionServicio = estadoAsignacionServicio;
    }

    public String getObservacionAsignacionServicio() {
        return observacionAsignacionServicio;
    }

    public void setObservacionAsignacionServicio(String observacionAsignacionServicio) {
        this.observacionAsignacionServicio = observacionAsignacionServicio;
    }

    public Moneda getMoneda() {
        return moneda;
    }

    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }

    public Double getDineroAsignado() {
        return dineroAsignado;
    }

    public void setDineroAsignado(Double dineroAsignado) {
        this.dineroAsignado = dineroAsignado;
    }

    @Override
    public String toString() {
        return "AsignacionServicio{" + "idAsignacionServicio=" + idAsignacionServicio + ", ordenServicio=" + ordenServicio + ", fechaAsignacion=" + fechaAsignacion + ", unidad=" + unidad + ", trabajador=" + trabajador + ", estadoAsignacionServicio=" + estadoAsignacionServicio + ", moneda=" + moneda + ", dineroAsignado=" + dineroAsignado + ", observacionAsignacionServicio=" + observacionAsignacionServicio + '}';
    }
    
}
