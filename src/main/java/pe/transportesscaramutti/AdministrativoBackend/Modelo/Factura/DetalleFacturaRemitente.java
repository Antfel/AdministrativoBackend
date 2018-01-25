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

/**
 *
 * @author felix
 */
@Entity
@Table(name = "detalle_factura_remitente")
public class DetalleFacturaRemitente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idDetalleFacturaRemitente;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_detalle_factura")
    private DetalleFactura detalleFactura;
    private String guiaRemitente;

    public long getIdDetalleFacturaRemitente() {
        return idDetalleFacturaRemitente;
    }

    public void setIdDetalleFacturaRemitente(long idDetalleFacturaRemitente) {
        this.idDetalleFacturaRemitente = idDetalleFacturaRemitente;
    }

    public DetalleFactura getDetalleFactura() {
        return detalleFactura;
    }

    public void setDetalleFactura(DetalleFactura detalleFactura) {
        this.detalleFactura = detalleFactura;
    }

    public String getGuiaRemitente() {
        return guiaRemitente;
    }

    public void setGuiaRemitente(String guiaRemitente) {
        this.guiaRemitente = guiaRemitente;
    }

    @Override
    public String toString() {
        return "DetalleFacturaRemitente{" + "idDetalleFacturaRemitente=" + idDetalleFacturaRemitente + ", detalleFactura=" + detalleFactura + ", guiaRemitente=" + guiaRemitente + '}';
    }
    
}
