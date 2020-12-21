/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author feda1
 */
public class OgretmenCredi extends KrediHesapla{

    @Override
    public void hesapla() {
        System.out.println("*************************");
        double faiz=1.5;
        
        System.out.println("Ne kadar kredi çekmek istiyorsunuz?");
        int Credit=scanner.nextInt();
       
        double hesapla=Credit*faiz;
        System.out.println("Ödecenek tutarr:"+hesapla);
        System.out.println("Öğretmen kredi hesaplandı");
        System.out.println("***************************");
    }
    
    
}
