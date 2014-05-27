/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appguper.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Adrianlrx <adrianlrx@gmail.com>
 */
@MappedSuperclass
@Table(catalog = "guper", schema = "")
@XmlRootElement
public class Recursos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "fun_codigo", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_RECURSOS")
    @SequenceGenerator(name = "seqRecursos", sequenceName = "SEQ_RECURSOS", allocationSize = 1, initialValue = 1)
    private Integer funCodigo;
    @Basic(optional = false)
    @Column(name = "salario_real", nullable = false)
    private int salarioReal;
    @Basic(optional = false)
    @Column(nullable = false)
    private int ips;
    @Basic(optional = false)
    @Column(nullable = false)
    private int vacaciones;
    @Basic(optional = false)
    @Column(nullable = false)
    private int indemnizacion;

    public Recursos() {
    }

    public Recursos(Integer funCodigo) {
        this.funCodigo = funCodigo;
    }

    public Recursos(Integer funCodigo, int salarioReal, int ips, int vacaciones, int indemnizacion) {
        this.funCodigo = funCodigo;
        this.salarioReal = salarioReal;
        this.ips = ips;
        this.vacaciones = vacaciones;
        this.indemnizacion = indemnizacion;
    }

    public Integer getFunCodigo() {
        return funCodigo;
    }

    public void setFunCodigo(Integer funCodigo) {
        this.funCodigo = funCodigo;
    }

    public int getSalarioReal() {
        return salarioReal;
    }

    public void setSalarioReal(int salarioReal) {
        this.salarioReal = salarioReal;
    }

    public int getIps() {
        return ips;
    }

    public void setIps(int ips) {
        this.ips = ips;
    }

    public int getVacaciones() {
        return vacaciones;
    }

    public void setVacaciones(int vacaciones) {
        this.vacaciones = vacaciones;
    }

    public int getIndemnizacion() {
        return indemnizacion;
    }

    public void setIndemnizacion(int indemnizacion) {
        this.indemnizacion = indemnizacion;
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
        if (!(object instanceof Recursos)) {
            return false;
        }
        Recursos other = (Recursos) object;
        if ((this.funCodigo == null && other.funCodigo != null) || (this.funCodigo != null && !this.funCodigo.equals(other.funCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "appguper.entities.Recursos[ funCodigo=" + funCodigo + " ]";
    }
    
}
