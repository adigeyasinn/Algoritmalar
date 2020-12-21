/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author feda1
 */
public class node {

    public int deger;
    public node next;
    public node prev;
    
    public node(){
        this.deger=0;
        this.next=null;
        this.prev=null;
        
    }
    public node(int sayi){
        this.deger=sayi;
        this.next=null;
        this.prev=null;
        
    }
    public void yazdir(){
        System.out.println(this.deger);
    }
    
}
