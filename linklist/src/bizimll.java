
public class bizimll {
    node head;
    node tail;
    
    public bizimll(){
        head=null;
        tail=null;
    }
    
    public boolean doluMu(){
        if(head!=null){
        return true;
        }
        else{
        return false;
        }
        
        }
    public void basaEkle(int sayi){
        node yeni=new node(sayi);
        if(doluMu()){//Liste dolu iken bu
        yeni.next=head;
        head=yeni;
        }
        
        else{
            //liste bos
        head=yeni;
        tail=yeni;
        }
    }
    
    public void sonaEkle(int sayi){
        node yeni=new node(sayi);
        if(doluMu()){//Liste dolu
        tail.next=yeni;
        tail=yeni;
        }
        else{
        head=yeni;
        tail=yeni;
        }
        
        
        
    }
    
    public void indekseEkle(int sayi,int indeks){
    node yeni=new node(sayi);
    int mevcutindeks=0;
    if(doluMu()){
        if(indeks==0){//başa eklemekle aynı
        head.next=yeni;
        head=yeni;}
        else{
    //ortada biryerde ekliyoruz
        node iter1=null;
        node iter2=head;
    
            while(iter2!=null&& mevcutindeks<indeks){
                iter1=iter2;
                iter2=iter2.next;
                mevcutindeks++;
  
    }
   
        if(iter2==null){
        //listenin sonuna ekle
            tail.next=yeni;
            tail=yeni;
        
        }
        else{
        yeni.next=iter2;
        iter1.next=yeni;
        
        }
        
        
        
        
    }
    
    }
        else{
        head=yeni;
        tail=yeni;
        }
    }
    public void bastanSil(){
        if(doluMu()){
            if(head==tail){
                head=null;
                tail=null;
            }
            else{
                node yeniBas=head.next;
                head.next=null;
                head=yeniBas;
            
            }
                
        }
    }
    public void indeksSil(int indeks){
        if (doluMu()&&indeks>=0) {
            if(head==tail){
            //tek eleman varsa
                head=null;
                tail=null;
            }
            else{
                //en az 2 eleman var
                if( indeks == 0 ) {
					// baştakini sil
					node yeniBas = head.next;
					head.next = null;
					head = yeniBas;
				}
                else{
                        //en az 2 eleman var ve sildiğimiz başta değil
                        node iter1=null;
                        node iter2=head;
                        int mevcutindeks=0;
                        while (iter2!=null&&mevcutindeks<indeks) {
                            iter1=iter2;
                            iter2=iter2.next;
                            mevcutindeks++;
                    }
                
                if(iter2!=null){
                    if(iter2==tail){
                    //sondan silme
                        tail=iter1;
                        iter1.next=null;
                    
                    }
                    else{
                        //ortadan silme
                        node iter3=iter2.next;
                        iter2.next=null;
                        iter1.next=iter3;
                        
                        
                        
                    }
                
                
                
                }
                }
                
               
            
            
            }
        }
    
    
    }
    
    public void verilenDegeriSil(int sayi){
        
    if(doluMu()){
        if(head==tail){//tek eleman var
        head=null;
        tail=null;}
    
    }
    else{
        //en az iki eleman var
    }
        if(head.deger==sayi){
            //baştakini sil
            node yenibas=head.next;
            head.next=null;
            head=yenibas;
        }
        else{
            //en az 2 eleman var ve sildiğimiz baştaki değil
            node iter1=null;
            node iter2=head;
            while(iter2!=null&&iter2.deger!=sayi){
                iter1=iter2;
                iter2=iter2.next;
            }
            if(iter2!=null){
                if(iter2==tail){
                    //sondan silme
                    tail=iter1;
                    iter1.next=null;
                }
            }
            else{
                //ortadan silme
                node iter3=iter2.next;
                iter2.next=null;
                iter1.next=iter3;
            }
        }
    }
            
    
    public void listeyiYazdir(){
        node iter=head;
        int elemansayisi=0;
        while(iter!=null){
            System.out.println(iter.deger+" ");
            iter=iter.next;
            elemansayisi++;
            
        }
        System.out.println();
        System.out.println("Eleman sayisi"+elemansayisi);
        System.out.println();
    }
    
    public static void main(String[] args) {
        bizimll listt=new bizimll();
        listt.indekseEkle(10, 0);
        listt.indekseEkle(20, 1);
        listt.listeyiYazdir();
    }
}
