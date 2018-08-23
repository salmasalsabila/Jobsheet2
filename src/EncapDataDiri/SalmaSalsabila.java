/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EncapDataDiri;

/**
 *
 * @author lenovo
 */
public class SalmaSalsabila {
     private String namaAyah, namaIbu, namaSendiri, namaSaudara;
    private String alamat;
    private String hobi;
    private String citaCita;
    private int umur;
    
    public int getUmur(){
        return umur;
    }
    
    public String getNamaAyah(){
        return namaAyah;
    }
    
    public String getNamaIbu(){
        return namaIbu;
    }
    
    public String getNamaSendiri(){
        return namaSendiri;
    }
    
    public String getNamaSaudara(){
        return namaSaudara;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public String getHobi(){
        return hobi;
    }
    
    public String getCitaCita(){
        return citaCita;
    }
    
    public void setUmur(int newUmur){
        umur = newUmur;
    }
    
    public void setNamaAyah(String newNamaAyah){
        namaAyah = newNamaAyah;
    }
    public void setNamaIbu(String newNamaIbu){
        namaIbu = newNamaIbu;
    }
    
    public void setNamaSendiri(String newNamaSendiri){
        namaSendiri = newNamaSendiri;
    }
    public void setNamaSaudara(String newNamaSaudara){
        namaSaudara = newNamaSaudara;
    }
    
    public void setAlamat(String newAlamat){
        alamat = newAlamat;
    }
    
     public void setHobi(String newHobi){
        hobi = newHobi;
    }
    
      public void setCitaCita(String newCitaCita){
        citaCita = newCitaCita;
    }
}
