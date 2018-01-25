/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.transportesscaramutti.AdministrativoBackend.Modelo;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author felix
 */
@Entity
@Table(name = "trabajador")
public class Trabajador {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idTrabajador;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String nombres;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaIngreso;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaSalida;
    private String telefonoTrabajador;
    private String emailTrabajador;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_estado_trabajador")
    private EstadoTrabajador estadoTrabajador;

    public long getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(long idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getTelefonoTrabajador() {
        return telefonoTrabajador;
    }

    public void setTelefonoTrabajador(String telefonoTrabajador) {
        this.telefonoTrabajador = telefonoTrabajador;
    }

    public String getEmailTrabajador() {
        return emailTrabajador;
    }

    public void setEmailTrabajador(String emailTrabajador) {
        this.emailTrabajador = emailTrabajador;
    }

    public EstadoTrabajador getEstadoTrabajador() {
        return estadoTrabajador;
    }

    public void setEstadoTrabajador(EstadoTrabajador estadoTrabajador) {
        this.estadoTrabajador = estadoTrabajador;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "idTrabajador=" + idTrabajador + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + ", nombres=" + nombres + ", fechaIngreso=" + fechaIngreso + ", fechaSalida=" + fechaSalida + ", telefonoTrabajador=" + telefonoTrabajador + ", emailTrabajador=" + emailTrabajador + ", estadoTrabajador=" + estadoTrabajador + '}';
    }
    
}
