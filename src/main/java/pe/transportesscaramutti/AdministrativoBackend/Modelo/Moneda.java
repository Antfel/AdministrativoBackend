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
@Table(name = "moneda")
public class Moneda {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idMoneda;
    private String DescripcionMoneda;

    public long getIdMoneda() {
        return idMoneda;
    }

    public void setIdMoneda(long idMoneda) {
        this.idMoneda = idMoneda;
    }

    public String getDescripcionMoneda() {
        return DescripcionMoneda;
    }

    public void setDescripcionMoneda(String DescripcionMoneda) {
        this.DescripcionMoneda = DescripcionMoneda;
    }

    @Override
    public String toString() {
        return "Moneda{" + "idMoneda=" + idMoneda + ", DescripcionMoneda=" + DescripcionMoneda + '}';
    }
    
}
