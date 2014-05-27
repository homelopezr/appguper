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
public class Producto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "pro_codigo", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PRODUCTO")
    @SequenceGenerator(name = "seqProducto", sequenceName = "SEQ_PRODUCTO", allocationSize = 1, initialValue = 1)
    private Integer proCodigo;
    @Basic(optional = false)
    @Column(name = "pro_descripcion", nullable = false, length = 50)
    private String proDescripcion;
    @Basic(optional = false)
    @Column(name = "pro_precio_compra", nullable = false)
    private int proPrecioCompra;
    @Basic(optional = false)
    @Column(name = "pro_precio_venta", nullable = false)
    private int proPrecioVenta;
    @Basic(optional = false)
    @Column(name = "prove_codigo", nullable = false)
    private int proveCodigo;
    @Basic(optional = false)
    @Column(name = "pro_cantidad", nullable = false)
    private int proCantidad;

    public Producto() {
    }

    public Producto(Integer proCodigo) {
        this.proCodigo = proCodigo;
    }

    public Producto(Integer proCodigo, String proDescripcion, int proPrecioCompra, int proPrecioVenta, int proveCodigo, int proCantidad) {
        this.proCodigo = proCodigo;
        this.proDescripcion = proDescripcion;
        this.proPrecioCompra = proPrecioCompra;
        this.proPrecioVenta = proPrecioVenta;
        this.proveCodigo = proveCodigo;
        this.proCantidad = proCantidad;
    }

    public Integer getProCodigo() {
        return proCodigo;
    }

    public void setProCodigo(Integer proCodigo) {
        this.proCodigo = proCodigo;
    }

    public String getProDescripcion() {
        return proDescripcion;
    }

    public void setProDescripcion(String proDescripcion) {
        this.proDescripcion = proDescripcion;
    }

    public int getProPrecioCompra() {
        return proPrecioCompra;
    }

    public void setProPrecioCompra(int proPrecioCompra) {
        this.proPrecioCompra = proPrecioCompra;
    }

    public int getProPrecioVenta() {
        return proPrecioVenta;
    }

    public void setProPrecioVenta(int proPrecioVenta) {
        this.proPrecioVenta = proPrecioVenta;
    }

    public int getProveCodigo() {
        return proveCodigo;
    }

    public void setProveCodigo(int proveCodigo) {
        this.proveCodigo = proveCodigo;
    }

    public int getProCantidad() {
        return proCantidad;
    }

    public void setProCantidad(int proCantidad) {
        this.proCantidad = proCantidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (proCodigo != null ? proCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) object;
        if ((this.proCodigo == null && other.proCodigo != null) || (this.proCodigo != null && !this.proCodigo.equals(other.proCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "appguper.entities.Producto[ proCodigo=" + proCodigo + " ]";
    }
    
}
