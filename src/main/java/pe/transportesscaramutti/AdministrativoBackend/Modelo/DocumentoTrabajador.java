/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.transportesscaramutti.AdministrativoBackend.Modelo;

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
@Table(name = "documento_trabajador")
public class DocumentoTrabajador {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idDocumentoTrabajador;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_tipo_trabajador")
    private TipoDocumento tipoDocumento;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_trabajador")
    private Trabajador trabajador;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaEmision;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaCaducidad;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_estado_documento")
    private EstadoDocumento estadoDocumento;

    public long getIdDocumentoTrabajador() {
        return idDocumentoTrabajador;
    }

    public void setIdDocumentoTrabajador(long idDocumentoTrabajador) {
        this.idDocumentoTrabajador = idDocumentoTrabajador;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public EstadoDocumento getEstadoDocumento() {
        return estadoDocumento;
    }

    public void setEstadoDocumento(EstadoDocumento estadoDocumento) {
        this.estadoDocumento = estadoDocumento;
    }

    @Override
    public String toString() {
        return "DocumentoTrabajador{" + "idDocumentoTrabajador=" + idDocumentoTrabajador + ", tipoDocumento=" + tipoDocumento + ", trabajador=" + trabajador + ", fechaEmision=" + fechaEmision + ", fechaCaducidad=" + fechaCaducidad + ", estadoDocumento=" + estadoDocumento + '}';
    }

    
}
