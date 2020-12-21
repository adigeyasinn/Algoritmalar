/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author feda1
 */
public class araba {
    


    public String renk;
    public int kapilar;
    public String model;
    public String motor;

    public static void main(String[] args) {
        araba araba1=new araba();
        araba1.renk = "Gümüş";
        araba1.kapilar = 4;
        
        araba1.motor = "16V";
        araba1.model = "Verso";
        
        System.out.println(araba1.motor);
    }

    void setModel(String renault) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getModel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setKapilar(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

