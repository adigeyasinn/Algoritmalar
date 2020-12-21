
public class Liste {

    public node head;
    public Liste(){
        this.head=null;
    }
    
    public void basaEkle(int sayi){
        node yeni=new node();
        head.prev=yeni;
        yeni.next=head;
        head=yeni;
    }
    public void sonaEkle(int sayi){
        node yeni=new node();
        if(head==null){
            yeni=head;
        }
        else{
            node iter=head;
            while(iter.next!=null){
                iter=iter.next;
            }
        iter.next=yeni;
        yeni.prev=iter;
       }
    }
    public void arayaEkle(int sayi,int indis){
    if((head==null)||(indis==1)){
        basaEkle(sayi);
        return;
    }    
    node yeni=new node();
    node iter=head;
    int sayac=1;
    while(iter.next!=null){
        if(sayac+1==indis){
            break;
        }
        sayac++;
        iter=iter.next;
    }
            
    yeni.next=iter.next;
    iter.next.prev=yeni;
    iter.next=yeni;
    yeni.prev=iter;
    }
    public void listele(){
        node iter=head;
        if(iter==null){
            System.out.println("Liste boş");
            return;
        }
        System.out.println("Liste Elemanları");
        while(iter!=null){
            iter.yazdir();
            iter=iter.next;
        }
    }
    public int elemanSil(int sayi){
        node iter=head;
        while(iter.deger!=sayi){
            iter=iter.next;
            if(iter==null){
                return -1;//bu ne demek?????????
            }
        }
        if(iter==head){
            head=iter.next;
            return 0;
        }
        iter.prev.next=iter.next;
        if(iter.next!=null){
            iter.next.prev=iter.prev;
        }
        return 0;
    }
}
