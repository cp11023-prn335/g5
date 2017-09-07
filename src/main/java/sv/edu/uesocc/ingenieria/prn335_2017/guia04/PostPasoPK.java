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
public class PostPasoPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "id_paso")
    private int idPaso;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_post")
    private int idPost;

    public PostPasoPK() {
    }

    public PostPasoPK(int idPaso, int idPost) {
        this.idPaso = idPaso;
        this.idPost = idPost;
    }

    public int getIdPaso() {
        return idPaso;
    }

    public void setIdPaso(int idPaso) {
        this.idPaso = idPaso;
    }

    public int getIdPost() {
        return idPost;
    }

    public void setIdPost(int idPost) {
        this.idPost = idPost;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idPaso;
        hash += (int) idPost;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PostPasoPK)) {
            return false;
        }
        PostPasoPK other = (PostPasoPK) object;
        if (this.idPaso != other.idPaso) {
            return false;
        }
        if (this.idPost != other.idPost) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.edu.uesocc.ingenieria.prn335_2017.guia04.PostPasoPK[ idPaso=" + idPaso + ", idPost=" + idPost + " ]";
    }
    
}
