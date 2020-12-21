
import java.util.Random;
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
public class hashUygulama {
    
    public static void main(String[] args) {
        int dizi_boyut=10;
        int key,index;
        int []hash_table_l=new int [dizi_boyut];
        int []hash_table_q=new int [dizi_boyut];
        
        for(int i=0;i<dizi_boyut;i++){
            hash_table_l[i]=-1;
            hash_table_q[i]=-1;
        }
        int sayac=0;
        int sayac1_l=0;//direk yerleşen değerler
        int sayac2_l=0;//çakışan değerler
        int sayac3_l=0;//çakışmalarda arama
        
        int sayac1_q=0;//quadratic probing
        int sayac2_q=0;//
        int sayac3_q=0;//çakışmalarda arama
        
        while(sayac<dizi_boyut){
            Random r=new Random();
            key=10+r.nextInt(100);//5 basamaklı rastgele sayı
            index=key%dizi_boyut;//hash fonk
            
            if(hash_table_l[index]<0){//alan boş,çakışma yok
                hash_table_l[index]=key;//değer tabloya yerleştirilir
                sayac1_l++;
                
            }
            else{//çakışma vardır, tablodaki alan dolu
                sayac2_l++;
                int k=1;
                while(hash_table_l[(index+k)%dizi_boyut]>0){
                k++;
                sayac3_l++;
            }
            int yindex=(index+k)%dizi_boyut;
            hash_table_l[index]=key;
        }
            if(hash_table_q[index]<0){
                hash_table_q[index]=key;
                sayac1_q++;
            }
            else{
                sayac2_q++;
                int k=1;
                while(hash_table_q[(index+k*k)%dizi_boyut]>0){
                    k++;
                    sayac3_q++;
                    
                }
                int yindex=(index+k*k)%dizi_boyut;
                hash_table_q[index]=key;
            }
            sayac++;
            
          
            }
          Scanner scanner=new Scanner(System.in);
            int degerr=scanner.nextInt();
            for(int i=0;i<dizi_boyut;i++){
                if(hash_table_l[i]/degerr==0){
                    System.out.println(i+". değer"+degerr);
                    break;
                }
                else
                    System.out.println("Böyle bir değer bulunamamktadır.");
                break;
            }
        System.out.println("-------Linear Probing-------");
        System.out.println("Direkt yerleşimi:"+sayac1_l);
        System.out.println("Çakışan:"+sayac2_l);
        System.out.println("Çakışmalarda yapılan arama:"+sayac3_l);
        
        System.out.println("-------Quadratic Probing-------");
        System.out.println("Direkt yerleşimi:"+sayac1_q);
        System.out.println("Çakışan:"+sayac2_q);
        System.out.println("Çakışmalarda yapılan arama:"+sayac3_q);
            
    }
}
