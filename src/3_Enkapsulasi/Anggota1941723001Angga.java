/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.koperasigettersetter;

public class Anggota1941723001Angga {
    private String nama;
    private String  alamat;
    private float simpanan;
    
    Anggota1941723001Angga(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
        this. simpanan = 0;
    } 
    
    public void setNama(String nama)
    {
        this.nama = nama;   
    }
    public void setAlamat(String alamat)
    {
        this.alamat = alamat;
    }
    public String getNama()
    {
        return nama;
    }
    public String getAlamat ()
    {
        return alamat;
    }
    public float getSimpanan()
    {
        return simpanan;
    }
    public void setor(float uang)
    {
        simpanan +=uang;
    }
    public void pinjaman(float uang)
    {
        simpanan -=uang;
    }
}
