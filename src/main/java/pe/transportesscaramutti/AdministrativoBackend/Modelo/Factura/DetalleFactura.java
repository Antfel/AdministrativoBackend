/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.transportesscaramutti.AdministrativoBackend.Modelo.Factura;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import pe.transportesscaramutti.AdministrativoBackend.Modelo.TipoServicio;

/**
 *
 * @author felix
 */
@Entity
@Table(name = "detalle_factura")
public class DetalleFactura {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idDetalleFactura;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_factura")
    private Factura factura;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_tipo_servicio")
    private TipoServicio tipoServicio;
    private String descripcionDetalle;
    private long cantidad;
    private String confVehicular;
    private Double valorReferencial;
    private String ObservacionDetalle;
    private Double precioUnitario;
    private String origenDetalle;
    private String DestinoDetalle;

    public long getIdDetalleFactura() {
        return idDetalleFactura;
    }

    public void setIdDetalleFactura(long idDetalleFactura) {
        this.idDetalleFactura = idDetalleFactura;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public TipoServicio getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(TipoServicio tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public String getDescripcionDetalle() {
        return descripcionDetalle;
    }

    public void setDescripcionDetalle(String descripcionDetalle) {
        this.descripcionDetalle = descripcionDetalle;
    }

    public long getCantidad() {
        return cantidad;
    }

    public void setCantidad(long cantidad) {
        this.cantidad = cantidad;
    }

    public String getConfVehicular() {
        return confVehicular;
    }

    public void setConfVehicular(String confVehicular) {
        this.confVehicular = confVehicular;
    }

    public Double getValorReferencial() {
        return valorReferencial;
    }

    public void setValorReferencial(Double valorReferencial) {
        this.valorReferencial = valorReferencial;
    }

    public String getObservacionDetalle() {
        return ObservacionDetalle;
    }

    public void setObservacionDetalle(String ObservacionDetalle) {
        this.ObservacionDetalle = ObservacionDetalle;
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public String getOrigenDetalle() {
        return origenDetalle;
    }

    public void setOrigenDetalle(String origenDetalle) {
        this.origenDetalle = origenDetalle;
    }

    public String getDestinoDetalle() {
        return DestinoDetalle;
    }

    public void setDestinoDetalle(String DestinoDetalle) {
        this.DestinoDetalle = DestinoDetalle;
    }

    @Override
    public String toString() {
        return "DetalleFactura{" + "idDetalleFactura=" + idDetalleFactura + ", factura=" + factura + ", tipoServicio=" + tipoServicio + ", descripcionDetalle=" + descripcionDetalle + ", cantidad=" + cantidad + ", confVehicular=" + confVehicular + ", valorReferencial=" + valorReferencial + ", ObservacionDetalle=" + ObservacionDetalle + ", precioUnitario=" + precioUnitario + ", origenDetalle=" + origenDetalle + ", DestinoDetalle=" + DestinoDetalle + '}';
    }
    
}
