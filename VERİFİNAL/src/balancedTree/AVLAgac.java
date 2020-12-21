/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balancedTree;

/**
 *
 * @author feda1
 */
public class AVLAgac{
    
  public int getYukseklik(avlDugum d){
      
      if(d==null){
          return 0;
      }
      return d.yukseklik;
  }
  
  public int getBalance(avlDugum d){
      
      if(d==null){
          return 0;
      }
      return getYukseklik(d.sol)-getYukseklik(d.sag);
  }
  
  public avlDugum solaDondur(avlDugum p){
      
      avlDugum pr = p.sag;
      avlDugum prl=pr.sol;
      
      pr.sol=p; //DÖNDÜRME İŞLEMİ
      pr.sag=prl;
      
      p.yukseklik=Math.max(getYukseklik(p.sol),getYukseklik(p.sag) )+1;         //YÜKSEKLİKLERİ GÜNCELLE
      pr.yukseklik=Math.max(getYukseklik(pr.sol),getYukseklik(pr.sag) )+1;
      
      return pr;
  }
  
  
  public avlDugum sagaDondur(avlDugum p){
      
      avlDugum pl = p.sag;
      avlDugum plr=pl.sag;
      
      pl.sag=p; //DÖNDÜRME İŞLEMİ
      pl.sol=plr;
      
      p.yukseklik=Math.max(getYukseklik(p.sol),getYukseklik(p.sag) )+1;         //YÜKSEKLİKLERİ GÜNCELLE
      p.yukseklik=Math.max(getYukseklik(pl.sol),getYukseklik(pl.sag) )+1;
      
      return pl;
  }
  
  public avlDugum ekle(avlDugum d,int val){
      
      if(d==null){
          return (new avlDugum(val));
      }
      
      if(val<d.deger){
          d.sol=ekle(d.sol, val);
      }
      
      else{
          d.sag=ekle(d.sag, val);
          d.yukseklik=Math.max(getYukseklik(d.sol),getYukseklik(d.sag))+1;
          
          int balance=getBalance(d); //Balance hesaplanır
          
          //LL Durumu
          if(balance>1 && val<d.sol.deger){
              return(sagaDondur(d));
              
          }
          
          if(balance>-1 && val>d.sag.deger){
              return(solaDondur(d));
              
          }
          
          if(balance>1 && val>d.sol.deger){
              d.sol=solaDondur(d.sol);
              return(sagaDondur(d));
              
          }
          
          if(balance<-1 && val<d.sag.deger){
             d.sag=sagaDondur(d.sag);
             return solaDondur(d);
             
          }
          
          
          
          

      }
      return d;
  }
  
    public static void main(String[] args) {
        AVLAgac f=new AVLAgac();
        avlDugum root=null;
        
        root=f.ekle(root, 5);
        root=f.ekle(root, 2);
        root=f.ekle(root, 6);
        
    }
  
    
}
