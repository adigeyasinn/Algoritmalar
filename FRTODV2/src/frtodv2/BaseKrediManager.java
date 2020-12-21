/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frtodv2;

/**
 *
 * @author feda1
 */
public class BaseKrediManager {
    
    public void hesapla(double tutar){
        
        double faiz=2.0;
        
        System.out.println("Ne kadar kredi çekilecek ?");
        System.out.println(tutar);
        
        double kredi=tutar*faiz;
        System.out.println("Faiz sonrası ödenecek tutar:"+kredi);
        
    }
    
}
