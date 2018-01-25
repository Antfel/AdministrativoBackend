/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.transportesscaramutti.AdministrativoBackend.Modelo.liquidacion;

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
@Table(name = "liquidacion_otro")
public class LiquidacionOtro {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idLiquidacionOtro;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_liquidacion")
    private Liquidacion liquidacion;
    private String descripcion;
    private Double total;

    public long getIdLiquidacionOtro() {
        return idLiquidacionOtro;
    }

    public void setIdLiquidacionOtro(long idLiquidacionOtro) {
        this.idLiquidacionOtro = idLiquidacionOtro;
    }

    public Liquidacion getLiquidacion() {
        return liquidacion;
    }

    public void setLiquidacion(Liquidacion liquidacion) {
        this.liquidacion = liquidacion;
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
        return "LiquidacionOtro{" + "idLiquidacionOtro=" + idLiquidacionOtro + ", liquidacion=" + liquidacion + ", descripcion=" + descripcion + ", total=" + total + '}';
    }
    
}
