/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jug.joglosemar.opensinau.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Hendro
 */
@Entity
public class Mahasiswa implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    String nomorInduk;
    String namaDepan;
    String namaTengah;
    String namaKeluarga;
    String tempatLahir;
    Date tanggalLahir;
    String alamat1;
    String alamat2;
    Provinsi provinsi;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mahasiswa)) {
            return false;
        }
        Mahasiswa other = (Mahasiswa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jug.joglosemar.opensinau.entity.Mahasiswa[id=" + id + "]";
    }

}
