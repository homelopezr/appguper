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
public class Servicio implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ser_codigo", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_SERVICIO")
    @SequenceGenerator(name = "seqServicio", sequenceName = "SEQ_SERVICIO", allocationSize = 1, initialValue = 1)
    private Integer serCodigo;
    @Column(name = "cli_codigo")
    private Integer cliCodigo;
    @Basic(optional = false)
    @Column(name = "eq_codigo", nullable = false, length = 25)
    private String eqCodigo;
    @Basic(optional = false)
    @Column(name = "fun_codigo", nullable = false)
    private int funCodigo;
    @Basic(optional = false)
    @Column(name = "ser_estado", nullable = false, length = 25)
    private String serEstado;
    @Basic(optional = false)
    @Column(name = "ser_monto", nullable = false)
    private int serMonto;

    public Servicio() {
    }

    public Servicio(Integer serCodigo) {
        this.serCodigo = serCodigo;
    }

    public Servicio(Integer serCodigo, String eqCodigo, int funCodigo, String serEstado, int serMonto) {
        this.serCodigo = serCodigo;
        this.eqCodigo = eqCodigo;
        this.funCodigo = funCodigo;
        this.serEstado = serEstado;
        this.serMonto = serMonto;
    }

    public Integer getSerCodigo() {
        return serCodigo;
    }

    public void setSerCodigo(Integer serCodigo) {
        this.serCodigo = serCodigo;
    }

    public Integer getCliCodigo() {
        return cliCodigo;
    }

    public void setCliCodigo(Integer cliCodigo) {
        this.cliCodigo = cliCodigo;
    }

    public String getEqCodigo() {
        return eqCodigo;
    }

    public void setEqCodigo(String eqCodigo) {
        this.eqCodigo = eqCodigo;
    }

    public int getFunCodigo() {
        return funCodigo;
    }

    public void setFunCodigo(int funCodigo) {
        this.funCodigo = funCodigo;
    }

    public String getSerEstado() {
        return serEstado;
    }

    public void setSerEstado(String serEstado) {
        this.serEstado = serEstado;
    }

    public int getSerMonto() {
        return serMonto;
    }

    public void setSerMonto(int serMonto) {
        this.serMonto = serMonto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (serCodigo != null ? serCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Servicio)) {
            return false;
        }
        Servicio other = (Servicio) object;
        if ((this.serCodigo == null && other.serCodigo != null) || (this.serCodigo != null && !this.serCodigo.equals(other.serCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "appguper.entities.Servicio[ serCodigo=" + serCodigo + " ]";
    }
    
}
