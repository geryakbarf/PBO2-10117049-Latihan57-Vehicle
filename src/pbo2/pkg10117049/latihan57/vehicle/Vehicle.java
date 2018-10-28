/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117049.latihan57.vehicle;

/**
 *
 * @author Gery Akbar Fauzi
 * Nama : Gery Akbar Fauzi 
 * Kelas : PBO2 
 * Nim : 10117049
 * Deskripsi Program : Program ini berisi program informasi seputar kendaraan
 * Non-Mesin
 */
public class Vehicle {
    private String myBrand;
    private String myModel;
    
    public Vehicle(){
        
    }

    public String getBrand() {
        return myBrand;
    }

    public String getModel() {
        return myModel;
    }

    public void setBrand(String myBrand) {
        this.myBrand = myBrand;
    }

    public void setModel(String myModel) {
        this.myModel = myModel;
    }
    
    
}
