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
public class Equipo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "eq_codigo", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_EQUIPO")
    @SequenceGenerator(name = "seqEquipo", sequenceName = "SEQ_EQUIPO", allocationSize = 1, initialValue = 1)
    private Integer eqCodigo;
    @Basic(optional = false)
    @Column(name = "eq_descripcion", nullable = false, length = 50)
    private String eqDescripcion;

    public Equipo() {
    }

    public Equipo(Integer eqCodigo) {
        this.eqCodigo = eqCodigo;
    }

    public Equipo(Integer eqCodigo, String eqDescripcion) {
        this.eqCodigo = eqCodigo;
        this.eqDescripcion = eqDescripcion;
    }

    public Integer getEqCodigo() {
        return eqCodigo;
    }

    public void setEqCodigo(Integer eqCodigo) {
        this.eqCodigo = eqCodigo;
    }

    public String getEqDescripcion() {
        return eqDescripcion;
    }

    public void setEqDescripcion(String eqDescripcion) {
        this.eqDescripcion = eqDescripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eqCodigo != null ? eqCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Equipo)) {
            return false;
        }
        Equipo other = (Equipo) object;
        if ((this.eqCodigo == null && other.eqCodigo != null) || (this.eqCodigo != null && !this.eqCodigo.equals(other.eqCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "appguper.entities.Equipo[ eqCodigo=" + eqCodigo + " ]";
    }
    
}
