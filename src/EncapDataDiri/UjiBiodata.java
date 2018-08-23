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
public class UjiBiodata {
    public static void main(String[] args) {
        SalmaSalsabila biodata = new SalmaSalsabila();
        biodata.setNamaAyah("Akhmad Arif R");
        biodata.setNamaIbu("Dwi Astuti");
        biodata.setNamaSendiri("Salma Salsabila");
        biodata.setNamaSaudara("Akhmad Farkhan A");
        biodata.setAlamat("Blitar");
        biodata.setHobi("Membaca Novel");
        biodata.setCitaCita("PNS");
        biodata.setUmur(16);
        
        System.out.println("Nama Ayah    : "+biodata.getNamaAyah());
        System.out.println("Nama Ibu     : "+biodata.getNamaIbu());
        System.out.println("Nama Sendiri : "+biodata.getNamaSendiri());
        System.out.println("Nama Saudara : "+biodata.getNamaSaudara());
        System.out.println("Alamat       : "+ biodata.getAlamat());
        System.out.println("Hobi         : "+ biodata.getHobi());
        System.out.println("Cita - Cita  : "+biodata.getCitaCita());
        System.out.println("Umur         : "+biodata.getUmur());
    }
}
