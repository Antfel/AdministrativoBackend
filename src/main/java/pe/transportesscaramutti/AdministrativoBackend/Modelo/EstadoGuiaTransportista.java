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
@Table(name = "estado_guia_transportista")
public class EstadoGuiaTransportista {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idEstadoGuiaTransportista;
    private String descripcionEstadoGuia;

    public long getIdEstadoGuiaTransportista() {
        return idEstadoGuiaTransportista;
    }

    public void setIdEstadoGuiaTransportista(long idEstadoGuiaTransportista) {
        this.idEstadoGuiaTransportista = idEstadoGuiaTransportista;
    }

    public String getDescripcionEstadoGuia() {
        return descripcionEstadoGuia;
    }

    public void setDescripcionEstadoGuia(String descripcionEstadoGuia) {
        this.descripcionEstadoGuia = descripcionEstadoGuia;
    }

    @Override
    public String toString() {
        return "EstadoGuiaTransportista{" + "idEstadoGuiaTransportista=" + idEstadoGuiaTransportista + ", descripcionEstadoGuia=" + descripcionEstadoGuia + '}';
    }
    
}
