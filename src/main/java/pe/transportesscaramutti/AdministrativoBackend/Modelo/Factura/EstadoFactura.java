/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.transportesscaramutti.AdministrativoBackend.Modelo.Factura;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author felix
 */
@Entity
@Table(name = "estado_factura")
public class EstadoFactura {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idEstadoFactura;
    private String descripcionEstadoFactura;

    public long getIdEstadoFactura() {
        return idEstadoFactura;
    }

    public void setIdEstadoFactura(long idEstadoFactura) {
        this.idEstadoFactura = idEstadoFactura;
    }

    public String getDescripcionEstadoFactura() {
        return descripcionEstadoFactura;
    }

    public void setDescripcionEstadoFactura(String descripcionEstadoFactura) {
        this.descripcionEstadoFactura = descripcionEstadoFactura;
    }

    @Override
    public String toString() {
        return "EstadoFactura{" + "idEstadoFactura=" + idEstadoFactura + ", descripcionEstadoFactura=" + descripcionEstadoFactura + '}';
    }
    
}
