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
import javax.persistence.OneToOne;

/**
 *
 * @author Hendro
 */
@Entity
public class CalonMahasiswa implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String nomorUrut;
    private String namaDepan;
    private String namaTengah;
    private String namaKeluarga;
    private String tempatLahir;
    private Date tanggalLahir;
    private String alamat1;
    private String alamat2;
    private Kabupaten kabupaten;
    private Provinsi provinsi;        
    private Sekolah asalSekolah;
    private String tahunLulus;
    private String konsentrasi; //ipa,ips,bahasa
    private double nilaiUjianNasional;    
    private ProgramStudi pilihan1;
    private ProgramStudi pilihan2;
    private OrangTuaWali ayah;
    private OrangTuaWali ibu;

    @OneToOne
    public OrangTuaWali getAyah() {
        return ayah;
    }

    public void setAyah(OrangTuaWali ayah) {
        this.ayah = ayah;
    }

    @OneToOne
    public OrangTuaWali getIbu() {
        return ibu;
    }

    public void setIbu(OrangTuaWali ibu) {
        this.ibu = ibu;
    }
    
    
    
    public CalonMahasiswa() {
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

    public Sekolah getAsalSekolah() {
        return asalSekolah;
    }

    public void setAsalSekolah(Sekolah asalSekolah) {
        this.asalSekolah = asalSekolah;
    }

    public Kabupaten getKabupaten() {
        return kabupaten;
    }

    public void setKabupaten(Kabupaten kabupaten) {
        this.kabupaten = kabupaten;
    }

    public String getKonsentrasi() {
        return konsentrasi;
    }

    public void setKonsentrasi(String konsentrasi) {
        this.konsentrasi = konsentrasi;
    }

    public String getNamaDepan() {
        return namaDepan;
    }

    public void setNamaDepan(String namaDepan) {
        this.namaDepan = namaDepan;
    }

    public String getNamaKeluarga() {
        return namaKeluarga;
    }

    public void setNamaKeluarga(String namaKeluarga) {
        this.namaKeluarga = namaKeluarga;
    }

    public String getNamaTengah() {
        return namaTengah;
    }

    public void setNamaTengah(String namaTengah) {
        this.namaTengah = namaTengah;
    }

    public double getNilaiUjianNasional() {
        return nilaiUjianNasional;
    }

    public void setNilaiUjianNasional(double nilaiUjianNasional) {
        this.nilaiUjianNasional = nilaiUjianNasional;
    }

    public String getNomorUrut() {
        return nomorUrut;
    }

    public void setNomorUrut(String nomorUrut) {
        this.nomorUrut = nomorUrut;
    }

    public ProgramStudi getPilihan1() {
        return pilihan1;
    }

    public void setPilihan1(ProgramStudi pilihan1) {
        this.pilihan1 = pilihan1;
    }

    public ProgramStudi getPilihan2() {
        return pilihan2;
    }

    public void setPilihan2(ProgramStudi pilihan2) {
        this.pilihan2 = pilihan2;
    }

    public Provinsi getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(Provinsi provinsi) {
        this.provinsi = provinsi;
    }

    public String getTahunLulus() {
        return tahunLulus;
    }

    public void setTahunLulus(String tahunLulus) {
        this.tahunLulus = tahunLulus;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
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
        if (!(object instanceof CalonMahasiswa)) {
            return false;
        }
        CalonMahasiswa other = (CalonMahasiswa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jug.joglosemar.opensinau.entity.CalonMahasiswa[id=" + id + "]";
    }

}
