/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117091.latihan55.handphone;

/**
 *
 * @author 
 * NAMA  : Dida Handian
 * Kelas : PBO3
 * NIM   : 10117091
 * Deskripsi Tugas : Membuat Program Data Spesifikasi handphone
 *  
 */
public class PBO310117091Latihan55Handphone {

    /**
     */
    protected static String manufacture;
    protected static String operatingSystem;
    protected static String model;
    protected static int harga;
    
    public static void main(String[] args) {
    
    Handphone handphone = new Handphone(manufacture, operatingSystem, model, harga);
    handphone.displayProduct();
    }
    
}
