/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.transportesscaramutti.AdministrativoBackend.Modelo;

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
@Table(name = "estado_documento")
public class EstadoDocumento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idEstadoDocumento;
    private String descripcionEstadoDocumento;

    public long getIdEstadoDocumento() {
        return idEstadoDocumento;
    }

    public void setIdEstadoDocumento(long idEstadoDocumento) {
        this.idEstadoDocumento = idEstadoDocumento;
    }

    public String getDescripcionEstadoDocumento() {
        return descripcionEstadoDocumento;
    }

    public void setDescripcionEstadoDocumento(String descripcionEstadoDocumento) {
        this.descripcionEstadoDocumento = descripcionEstadoDocumento;
    }

    @Override
    public String toString() {
        return "EstadoDocumento{" + "idEstadoDocumento=" + idEstadoDocumento + ", descripcionEstadoDocumento=" + descripcionEstadoDocumento + '}';
    }
    
    
    
}
