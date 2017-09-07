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
public class TipoPostSeccionPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "id_tipo_post")
    private int idTipoPost;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_seccion")
    private int idSeccion;

    public TipoPostSeccionPK() {
    }

    public TipoPostSeccionPK(int idTipoPost, int idSeccion) {
        this.idTipoPost = idTipoPost;
        this.idSeccion = idSeccion;
    }

    public int getIdTipoPost() {
        return idTipoPost;
    }

    public void setIdTipoPost(int idTipoPost) {
        this.idTipoPost = idTipoPost;
    }

    public int getIdSeccion() {
        return idSeccion;
    }

    public void setIdSeccion(int idSeccion) {
        this.idSeccion = idSeccion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idTipoPost;
        hash += (int) idSeccion;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoPostSeccionPK)) {
            return false;
        }
        TipoPostSeccionPK other = (TipoPostSeccionPK) object;
        if (this.idTipoPost != other.idTipoPost) {
            return false;
        }
        if (this.idSeccion != other.idSeccion) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.edu.uesocc.ingenieria.prn335_2017.guia04.TipoPostSeccionPK[ idTipoPost=" + idTipoPost + ", idSeccion=" + idSeccion + " ]";
    }
    
}
