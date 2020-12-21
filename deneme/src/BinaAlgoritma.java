
import java.util.Random;
import sun.net.www.content.audio.aiff;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author feda1
 */
public class BinaAlgoritma {
    public static void main(String[] args) {
        int [][]a=new int[4][4];
        int []b=new int[4];
        for(int i=0;i<4;i++){
            
            for(int j=0;j<4;j++){
                Random random=new Random();
                int sayi=random.nextInt(10);
                a[i][j]=sayi;
                int temp=a[0][0];
                if(a[i][j]>temp){
                    temp=a[i][j];
                    b[i]=temp;
                }
                
                System.out.print("   "+a[i][j]);
                
                
            }
           
            System.out.print("onden="+b[i]);
             System.out.println("\n");
        }
        
    }
}
