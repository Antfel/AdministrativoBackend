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
import pe.transportesscaramutti.AdministrativoBackend.Modelo.GuiaTransportista;

/**
 *
 * @author felix
 */
@Entity
@Table(name = "detalle_factura_guia")
public class DetalleFacturaGuia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idDetalleFacturaGuia;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_detalle_factura")
    private DetalleFactura detalleFactura;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_guia_transportista")
    private GuiaTransportista guiaTransportista;

    public long getIdDetalleFacturaGuia() {
        return idDetalleFacturaGuia;
    }

    public void setIdDetalleFacturaGuia(long idDetalleFacturaGuia) {
        this.idDetalleFacturaGuia = idDetalleFacturaGuia;
    }

    public DetalleFactura getDetalleFactura() {
        return detalleFactura;
    }

    public void setDetalleFactura(DetalleFactura detalleFactura) {
        this.detalleFactura = detalleFactura;
    }

    public GuiaTransportista getGuiaTransportista() {
        return guiaTransportista;
    }

    public void setGuiaTransportista(GuiaTransportista guiaTransportista) {
        this.guiaTransportista = guiaTransportista;
    }

    @Override
    public String toString() {
        return "DetalleFacturaGuia{" + "idDetalleFacturaGuia=" + idDetalleFacturaGuia + ", detalleFactura=" + detalleFactura + ", guiaTransportista=" + guiaTransportista + '}';
    }
    
}
