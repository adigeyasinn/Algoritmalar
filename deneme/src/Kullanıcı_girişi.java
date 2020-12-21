
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author feda1
 */
public class Kullanıcı_girişi {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        int giris_hakki=3;
        
        String sys_kullanici_adi="Yasin Güneş";
        String sys_parola="adige";
        
        System.out.println("-------------------");
        System.out.println("Kullanıcı Giriş Ekranına Hoşgeldiniz...");
        System.out.println("-------------------");
        
        
        while (true) {            
            
            
            System.out.print("Kullanıcı Adı:");
            String kullanici=scanner.nextLine();
            System.out.print("Parola giriniz:");
            String parola=scanner.nextLine();
            
            if(kullanici.equals(sys_kullanici_adi)&&parola.equals(sys_parola)){
                System.out.println("Hoşgeldiniz"+kullanici);
                break;
            }
            else if(kullanici.equals(sys_kullanici_adi)&&!parola.equals(sys_parola)){
                System.out.println("Parolanız yanlış...");
                giris_hakki-=1;
            }
            else if(!kullanici.equals(sys_kullanici_adi)&&parola.equals(sys_parola)){
                System.out.println("Kullanıcı adı yanlış...");
                giris_hakki-=1;
            }
             else if(!kullanici.equals(sys_kullanici_adi)&&!parola.equals(sys_parola)){
                System.out.println("Kullanıcı adı ve parola yanlış...");
                giris_hakki-=1;
            }
            
            if(giris_hakki==0){
                System.out.println("Giriş hakkınız bitti...");
                break;
            }
        }
        
        
        
        
        
        
        
        
    }
}
