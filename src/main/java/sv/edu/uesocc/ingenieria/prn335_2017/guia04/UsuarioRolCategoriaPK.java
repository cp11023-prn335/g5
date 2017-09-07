/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.prn335_2017.guia04;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author usuario
 */
@Embeddable
public class UsuarioRolCategoriaPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "id_rol")
    private int idRol;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_usuario")
    private int idUsuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_categoria")
    private int idCategoria;

    public UsuarioRolCategoriaPK() {
    }

    public UsuarioRolCategoriaPK(int idRol, int idUsuario, int idCategoria) {
        this.idRol = idRol;
        this.idUsuario = idUsuario;
        this.idCategoria = idCategoria;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idRol;
        hash += (int) idUsuario;
        hash += (int) idCategoria;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioRolCategoriaPK)) {
            return false;
        }
        UsuarioRolCategoriaPK other = (UsuarioRolCategoriaPK) object;
        if (this.idRol != other.idRol) {
            return false;
        }
        if (this.idUsuario != other.idUsuario) {
            return false;
        }
        if (this.idCategoria != other.idCategoria) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.edu.uesocc.ingenieria.prn335_2017.guia04.UsuarioRolCategoriaPK[ idRol=" + idRol + ", idUsuario=" + idUsuario + ", idCategoria=" + idCategoria + " ]";
    }
    
}
