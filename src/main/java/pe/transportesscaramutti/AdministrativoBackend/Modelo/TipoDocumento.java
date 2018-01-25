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
@Table(name ="tipo_documento")    
public class TipoDocumento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idTipoDocumento;
    private String descripcionTipoDocumento;

    public long getIdTipoDocumentoIdentidad() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumentoIdentidad(long idTipoDocumentoIdentidad) {
        this.idTipoDocumento = idTipoDocumentoIdentidad;
    }

    public String getDescripcionTipoDocumentoIdentidad() {
        return descripcionTipoDocumento;
    }

    public void setDescripcionTipoDocumentoIdentidad(String descripcionTipoDocumentoIdentidad) {
        this.descripcionTipoDocumento = descripcionTipoDocumentoIdentidad;
    }
    
    @Override
    public String toString() {
        return "TipoDocumento{" + "idTipoDocumento=" + idTipoDocumento + ", descripcionTipoDocumento=" + descripcionTipoDocumento + '}';
    }
    
}
