/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.transportesscaramutti.AdministrativoBackend.Modelo.liquidacion;

import java.util.Date;
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
@Table(name = "liquidacion_peaje")
public class LiquidacionPeaje {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idLiquidacionPeaje;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_liquidacion")
    private Liquidacion liquidacion;
    private Date fechaPeaje;
    private String lugar;
    private long ejes;
    private Double totalPeaje;

    public long getIdLiquidacionPeaje() {
        return idLiquidacionPeaje;
    }

    public void setIdLiquidacionPeaje(long idLiquidacionPeaje) {
        this.idLiquidacionPeaje = idLiquidacionPeaje;
    }

    public Liquidacion getLiquidacion() {
        return liquidacion;
    }

    public void setLiquidacion(Liquidacion liquidacion) {
        this.liquidacion = liquidacion;
    }

    public Date getFechaPeaje() {
        return fechaPeaje;
    }

    public void setFechaPeaje(Date fechaPeaje) {
        this.fechaPeaje = fechaPeaje;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public long getEjes() {
        return ejes;
    }

    public void setEjes(long ejes) {
        this.ejes = ejes;
    }

    public Double getTotalPeaje() {
        return totalPeaje;
    }

    public void setTotalPeaje(Double totalPeaje) {
        this.totalPeaje = totalPeaje;
    }

    @Override
    public String toString() {
        return "LiquidacionPeaje{" + "idLiquidacionPeaje=" + idLiquidacionPeaje + ", liquidacion=" + liquidacion + ", fechaPeaje=" + fechaPeaje + ", lugar=" + lugar + ", ejes=" + ejes + ", totalPeaje=" + totalPeaje + '}';
    }
    
}
