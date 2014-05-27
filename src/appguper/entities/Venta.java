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
public class Venta implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ven_codigo", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_VENTA")
    @SequenceGenerator(name = "seqVenta", sequenceName = "SEQ_VENTA", allocationSize = 1, initialValue = 1)
    private Integer venCodigo;
    @Basic(optional = false)
    @Column(name = "cli_codigo", nullable = false)
    private int cliCodigo;
    @Basic(optional = false)
    @Column(name = "pro_codigo", nullable = false)
    private int proCodigo;
    @Basic(optional = false)
    @Column(name = "pro_cantidad", nullable = false)
    private int proCantidad;
    @Basic(optional = false)
    @Column(name = "pro_precio_venta", nullable = false)
    private int proPrecioVenta;
    @Basic(optional = false)
    @Column(name = "ven_total", nullable = false)
    private int venTotal;
    @Basic(optional = false)
    @Column(name = "fun_codigo", nullable = false)
    private int funCodigo;

    public Venta() {
    }

    public Venta(Integer venCodigo) {
        this.venCodigo = venCodigo;
    }

    public Venta(Integer venCodigo, int cliCodigo, int proCodigo, int proCantidad, int proPrecioVenta, int venTotal, int funCodigo) {
        this.venCodigo = venCodigo;
        this.cliCodigo = cliCodigo;
        this.proCodigo = proCodigo;
        this.proCantidad = proCantidad;
        this.proPrecioVenta = proPrecioVenta;
        this.venTotal = venTotal;
        this.funCodigo = funCodigo;
    }

    public Integer getVenCodigo() {
        return venCodigo;
    }

    public void setVenCodigo(Integer venCodigo) {
        this.venCodigo = venCodigo;
    }

    public int getCliCodigo() {
        return cliCodigo;
    }

    public void setCliCodigo(int cliCodigo) {
        this.cliCodigo = cliCodigo;
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

    public int getProPrecioVenta() {
        return proPrecioVenta;
    }

    public void setProPrecioVenta(int proPrecioVenta) {
        this.proPrecioVenta = proPrecioVenta;
    }

    public int getVenTotal() {
        return venTotal;
    }

    public void setVenTotal(int venTotal) {
        this.venTotal = venTotal;
    }

    public int getFunCodigo() {
        return funCodigo;
    }

    public void setFunCodigo(int funCodigo) {
        this.funCodigo = funCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (venCodigo != null ? venCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Venta)) {
            return false;
        }
        Venta other = (Venta) object;
        if ((this.venCodigo == null && other.venCodigo != null) || (this.venCodigo != null && !this.venCodigo.equals(other.venCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "appguper.entities.Venta[ venCodigo=" + venCodigo + " ]";
    }
    
}
