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
import pe.transportesscaramutti.AdministrativoBackend.Modelo.Unidad;

/**
 *
 * @author felix
 */
@Entity
@Table(name = "detalle_factura_unidad")
public class DetalleFacturaUnidad {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idDetalleFacturaUnidad;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_detalle_factura")
    private DetalleFactura detalleFactura;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_unidad")
    private Unidad unidad;

    public long getIdDetalleFacturaUnidad() {
        return idDetalleFacturaUnidad;
    }

    public void setIdDetalleFacturaUnidad(long idDetalleFacturaUnidad) {
        this.idDetalleFacturaUnidad = idDetalleFacturaUnidad;
    }

    public DetalleFactura getDetalleFactura() {
        return detalleFactura;
    }

    public void setDetalleFactura(DetalleFactura detalleFactura) {
        this.detalleFactura = detalleFactura;
    }

    public Unidad getUnidad() {
        return unidad;
    }

    public void setUnidad(Unidad unidad) {
        this.unidad = unidad;
    }

    @Override
    public String toString() {
        return "DetalleFacturaUnidad{" + "idDetalleFacturaUnidad=" + idDetalleFacturaUnidad + ", detalleFactura=" + detalleFactura + ", unidad=" + unidad + '}';
    }
    
}
