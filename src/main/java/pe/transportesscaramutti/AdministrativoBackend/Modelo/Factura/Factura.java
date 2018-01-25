/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.transportesscaramutti.AdministrativoBackend.Modelo.Factura;

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
import pe.transportesscaramutti.AdministrativoBackend.Modelo.Cliente;
import pe.transportesscaramutti.AdministrativoBackend.Modelo.Moneda;

/**
 *
 * @author felix
 */
@Entity
@Table(name = "factura")
public class Factura {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idFactura;
    private String serieFactura;
    private String numeroFactura;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_moneda")
    private Moneda moneda;
    private Double totalFactura;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaFactura;
    private long tipoFactura;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_estado_factura")
    private EstadoFactura estadoFactura;
    
    public long getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(long idFactura) {
        this.idFactura = idFactura;
    }

    public String getSerieFactura() {
        return serieFactura;
    }

    public void setSerieFactura(String serieFactura) {
        this.serieFactura = serieFactura;
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Moneda getMoneda() {
        return moneda;
    }

    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }

    public Double getTotalFactura() {
        return totalFactura;
    }

    public void setTotalFactura(Double totalFactura) {
        this.totalFactura = totalFactura;
    }

    public Date getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public long getTipoFactura() {
        return tipoFactura;
    }

    public void setTipoFactura(long tipoFactura) {
        this.tipoFactura = tipoFactura;
    }

    public EstadoFactura getEstadoFactura() {
        return estadoFactura;
    }

    public void setEstadoFactura(EstadoFactura estadoFactura) {
        this.estadoFactura = estadoFactura;
    }

    @Override
    public String toString() {
        return "Factura{" + "idFactura=" + idFactura + ", serieFactura=" + serieFactura + ", numeroFactura=" + numeroFactura + ", cliente=" + cliente + ", moneda=" + moneda + ", totalFactura=" + totalFactura + ", fechaFactura=" + fechaFactura + ", tipoFactura=" + tipoFactura + ", estadoFactura=" + estadoFactura + '}';
    }
    
}
