
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
public class kuyrukBanka {
    public int on,arka;
    public int []islem1;
    public int[]islem2;
    public int[]islem3;
    
    
    
    public kuyrukBanka(){
        on=-1;
        arka=0;
           
    }
    
    public void boyutAta(){
        
       Scanner scanner=new Scanner(System.in);
       int boyut=scanner.nextInt();
       islem1=new int[boyut];
       
       int boyut2=scanner.nextInt();
       islem1=new int[boyut2];
       int boyut3=scanner.nextInt();
       islem1=new int[boyut3];
      
}
    public int[] islemSec(int secim){
        if(secim==1){
            return islem1;
            
        }
        else if(secim==2){
            return islem2;
        }
        else
            return islem3;
    }
    
    public void kuyrugaEkle(int deger){
        if(on<=){
            on++;
            islemSec(deger);
        }
    }
    
}
