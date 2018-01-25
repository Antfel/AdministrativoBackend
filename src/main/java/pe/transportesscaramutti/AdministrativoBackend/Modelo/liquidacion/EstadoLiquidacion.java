/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.transportesscaramutti.AdministrativoBackend.Modelo.liquidacion;

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
@Table(name = "estado_liquidacion")
public class EstadoLiquidacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idEstadoLiquidacion;
    private String descripcionEstadoLiquidacion;

    public long getIdEstadoLiquidacion() {
        return idEstadoLiquidacion;
    }

    public void setIdEstadoLiquidacion(long idEstadoLiquidacion) {
        this.idEstadoLiquidacion = idEstadoLiquidacion;
    }

    public String getDescripcionEstadoLiquidacion() {
        return descripcionEstadoLiquidacion;
    }

    public void setDescripcionEstadoLiquidacion(String descripcionEstadoLiquidacion) {
        this.descripcionEstadoLiquidacion = descripcionEstadoLiquidacion;
    }

    @Override
    public String toString() {
        return "EstadoLiquidacion{" + "idEstadoLiquidacion=" + idEstadoLiquidacion + ", descripcionEstadoLiquidacion=" + descripcionEstadoLiquidacion + '}';
    }
   
}
