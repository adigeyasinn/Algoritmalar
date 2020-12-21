/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author feda1
 */
public class araba2 {
    private String renk;
    private int kapilar;
    private int tekerlekler;
    private String motor;
    private String model;

    /**
     * @return the renk
     */
    public String getRenk() {
        return renk;
    }

    /**
     * @param renk the renk to set
     */
    public void setRenk(String renk) {
        this.renk = renk;
    }

    /**
     * @return the kapilar
     */
    public int getKapilar() {
        return kapilar;
    }

    /**
     * @param kapilar the kapilar to set
     */
    public void setKapilar(int kapilar) {
        
        if(kapilar<0){
            System.out.println("Kapı sayısı 1 den küçük olamaz");
        }
        else{
            this.kapilar = kapilar;
        }
    }

    /**
     * @return the tekerlekler
     */
    public int getTekerlekler() {
        return tekerlekler;
    }

    /**
     * @param tekerlekler the tekerlekler to set
     */
    public void setTekerlekler(int tekerlekler) {
        this.tekerlekler = tekerlekler;
    }

    /**
     * @return the motor
     */
    public String getMotor() {
        return motor;
    }

    /**
     * @param motor the motor to set
     */
    public void setMotor(String motor) {
        this.motor = motor;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }
    
    public static void main(String[] args) {
        araba2 araba1 = new araba2();
        
        
        araba1.setModel("Renault");
        
        System.out.println("Arabanın modeli " + araba1.getModel());
        
        
        araba1.setKapilar(-4);
        
        
        /*Araba araba2;
        
        araba2.setKapilar(10);*/
        
        /*araba araba3 = null;
        
        araba3.setModel("Renault");*/
        
    }
    
}
