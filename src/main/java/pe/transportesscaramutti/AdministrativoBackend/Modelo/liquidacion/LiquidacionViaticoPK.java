/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.transportesscaramutti.AdministrativoBackend.Modelo.liquidacion;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author felix
 */
@Embeddable
public class LiquidacionViaticoPK implements Serializable {

    private static final long serialVersionUID = 1L;

    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idLiquidacionViatico;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_liquidacion")
    private Liquidacion liquidacion;

    public LiquidacionViaticoPK() {
    }

    public LiquidacionViaticoPK(long idLiquidacionViatico, Liquidacion liquidacion) {
        this.idLiquidacionViatico = idLiquidacionViatico;
        this.liquidacion = liquidacion;
    }
    
    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (int) (this.idLiquidacionViatico ^ (this.idLiquidacionViatico >>> 32));
        hash = 37 * hash + Objects.hashCode(this.liquidacion);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final LiquidacionViaticoPK other = (LiquidacionViaticoPK) obj;
        if (this.idLiquidacionViatico != other.idLiquidacionViatico) {
            return false;
        }
        if (!Objects.equals(this.liquidacion, other.liquidacion)) {
            return false;
        }
        return true;
    }

    public long getIdLiquidacionViatico() {
        return idLiquidacionViatico;
    }

    public void setIdLiquidacionViatico(long idLiquidacionViatico) {
        this.idLiquidacionViatico = idLiquidacionViatico;
    }

    public Liquidacion getLiquidacion() {
        return liquidacion;
    }

    public void setLiquidacion(Liquidacion liquidacion) {
        this.liquidacion = liquidacion;
    }

}
