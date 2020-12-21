
package ogrenci;

import java.util.Scanner;

public class liste {
    public static void main(String[] args) {
        int secim=-1;
        Scanner scanner=new Scanner(System.in);
        liste yeni=new liste();
        
        do { 
            System.out.println("1-Ogrenci Ekle\n2-Ogrencileri Listele\n3-Ogrenci sil\n0-cikis");
            secim=scanner.nextInt();
            
            switch(secim){
                case 1:
                    System.out.print("Ogrencinin numarasini giriniz:");
                    int no=scanner.nextInt();
                    System.out.print("Öğrencinin adını giriniz:");
                    String ad=scanner.nextLine();
                    System.out.print("Öğrencinin soyadını giriniz:");
                    String soyad=scanner.nextLine();
                    ogrenci
            }
                    
           
        } while (secim!=0);
    }
}
