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
public class Compra implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "com_numero", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_COMPRA")
    @SequenceGenerator(name = "seqCompra", sequenceName = "SEQ_COMPRA", allocationSize = 1, initialValue = 1)
    private Integer comNumero;
    @Basic(optional = false)
    @Column(name = "com_comprobante", nullable = false)
    private int comComprobante;
    @Basic(optional = false)
    @Column(name = "prove_codigo", nullable = false)
    private int proveCodigo;
    @Basic(optional = false)
    @Column(name = "com_observacion", nullable = false, length = 80)
    private String comObservacion;
    @Basic(optional = false)
    @Column(name = "pro_codigo", nullable = false)
    private int proCodigo;
    @Basic(optional = false)
    @Column(name = "pro_cantidad", nullable = false)
    private int proCantidad;
    @Basic(optional = false)
    @Column(name = "com_total", nullable = false)
    private int comTotal;

    public Compra() {
    }

    public Compra(Integer comNumero) {
        this.comNumero = comNumero;
    }

    public Compra(Integer comNumero, int comComprobante, int proveCodigo, String comObservacion, int proCodigo, int proCantidad, int comTotal) {
        this.comNumero = comNumero;
        this.comComprobante = comComprobante;
        this.proveCodigo = proveCodigo;
        this.comObservacion = comObservacion;
        this.proCodigo = proCodigo;
        this.proCantidad = proCantidad;
        this.comTotal = comTotal;
    }

    public Integer getComNumero() {
        return comNumero;
    }

    public void setComNumero(Integer comNumero) {
        this.comNumero = comNumero;
    }

    public int getComComprobante() {
        return comComprobante;
    }

    public void setComComprobante(int comComprobante) {
        this.comComprobante = comComprobante;
    }

    public int getProveCodigo() {
        return proveCodigo;
    }

    public void setProveCodigo(int proveCodigo) {
        this.proveCodigo = proveCodigo;
    }

    public String getComObservacion() {
        return comObservacion;
    }

    public void setComObservacion(String comObservacion) {
        this.comObservacion = comObservacion;
    }

    public int getProCodigo() {
        return proCodigo;
    }

    public void setProCodigo(int proCodigo) {
        this.proCodigo = proCodigo;
    }

    public int getProCantidad() {
        return proCantidad;
    }

    public void setProCantidad(int proCantidad) {
        this.proCantidad = proCantidad;
    }

    public int getComTotal() {
        return comTotal;
    }

    public void setComTotal(int comTotal) {
        this.comTotal = comTotal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (comNumero != null ? comNumero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Compra)) {
            return false;
        }
        Compra other = (Compra) object;
        if ((this.comNumero == null && other.comNumero != null) || (this.comNumero != null && !this.comNumero.equals(other.comNumero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "appguper.entities.Compra[ comNumero=" + comNumero + " ]";
    }
    
}
