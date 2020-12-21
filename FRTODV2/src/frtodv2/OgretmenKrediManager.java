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
public class OgretmenKrediManager extends BaseKrediManager
{

    @Override
    public void hesapla(double tutar) {
       double faiz=1.58;
        
        System.out.println("Ne kadar kredi çekilecek ?");
        System.out.println(tutar);
        
        double kredi=tutar*faiz;
        System.out.println("Faiz sonrası ödenecek tutar:"+kredi);
    }

    
    
}
