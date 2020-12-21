
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author feda1
 */
public class chaining {
    public static void main(String[] args) {
        
    
    
    int boyut=11;
    int key,index;
    int adim;
    int [][]diziC=new int[boyut-1][2];
    
    for(int i=0;i<11;i++){
        for(int j=0;j<3;j++){
            diziC[i][1]=-1;
            diziC[i][2]=-1;
        }
    }
   
   
    int sayac=0;
   while(sayac<11){
    Random r=new Random();
    key=10+r.nextInt(89);
    index=key%boyut;
    adim=key/boyut;
    
   if(diziC[index][1]<0){
       diziC[index][1]=key;
       diziC[index][2]=adim;
   }
   else{
       diziC[index+adim][1]=key;
   }
   sayac++;
   }
    }
}
