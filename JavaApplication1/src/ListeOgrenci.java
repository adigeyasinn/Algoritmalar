
import java.util.Scanner;


public class ListeOgrenci {

    int no;
    String ad;
    String soyad;
    ListeOgrenci next;

    ListeOgrenci head=null;
    ListeOgrenci tail=null;
   
    
    public ListeOgrenci(int no,String ad,String soyad){
        this.no=no;
        this.ad=ad;
        this.soyad=soyad;
        this.next=null;
    }
    
    public void basaEkle(int no,String ad,String soyad){
        ListeOgrenci yeni=new ListeOgrenci(no, ad, soyad);
        yeni.next=head;
        head=yeni;
    }
    
  
    
    public int siraliEkle(int no,String ad,String soyad){
        ListeOgrenci yeni=new ListeOgrenci(no, ad, soyad);
        ListeOgrenci iter=null;
        while(iter!=null){

            iter=iter.next;
            if(iter.no>no){
                yeni.next=iter.next;
                iter=yeni;
                
                
            }
    
}
        return 0;
        
}
            public void listeyiYazdir(){
        ListeOgrenci iter=head;
        int elemansayisi=0;
        while(iter!=null){
            System.out.println(iter.no+" ");
            iter=iter.next;
            elemansayisi++;
            
        }
        System.out.println();
        System.out.println("Eleman sayisi"+elemansayisi);
        System.out.println();
    }
    public static void main(String[] args) {
       
        ListeOgrenci yeni=new ListeOgrenci();

        yeni.siraliEkle(39,"yasin", "güneş");

                yeni.siraliEkle(50,"yasin", "güneş");

                        yeni.siraliEkle(20,"yasin", "güneş");
yeni.basaEkle(5, "adige", "güneş");
        
        yeni.listeyiYazdir();
    }
}