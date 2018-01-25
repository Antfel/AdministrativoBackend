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
@Table(name = "detalle_orden_servicio")
public class DetalleOrdenServicio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idDetalleOrdenServicio;
    private long cantidad;
    private long anchoCarga;
    private long largoCarga;
    private long altoCarga;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_tipo_servicio")
    private TipoServicio tipoServicio;
    private String origen;
    private String destino;
    private long precioUnitario;
    private long precioServicio;
    private String observacionDetalleServicio;

    public long getIdDetalleOrdenServicio() {
        return idDetalleOrdenServicio;
    }

    public void setIdDetalleOrdenServicio(long idDetalleOrdenServicio) {
        this.idDetalleOrdenServicio = idDetalleOrdenServicio;
    }

    public long getCantidad() {
        return cantidad;
    }

    public void setCantidad(long cantidad) {
        this.cantidad = cantidad;
    }

    public long getAnchoCarga() {
        return anchoCarga;
    }

    public void setAnchoCarga(long anchoCarga) {
        this.anchoCarga = anchoCarga;
    }

    public long getLargoCarga() {
        return largoCarga;
    }

    public void setLargoCarga(long largoCarga) {
        this.largoCarga = largoCarga;
    }

    public long getAltoCarga() {
        return altoCarga;
    }

    public void setAltoCarga(long altoCarga) {
        this.altoCarga = altoCarga;
    }

    public TipoServicio getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(TipoServicio tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public long getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(long precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public long getPrecioServicio() {
        return precioServicio;
    }

    public void setPrecioServicio(long precioServicio) {
        this.precioServicio = precioServicio;
    }

    public String getObservacionDetalleServicio() {
        return observacionDetalleServicio;
    }

    public void setObservacionDetalleServicio(String observacionDetalleServicio) {
        this.observacionDetalleServicio = observacionDetalleServicio;
    }

    @Override
    public String toString() {
        return "DetalleOrdenServicio{" + "idDetalleOrdenServicio=" + idDetalleOrdenServicio + ", cantidad=" + cantidad + ", anchoCarga=" + anchoCarga + ", largoCarga=" + largoCarga + ", altoCarga=" + altoCarga + ", tipoServicio=" + tipoServicio + ", origen=" + origen + ", destino=" + destino + ", precioUnitario=" + precioUnitario + ", precioServicio=" + precioServicio + ", observacionDetalleServicio=" + observacionDetalleServicio + '}';
    }

    
    
}
