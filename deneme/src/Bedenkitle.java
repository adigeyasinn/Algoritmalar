
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
public class Bedenkitle {
    public static void main(String[] args) {
        //BEDEN KİTLE ENDEKSİ HESAPLAMA
        //BKE=KİLO/BOY*BOY
        
        System.out.println("Kilonuzu giriniz:");
         System.out.println("Boyunuzu giriniz:");
        Scanner scanner=new Scanner(System.in);
        int kilo=scanner.nextInt();
        double boy=scanner.nextDouble();
        double islem=kilo/(boy*boy);
        System.out.println("Beden Kitle Endeksiniz:"+islem);
    }
}
