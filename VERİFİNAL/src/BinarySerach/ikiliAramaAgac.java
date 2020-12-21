/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySerach;

/**
 *
 * @author feda1
 */
public class ikiliAramaAgac {
    public ikiliAgacDugum kok;
    public ikiliAramaAgac(){
        this.kok=null;
    }
    
    public void ekle(int deger){
        ikiliAgacDugum yeni=new ikiliAgacDugum(deger);
        
        if(this.kok==null){
            this.kok=yeni;
            System.out.println("kok"+deger);
            return;
        }
        
        ikiliAgacDugum parent=null;
        ikiliAgacDugum aktif=this.kok;
        
        while(true){
            parent=aktif;
            
            if(deger<aktif.veri){
                aktif=aktif.sol;
                 if(aktif==null){
                parent.sol=yeni;
                System.out.println("parent:"+parent.veri+"soluna eklenen:"+yeni.veri);
                return;
            }
                
            }
            else if(deger>aktif.veri){
                aktif=aktif.sag;
                
                if(aktif==null){
                    parent.sag=yeni;
                    System.out.println("Parent:"+parent.veri+"sağına eklenen"+yeni.veri);
                    return;
                }
            }
            else{
                System.out.println("Bu değerden var");
                return;
            }
            
           
        }
        
    }
    
    public ikiliAgacDugum MaxDugum(ikiliAgacDugum kokDugum){
        
        if(kokDugum==null){
            return null;
        }
        
        ikiliAgacDugum aktif=kokDugum;
        
        while(aktif.sag!=null){
            aktif=aktif.sag;
        }
        return aktif;
    }
    
    public ikiliAgacDugum MinDugum(ikiliAgacDugum kokDugum){
        
        if(kokDugum==null){
            return null;
        }
        
        ikiliAgacDugum aktif=kokDugum;
        
        while(aktif.sol!=null){
            aktif=aktif.sol;
        }
        return aktif;
    }
    
    public ikiliAgacDugum dugumBul(int deger){
        
        if(this.kok==null){
            return null;
        }
        ikiliAgacDugum aktif=this.kok;
        
        while(aktif!=null){
            
            if(aktif.veri==deger){
                return aktif;
            }
            else if( deger<aktif.veri)
                aktif=aktif.sol;
            
            else{
                aktif=aktif.sag;
            }
            
        }
        return null;
    }
    
    public void inOrderTraverse(ikiliAgacDugum localroot){
        if(localroot!=null){
            inOrderTraverse(localroot.sol);
            localroot.yazdir();
            inOrderTraverse(localroot.sag);
        }
    }
    
    public ikiliAgacDugum dugumSil(ikiliAgacDugum kokDugum, int deger){
        
        if(kokDugum==null){
            System.out.println("Silme başarısız");
            return null;
        }
        
        if(deger<kokDugum.veri){
            kokDugum.sol=dugumSil(kokDugum.sol, deger);
            return kokDugum;
        }
        
        else if( deger>kokDugum.veri){
            kokDugum.sag=dugumSil(kokDugum.sag, deger);
            return kokDugum;
            
        }
        
        else{
            
            if(kokDugum.sol!=null && kokDugum.sag!=null){
                ikiliAgacDugum temp=this.MinDugum(kokDugum.sag);
                kokDugum.veri=temp.veri;
                kokDugum.sag=dugumSil(kokDugum.sag,temp.veri);
                System.out.println("kontrool_sol_sağ_çocuk");
                return kokDugum;
            }
            
            else if(kokDugum.sol!=null){
                kokDugum=kokDugum.sol;
                kokDugum.sol=null;
                System.out.println("Kontrol-sol-sag-çocuk");
                return null;
            }
           
            else if(kokDugum.sag!=null){
                kokDugum=kokDugum.sag;
                kokDugum.sag=null;
                System.out.println("Kontrol-sol-sağ-çocuk");
                return null;
            }
            
            else{
                System.out.println("Kontrol-yaprak");
                kokDugum=null;
                return null;
            }
            
        }
    }
    
    public static void main(String[] args) {
        ikiliAramaAgac t=new ikiliAramaAgac();
        t.ekle(10);
        t.ekle(5);
        t.ekle(30);
        t.ekle(23);
        t.ekle(60);
        t.ekle(21);
        t.ekle(3);
        System.out.println("En büyük:"+t.MaxDugum(t.kok).veri);
        System.out.println("En küyük:"+t.MinDugum(t.kok).veri);
        ikiliAgacDugum bulunan=t.dugumBul(5);
        if(bulunan!=null)
            System.out.println(bulunan.veri);
        else
            System.out.println("Değer bulunmadı");
        
        
        t.inOrderTraverse(t.kok);
    }
    
}
