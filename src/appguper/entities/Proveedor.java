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
public class Proveedor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "prove_codigo", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PROVEEDOR")
    @SequenceGenerator(name = "seqProveedor", sequenceName = "SEQ_PROVEEDOR", allocationSize = 1, initialValue = 1)
    private Integer proveCodigo;
    @Basic(optional = false)
    @Column(name = "prove_ruc", nullable = false, length = 20)
    private String proveRuc;
    @Basic(optional = false)
    @Column(name = "prove_nombre", nullable = false, length = 80)
    private String proveNombre;
    @Basic(optional = false)
    @Column(name = "prove_direccion", nullable = false, length = 50)
    private String proveDireccion;
    @Basic(optional = false)
    @Column(name = "prove_telefono", nullable = false, length = 10)
    private String proveTelefono;

    public Proveedor() {
    }

    public Proveedor(Integer proveCodigo) {
        this.proveCodigo = proveCodigo;
    }

    public Proveedor(Integer proveCodigo, String proveRuc, String proveNombre, String proveDireccion, String proveTelefono) {
        this.proveCodigo = proveCodigo;
        this.proveRuc = proveRuc;
        this.proveNombre = proveNombre;
        this.proveDireccion = proveDireccion;
        this.proveTelefono = proveTelefono;
    }

    public Integer getProveCodigo() {
        return proveCodigo;
    }

    public void setProveCodigo(Integer proveCodigo) {
        this.proveCodigo = proveCodigo;
    }

    public String getProveRuc() {
        return proveRuc;
    }

    public void setProveRuc(String proveRuc) {
        this.proveRuc = proveRuc;
    }

    public String getProveNombre() {
        return proveNombre;
    }

    public void setProveNombre(String proveNombre) {
        this.proveNombre = proveNombre;
    }

    public String getProveDireccion() {
        return proveDireccion;
    }

    public void setProveDireccion(String proveDireccion) {
        this.proveDireccion = proveDireccion;
    }

    public String getProveTelefono() {
        return proveTelefono;
    }

    public void setProveTelefono(String proveTelefono) {
        this.proveTelefono = proveTelefono;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (proveCodigo != null ? proveCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proveedor)) {
            return false;
        }
        Proveedor other = (Proveedor) object;
        if ((this.proveCodigo == null && other.proveCodigo != null) || (this.proveCodigo != null && !this.proveCodigo.equals(other.proveCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "appguper.entities.Proveedor[ proveCodigo=" + proveCodigo + " ]";
    }
    
}
