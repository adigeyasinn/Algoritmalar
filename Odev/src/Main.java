
public class Main {
    
   Node head;
   Node tail;
   
   public Main(){
    head=null;
    tail=null;
}
        public void sortAdd(String deger,int numara){
          Node yeni=new Node(deger,numara);
          Node yeni2=new Node(deger,numara);
          if(head==null){
              yeni.next=head;
              head=yeni;
          }
          Node iter=yeni;
          
              
          
         }
}

