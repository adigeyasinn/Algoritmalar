
import java.util.LinkedList;
import java.util.ListIterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author feda1
 */
public class linklist {
    public static void listeyi_bastır(LinkedList<String> gidilecek_yerler){
        /*for(String s:gidilecek_yerler ){
            System.out.println(s);
        }*/
        ListIterator<String> iterator=gidilecek_yerler.listIterator();
        
        while(iterator.hasNext()){//İteratörün gösterdiği herhangi bir değer var mı?

            s
        
    }
    public static void main(String[] args) {
        LinkedList<String> gidilecek_yerler=new LinkedList<String>();
        gidilecek_yerler.add("postane");
        gidilecek_yerler.add("market");
        gidilecek_yerler.add("okul");
        gidilecek_yerler.add("kütüphane");
        gidilecek_yerler.add("ev");
            
        listeyi_bastır(gidilecek_yerler);
    }
}
