
package ogrenci;

import java.util.Scanner;


public class ogrenci {
    int no;
    String ad,soyad;
    ogrenci next,prev;
    ogrenci ilk=null,son=null;

    public ogrenci(int no,String ad,String soyad) {
        this.no=no;
        this.ad=ad;
        this.soyad=soyad;
        this.next=null;
        this.prev=null;
    }
   
    public void ekle(int no,String ad,String soyad){
        ogrenci yeni=new ogrenci(no, ad, soyad);
        if(ilk==null){
            ilk=yeni ;
            son=yeni;
        }
        else{
            son.next=yeni;
            yeni.prev=son;
            son=yeni;
        }
    }
    public void Listele(){
        ogrenci iter=ilk;
        while(iter!=null){
            System.out.println(iter.no+" "+iter.ad+""+iter.soyad);
            iter=iter.next;
            
        }
    }
   
}
