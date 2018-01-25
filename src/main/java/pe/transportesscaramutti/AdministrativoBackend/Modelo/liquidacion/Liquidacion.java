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
import pe.transportesscaramutti.AdministrativoBackend.Modelo.Asignacion.AsignacionServicio;

/**
 *
 * @author felix
 */
@Entity
@Table(name = "liquidacion")
public class Liquidacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idLiquidacion;
    private String numeroLiquidacion;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_asignacion_servicio")
    private AsignacionServicio asignacionServicio;
    private Double totalPeaje;
    private Double totalViaticos;
    private Double totalGuardiania;
    private Double totalHospedaje;
    private Double totalBalanza;
    private Double totalOtros;
    private Double consumoFisicoCombustible;
    private Double consumoVirtualCombustible;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_estado_liquidacion")
    private EstadoLiquidacion estadoLiquidacion;

    public long getIdLiquidacion() {
        return idLiquidacion;
    }

    public void setIdLiquidacion(long idLiquidacion) {
        this.idLiquidacion = idLiquidacion;
    }

    public String getNumeroLiquidacion() {
        return numeroLiquidacion;
    }

    public void setNumeroLiquidacion(String numeroLiquidacion) {
        this.numeroLiquidacion = numeroLiquidacion;
    }

    public AsignacionServicio getAsignacionServicio() {
        return asignacionServicio;
    }

    public void setAsignacionServicio(AsignacionServicio asignacionServicio) {
        this.asignacionServicio = asignacionServicio;
    }

    public Double getTotalPeaje() {
        return totalPeaje;
    }

    public void setTotalPeaje(Double totalPeaje) {
        this.totalPeaje = totalPeaje;
    }

    public Double getTotalViaticos() {
        return totalViaticos;
    }

    public void setTotalViaticos(Double totalViaticos) {
        this.totalViaticos = totalViaticos;
    }

    public Double getTotalGuardiania() {
        return totalGuardiania;
    }

    public void setTotalGuardiania(Double totalGuardiania) {
        this.totalGuardiania = totalGuardiania;
    }

    public Double getTotalHospedaje() {
        return totalHospedaje;
    }

    public void setTotalHospedaje(Double totalHospedaje) {
        this.totalHospedaje = totalHospedaje;
    }

    public Double getTotalBalanza() {
        return totalBalanza;
    }

    public void setTotalBalanza(Double totalBalanza) {
        this.totalBalanza = totalBalanza;
    }

    public Double getTotalOtros() {
        return totalOtros;
    }

    public void setTotalOtros(Double totalOtros) {
        this.totalOtros = totalOtros;
    }

    public Double getConsumoFisicoCombustible() {
        return consumoFisicoCombustible;
    }

    public void setConsumoFisicoCombustible(Double consumoFisicoCombustible) {
        this.consumoFisicoCombustible = consumoFisicoCombustible;
    }

    public Double getConsumoVirtualCombustible() {
        return consumoVirtualCombustible;
    }

    public void setConsumoVirtualCombustible(Double consumoVirtualCombustible) {
        this.consumoVirtualCombustible = consumoVirtualCombustible;
    }

    public EstadoLiquidacion getEstadoLiquidacion() {
        return estadoLiquidacion;
    }

    public void setEstadoLiquidacion(EstadoLiquidacion estadoLiquidacion) {
        this.estadoLiquidacion = estadoLiquidacion;
    }

    @Override
    public String toString() {
        return "Liquidacion{" + "idLiquidacion=" + idLiquidacion + ", numeroLiquidacion=" + numeroLiquidacion + ", asignacionServicio=" + asignacionServicio + ", totalPeaje=" + totalPeaje + ", totalViaticos=" + totalViaticos + ", totalGuardiania=" + totalGuardiania + ", totalHospedaje=" + totalHospedaje + ", totalBalanza=" + totalBalanza + ", totalOtros=" + totalOtros + ", consumoFisicoCombustible=" + consumoFisicoCombustible + ", consumoVirtualCombustible=" + consumoVirtualCombustible + ", estadoLiquidacion=" + estadoLiquidacion + '}';
    }
    
}
