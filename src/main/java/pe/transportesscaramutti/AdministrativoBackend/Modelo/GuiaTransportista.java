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
@Table(name = "guia_transportista")
public class GuiaTransportista {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idGuiaTransportista;
    private String detalleGuia;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaLiquidacion;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaFacturacion;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_estado_guia_transportista")
    private EstadoGuiaTransportista estadoGuiaTransportista;

    public long getIdGuiaTransportista() {
        return idGuiaTransportista;
    }

    public void setIdGuiaTransportista(long idGuiaTransportista) {
        this.idGuiaTransportista = idGuiaTransportista;
    }

    public String getDetalleGuia() {
        return detalleGuia;
    }

    public void setDetalleGuia(String detalleGuia) {
        this.detalleGuia = detalleGuia;
    }

    public Date getFechaLiquidacion() {
        return fechaLiquidacion;
    }

    public void setFechaLiquidacion(Date fechaLiquidacion) {
        this.fechaLiquidacion = fechaLiquidacion;
    }

    public Date getFechaFacturacion() {
        return fechaFacturacion;
    }

    public void setFechaFacturacion(Date fechaFacturacion) {
        this.fechaFacturacion = fechaFacturacion;
    }

    public EstadoGuiaTransportista getEstadoGuiaTransportista() {
        return estadoGuiaTransportista;
    }

    public void setEstadoGuiaTransportista(EstadoGuiaTransportista estadoGuiaTransportista) {
        this.estadoGuiaTransportista = estadoGuiaTransportista;
    }

    @Override
    public String toString() {
        return "GuiaTransportista{" + "idGuiaTransportista=" + idGuiaTransportista + ", detalleGuia=" + detalleGuia + ", fechaLiquidacion=" + fechaLiquidacion + ", fechaFacturacion=" + fechaFacturacion + ", estadoGuiaTransportista=" + estadoGuiaTransportista + '}';
    }
     
}
