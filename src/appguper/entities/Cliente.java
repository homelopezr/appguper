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
public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "cli_codigo", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CLIENTES")
    @SequenceGenerator(name = "seqClientes", sequenceName = "SEQ_CLIENTES", allocationSize = 1, initialValue = 1)
    private Integer cliCodigo;
    @Basic(optional = false)
    @Column(name = "cli_ruc", nullable = false, length = 20)
    private String cliRuc;
    @Basic(optional = false)
    @Column(name = "cli_nombre", nullable = false, length = 80)
    private String cliNombre;
    @Basic(optional = false)
    @Column(name = "cli_direccion", nullable = false, length = 50)
    private String cliDireccion;
    @Basic(optional = false)
    @Column(name = "cli_telefono", nullable = false, length = 10)
    private String cliTelefono;

    public Cliente() {
    }

    public Cliente(Integer cliCodigo) {
        this.cliCodigo = cliCodigo;
    }

    public Cliente(Integer cliCodigo, String cliRuc, String cliNombre, String cliDireccion, String cliTelefono) {
        this.cliCodigo = cliCodigo;
        this.cliRuc = cliRuc;
        this.cliNombre = cliNombre;
        this.cliDireccion = cliDireccion;
        this.cliTelefono = cliTelefono;
    }

    public Integer getCliCodigo() {
        return cliCodigo;
    }

    public void setCliCodigo(Integer cliCodigo) {
        this.cliCodigo = cliCodigo;
    }

    public String getCliRuc() {
        return cliRuc;
    }

    public void setCliRuc(String cliRuc) {
        this.cliRuc = cliRuc;
    }

    public String getCliNombre() {
        return cliNombre;
    }

    public void setCliNombre(String cliNombre) {
        this.cliNombre = cliNombre;
    }

    public String getCliDireccion() {
        return cliDireccion;
    }

    public void setCliDireccion(String cliDireccion) {
        this.cliDireccion = cliDireccion;
    }

    public String getCliTelefono() {
        return cliTelefono;
    }

    public void setCliTelefono(String cliTelefono) {
        this.cliTelefono = cliTelefono;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cliCodigo != null ? cliCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.cliCodigo == null && other.cliCodigo != null) || (this.cliCodigo != null && !this.cliCodigo.equals(other.cliCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "appguper.entities.Cliente[ cliCodigo=" + cliCodigo + " ]";
    }
    
}
