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
public class Main {
    public static void main(String[] args) {
    BaseKrediManager []kredi=new BaseKrediManager[]
    {new OgretmenKrediManager(),new OgrenciKrediManager(),new TarımKrediManager()
            
    };
    for(BaseKrediManager kredimanager:kredi){
        kredimanager.hesapla(1000);
    }
}
}