/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GRAF;

/**
 *
 * @author feda1
 */
public class Dugum {
   
    public int d_etiket;
    public Dugum sonraki_komsu;
    
    public Dugum(int e){
        this.d_etiket=e;
        this.sonraki_komsu=null;
    }
    
    public void yazdir(){
        System.out.println("Komşu etiketi:"+this.d_etiket);
    }
    
   
    
}
