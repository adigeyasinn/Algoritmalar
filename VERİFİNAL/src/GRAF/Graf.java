/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GRAF;

import com.sun.xml.internal.ws.encoding.soap.SOAP12Constants;
import sun.security.util.Length;

/**
 *
 * @author feda1
 */
public class Graf {
    public int dugumSay;
    public Dugum[]komsulukDizi;
    
    public int []isaretli;
    public Graf(int dsay){
        this.dugumSay=dsay;
        this.komsulukDizi=new Dugum[dsay];
        
    }
    
    public void komsulukListesiOlustur(int a[][]){
        Dugum p;
        int i;
        int k;
        
        for(i=0;i<this.dugumSay;i++){
            p=this.komsulukDizi[i]=new Dugum(i);
            for(k=0;k<this.dugumSay;k++){
                
                if(a[i][k]==1){
                    p.sonraki_komsu=new Dugum(k);
                    p=p.sonraki_komsu;
                }
            }
        }
    }
    
    public void goster(){
        Dugum d;
        
        for(int i=0;i<this.dugumSay;i++){
            d=this.komsulukDizi[i];
            System.out.println("Düğüm adı:"+d.d_etiket);
            
            while(d!=null){
                d=d.sonraki_komsu;
                
                if(d==null)
                    break;
                
                System.out.println("Komşusu"+d.d_etiket);
            }
            System.err.println("------------");
        }
    }
    
    public void dfs(int head){
        Dugum w;
        int v;
        
        this.isaretli[head]=1;
        System.out.println(""+head);
        w=this.komsulukDizi[head];
        
        while(w!=null){
            v=w.d_etiket;
            
            if(this.isaretli[v]==0)
                dfs(v);
            w=w.sonraki_komsu;
        }
    }
    
    public void bfs(int head){
        int v;
        Dugum adj;
        Kuyruk k=new Kuyruk(100);
        v=head;
        this.isaretli[v]=1;
        System.out.println(v+"");
        k.kuyrugaEkle(v);
        
        while(!k.bosmu()){
            v=k.kuyruktanCikar();
            adj=this.komsulukDizi[v];
            
            while(adj!=null){
                v=adj.d_etiket;
                
                if(this.isaretli[v]==0){
                    k.kuyrugaEkle(v);
                    this.isaretli[v]=1;
                    System.out.println(v+"");
                } 
               adj=adj.sonraki_komsu;
            }
        }
        
        
    }
    
}
