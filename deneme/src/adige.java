
import java.util.Scanner;


public class adige {
    public static void main(String[] args) {
        /*Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz");
    
        if (scanner.hasNextInt()) {
            int sayi=scanner.nextInt();
                    System.out.println("Yazı:"+sayi);
        }

        else{
            System.out.println("Lütfen sayi giriniz.");
        }*/
       
        
        Scanner scanner=new Scanner(System.in);
        int yas=scanner.nextInt();
        scanner.nextLine();//Dummy(aptal)denir. Enter ı da boşluk aldığı için bunu yazarız.
        
        String isim=scanner.nextLine();
        System.out.println("Yaşı"+yas);
        System.out.println("adı:"+isim);
        
        }
    }//Not olarak: Eğer ard arda int değer girildiyse boşluk tuşuna basılarakda değerler istenebilir.
    
        
       
    
    

