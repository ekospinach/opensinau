/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jug.joglosemar.opensinau.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Hendro
 */
@Entity
public class OrangTuaWali implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String nama;
    private String alamat1;
    private String alamat2;
    private Kabupaten kabupaten;
    private Provinsi provinsi;

    public OrangTuaWali() {
    }

    public String getAlamat1() {
        return alamat1;
    }

    public void setAlamat1(String alamat1) {
        this.alamat1 = alamat1;
    }

    public String getAlamat2() {
        return alamat2;
    }

    public void setAlamat2(String alamat2) {
        this.alamat2 = alamat2;
    }

    public Kabupaten getKabupaten() {
        return kabupaten;
    }

    public void setKabupaten(Kabupaten kabupaten) {
        this.kabupaten = kabupaten;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Provinsi getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(Provinsi provinsi) {
        this.provinsi = provinsi;
    }
    
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
        if (!(object instanceof OrangTuaWali)) {
            return false;
        }
        OrangTuaWali other = (OrangTuaWali) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jug.joglosemar.opensinau.entity.OrangTuaWali[id=" + id + "]";
    }

}
