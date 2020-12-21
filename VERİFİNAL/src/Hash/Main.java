/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hash;

import java.util.Random;

/**
 *
 * @author feda1
 */
public class Main {

   
    public static void main(String[] args) {
        int dizi_boyut=100;
        int key, index;
        int [] hash_table_l=new int [dizi_boyut];
        int [] hash_table_q=new int [dizi_boyut];
        
        for(int i=0;i<dizi_boyut;i++){
            hash_table_l[i]=-1;
            hash_table_q[i]=-1;
        }
        
        int sayac=0; //100 adet rasgele sayı üretilmesiyle ilgili sayac
        //linear probing için tanımlananlar
        int sayac1_l=0;// tabloya direkt yerleşen değerleri sayar
        int sayac2_l=0;// çakışan değerleri sayar
        int sayac3_l=0;//çakışmalarda toplam kaç kez arama yapıldığını sayar
        
        //quadratic probing için tanımlananlar
        int sayac1_q=0;// tabloya direkt yerleşen değerleri sayar
        int sayac2_q=0;// çakışan değerleri sayar
        int sayac3_q=0;//çakışmalarda toplam kaç kez arama yapıldığını sayar
        while(sayac<dizi_boyut){
            Random r=new Random();
            key=10000+r.nextInt(90000); //5 basamaklı rasgele sayı üretmem
            index=key%dizi_boyut; //hash fonk uygulanır
            //linear probing kısmı
            if(hash_table_l[index]<0){ //tablodaki alan boş, çakışma yok,
                hash_table_l[index]=key;//değer tabloya yerleştirilir
                sayac1_l++;
            }else{//çakışma vardır,tablodaki alan dolu
                sayac2_l++;
                int k=1;
                while(hash_table_l[(index+k)%dizi_boyut]>=0){
                    k++;
                    sayac3_l++;
                }
                int yindex=(index+k)%dizi_boyut;
                hash_table_l[yindex]=key;
            }
            
            //quadratic probing kısmı
            if(hash_table_q[index]<0){ //tablodaki alan boş, çakışma yok,
                hash_table_q[index]=key;//değer tabloya yerleştirilir
                sayac1_q++;
            }else{//çakışma vardır,tablodaki alan dolu
                sayac2_q++;
                int k=1;
                while(hash_table_q[(index+k*k)%dizi_boyut]>=0){
                    k++;
                    sayac3_q++;
                }
                int yindex=(index+k*k)%dizi_boyut;
                hash_table_q[index]=key;
            }

            sayac++;
        }
        System.out.println("----Linear Probing---");
        System.out.println("Direkt yerleşen:"+sayac1_l);
        System.out.println("Çakısan:"+ sayac2_l);
        System.out.println("Çakışmalarda yapılan arama:"+sayac3_l);
        
        System.out.println("----Quadratic Probing---");
        System.out.println("Direkt yerleşen:"+sayac1_q);
        System.out.println("Çakısan:"+ sayac2_q);
        System.out.println("Çakışmalarda yapılan arama:"+sayac3_q);
        
    }
    
}
