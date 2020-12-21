
import java.util.Scanner;
import jdk.nashorn.internal.parser.TokenType;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author feda1
 */
public class Armstrong_sayi {
    
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir sayi giriniz...");
        int sayi=scanner.nextInt();
        System.out.println("Basamak sayısı:");
        int basamak_sayisi=scanner.nextInt();
        
        int gecisi_sayi=sayi;
        int toplam=0;
        
        do {            
            int basamak_degeri=gecisi_sayi%10;
            gecisi_sayi/=10;
            
            toplam+=Math.pow(basamak_degeri, basamak_sayisi);
            
            
        } while (gecisi_sayi>0);
        
        if(sayi==toplam){
            System.out.println("Bu sayi bir armstrong sayisidir...");
            
         
        }
        else{
            System.out.println("Sayi armstrong sayisi değildir...");
        }
        
    }
    
}
