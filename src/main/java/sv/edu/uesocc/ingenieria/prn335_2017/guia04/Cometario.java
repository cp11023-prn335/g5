/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.prn335_2017.guia04;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author usuario
 */
@Entity
@Table(name = "cometario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cometario.findAll", query = "SELECT c FROM Cometario c")
    , @NamedQuery(name = "Cometario.findByIdComentario", query = "SELECT c FROM Cometario c WHERE c.idComentario = :idComentario")
    , @NamedQuery(name = "Cometario.findByAprobado", query = "SELECT c FROM Cometario c WHERE c.aprobado = :aprobado")
    , @NamedQuery(name = "Cometario.findByComentario", query = "SELECT c FROM Cometario c WHERE c.comentario = :comentario")
    , @NamedQuery(name = "Cometario.findByFecha", query = "SELECT c FROM Cometario c WHERE c.fecha = :fecha")
    , @NamedQuery(name = "Cometario.findByIdUsuario", query = "SELECT c FROM Cometario c WHERE c.idUsuario = :idUsuario")})
public class Cometario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_comentario")
    private Integer idComentario;
    @Column(name = "aprobado")
    private Boolean aprobado;
    @Size(max = 255)
    @Column(name = "comentario")
    private String comentario;
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "id_usuario")
    private Integer idUsuario;
    @JoinColumn(name = "id_post", referencedColumnName = "id_post")
    @ManyToOne
    private Post idPost;

    public Cometario() {
    }

    public Cometario(Integer idComentario) {
        this.idComentario = idComentario;
    }

    public Integer getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(Integer idComentario) {
        this.idComentario = idComentario;
    }

    public Boolean getAprobado() {
        return aprobado;
    }

    public void setAprobado(Boolean aprobado) {
        this.aprobado = aprobado;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Post getIdPost() {
        return idPost;
    }

    public void setIdPost(Post idPost) {
        this.idPost = idPost;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idComentario != null ? idComentario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cometario)) {
            return false;
        }
        Cometario other = (Cometario) object;
        if ((this.idComentario == null && other.idComentario != null) || (this.idComentario != null && !this.idComentario.equals(other.idComentario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.edu.uesocc.ingenieria.prn335_2017.guia04.Cometario[ idComentario=" + idComentario + " ]";
    }
    
}
