/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan1;

/**
 *
 * @author lenovo
 */
public class UjiBus {
    public static void main(String[] args) {
        //membuat objek busMini dari kelas Bus
        Latihan1.Bus busMini = new Latihan1.Bus();
        //masukan nilai jumlah penumpang dan penummpang ke
        //dalam objek busMini
        busMini.penumpang = 5 ;
        busMini.maxPenumpang = 15 ;
        //memanggil method cetak pada kelas Bus
        busMini.cetak();
        
        //menambahkan penumpang pada busMini
        busMini.penumpang = busMini.penumpang + 5;
        //memanggil method cetak pada kelas Bus
        busMini.cetak();
        
        //mengurangi jumlah penmpang pada busMini
        busMini.penumpang = busMini.penumpang - 2;
        busMini.cetak();
        
        //memambahkan jumlah penumpang pada busMini
        busMini.penumpang = busMini.penumpang + 8;
        busMini.cetak();
    }
}
