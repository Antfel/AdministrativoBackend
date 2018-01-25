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

/**
 *
 * @author felix
 */
@Entity
@Table(name = "bitacora_asignacion")
public class BitacoraAsignacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idBitacora;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_asginacion_servicio")
    private AsignacionServicio asignacionServicio;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaBitacora;
    private String descripcionBitacora;

    public long getIdBitacora() {
        return idBitacora;
    }

    public void setIdBitacora(long idBitacora) {
        this.idBitacora = idBitacora;
    }

    public AsignacionServicio getAsignacionServicio() {
        return asignacionServicio;
    }

    public void setAsignacionServicio(AsignacionServicio asignacionServicio) {
        this.asignacionServicio = asignacionServicio;
    }

    public Date getFechaBitacora() {
        return fechaBitacora;
    }

    public void setFechaBitacora(Date fechaBitacora) {
        this.fechaBitacora = fechaBitacora;
    }

    public String getDescripcionBitacora() {
        return descripcionBitacora;
    }

    public void setDescripcionBitacora(String descripcionBitacora) {
        this.descripcionBitacora = descripcionBitacora;
    }

    @Override
    public String toString() {
        return "BitacoraAsignacion{" + "idBitacora=" + idBitacora + ", asignacionServicio=" + asignacionServicio + ", fechaBitacora=" + fechaBitacora + ", descripcionBitacora=" + descripcionBitacora + '}';
    }
        
}
