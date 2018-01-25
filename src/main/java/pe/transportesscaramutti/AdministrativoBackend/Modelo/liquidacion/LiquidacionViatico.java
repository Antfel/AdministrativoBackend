/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.transportesscaramutti.AdministrativoBackend.Modelo.liquidacion;

import java.util.Date;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author felix
 */
@Entity
@Table(name = "liquidacion_viatico")
public class LiquidacionViatico {
    
    @EmbeddedId
    private LiquidacionViaticoPK id;
    
    private long cantidad;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date turno;
    private String descripcion;
    private Double total;

    public LiquidacionViaticoPK getLiquidacionViaticoPK() {
        return id;
    }

    public void setLiquidacionViaticoPK(LiquidacionViaticoPK liquidacionViaticoPK) {
        this.id = liquidacionViaticoPK;
    }

    public long getCantidad() {
        return cantidad;
    }

    public void setCantidad(long cantidad) {
        this.cantidad = cantidad;
    }

    public Date getTurno() {
        return turno;
    }

    public void setTurno(Date turno) {
        this.turno = turno;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "LiquidacionViatico{" + "liquidacionViaticoPK=" + id + ", cantidad=" + cantidad + ", turno=" + turno + ", descripcion=" + descripcion + ", total=" + total + '}';
    }
    
}
