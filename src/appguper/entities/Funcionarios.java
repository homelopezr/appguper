/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appguper.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Adrianlrx <adrianlrx@gmail.com>
 */
@MappedSuperclass
@Table(catalog = "guper", schema = "")
@XmlRootElement
public class Funcionarios implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "fun_codigo", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_FUNCIONARIOS")
    @SequenceGenerator(name = "seqFuncionarios", sequenceName = "SEQ_FUNCIONARIOS", allocationSize = 1, initialValue = 1)
    private Integer funCodigo;
    @Basic(optional = false)
    @Column(name = "fun_cedula", nullable = false, length = 20)
    private String funCedula;
    @Basic(optional = false)
    @Column(name = "fun_nombre", nullable = false, length = 80)
    private String funNombre;
    @Basic(optional = false)
    @Column(name = "fun_direccion", nullable = false, length = 5)
    private String funDireccion;
    @Basic(optional = false)
    @Column(name = "fun_telefono", nullable = false, length = 10)
    private String funTelefono;
    @Basic(optional = false)
    @Column(name = "fun_ingreso", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date funIngreso;
    @Basic(optional = false)
    @Column(name = "fun_situacion", nullable = false, length = 10)
    private String funSituacion;

    public Funcionarios() {
    }

    public Funcionarios(Integer funCodigo) {
        this.funCodigo = funCodigo;
    }

    public Funcionarios(Integer funCodigo, String funCedula, String funNombre, String funDireccion, String funTelefono, Date funIngreso, String funSituacion) {
        this.funCodigo = funCodigo;
        this.funCedula = funCedula;
        this.funNombre = funNombre;
        this.funDireccion = funDireccion;
        this.funTelefono = funTelefono;
        this.funIngreso = funIngreso;
        this.funSituacion = funSituacion;
    }

    public Integer getFunCodigo() {
        return funCodigo;
    }

    public void setFunCodigo(Integer funCodigo) {
        this.funCodigo = funCodigo;
    }

    public String getFunCedula() {
        return funCedula;
    }

    public void setFunCedula(String funCedula) {
        this.funCedula = funCedula;
    }

    public String getFunNombre() {
        return funNombre;
    }

    public void setFunNombre(String funNombre) {
        this.funNombre = funNombre;
    }

    public String getFunDireccion() {
        return funDireccion;
    }

    public void setFunDireccion(String funDireccion) {
        this.funDireccion = funDireccion;
    }

    public String getFunTelefono() {
        return funTelefono;
    }

    public void setFunTelefono(String funTelefono) {
        this.funTelefono = funTelefono;
    }

    public Date getFunIngreso() {
        return funIngreso;
    }

    public void setFunIngreso(Date funIngreso) {
        this.funIngreso = funIngreso;
    }

    public String getFunSituacion() {
        return funSituacion;
    }

    public void setFunSituacion(String funSituacion) {
        this.funSituacion = funSituacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (funCodigo != null ? funCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Funcionarios)) {
            return false;
        }
        Funcionarios other = (Funcionarios) object;
        if ((this.funCodigo == null && other.funCodigo != null) || (this.funCodigo != null && !this.funCodigo.equals(other.funCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "appguper.entities.Funcionarios[ funCodigo=" + funCodigo + " ]";
    }
    
}
