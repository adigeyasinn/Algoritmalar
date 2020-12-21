
package verideneme;

public class queque {
    int[]arr;
    int capacity,first,last,currentSize;
    
    queque(int capacity){
        arr=new int[capacity];
        first=0;
        last=-1;
        currentSize=0;
        
    }
    
    boolean isEmpty(){
        return currentSize==0;
    }     
    
    boolean isFull(){
        return currentSize==capacity;
        
    }
    void enqueue(int item){ 
        if(isFull()){
            System.out.println("overflow...");
        }
        else{
            System.out.println("Ekleniyor..."+item);
            last+=1;
            arr[last]=item;
            currentSize++;
            System.out.println(last+" "+item);
        }
    }
    
    void dequeu(){
        if(isEmpty()){
            System.out.println("underflow...");
            
        }
        else{
            System.out.println("cikariliyor"+arr[first]);
            first+=1;
            currentSize--;
        }
    }
    
}
