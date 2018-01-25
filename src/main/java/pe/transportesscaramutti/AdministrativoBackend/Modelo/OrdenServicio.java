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
@Table(name = "orden_servicio")
public class OrdenServicio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idOrdenServicio;
    private String numeroOrdenServicio;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaOrdenServicio;
    private long precioOrdenServicio;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_moneda")
    private Moneda moneda;

    public long getIdOrdenServicio() {
        return idOrdenServicio;
    }

    public void setIdOrdenServicio(long idOrdenServicio) {
        this.idOrdenServicio = idOrdenServicio;
    }

    public String getNumeroOrdenServicio() {
        return numeroOrdenServicio;
    }

    public void setNumeroOrdenServicio(String numeroOrdenServicio) {
        this.numeroOrdenServicio = numeroOrdenServicio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFechaOrdenServicio() {
        return fechaOrdenServicio;
    }

    public void setFechaOrdenServicio(Date fechaOrdenServicio) {
        this.fechaOrdenServicio = fechaOrdenServicio;
    }

    public long getPrecioOrdenServicio() {
        return precioOrdenServicio;
    }

    public void setPrecioOrdenServicio(long precioOrdenServicio) {
        this.precioOrdenServicio = precioOrdenServicio;
    }

    public Moneda getMoneda() {
        return moneda;
    }

    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }

    @Override
    public String toString() {
        return "OrdenServicio{" + "idOrdenServicio=" + idOrdenServicio + ", numeroOrdenServicio=" + numeroOrdenServicio + ", cliente=" + cliente + ", fechaOrdenServicio=" + fechaOrdenServicio + ", precioOrdenServicio=" + precioOrdenServicio + ", moneda=" + moneda + '}';
    }
    
    
    
}
