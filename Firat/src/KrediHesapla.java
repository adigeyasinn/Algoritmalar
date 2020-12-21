
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author feda1
 */
public class KrediHesapla {
    public String name;
    public String LastName;
    private int Credit;
    public double faiz=2.5;
    
    Scanner scanner=new Scanner(System.in);

    public int getCredit() {
        return Credit;
    }

    public void setCredit(int Credit) {
        this.Credit = Credit;
    }
    

   
    public void hesapla(){
        
        System.out.println("Ne kadar kredi çekmek istiyorsunuz ?");
        Credit=scanner.nextInt();
        
        double hesapla=Credit*faiz;
        System.out.println("Kredi Hesaplandı.Ödecenek tutar:"+hesapla);
    }

    
    
}
