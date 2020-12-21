
import java.util.Scanner;


public class ATM {
    public void calis(ATMProgram hesap){
    login login=new login();
    Scanner scanner=new Scanner(System.in);
        System.out.println("Bankamıza Hoşgeldiniz");
        System.out.println("**********************");
        System.out.println("Kullanıcı Girişi");
        System.out.println("***********************");
        
        
    int giris_hakki=3;
        while (true) {            
            if(login.login(hesap)){
                System.out.println("Giriş başarılı...");
                break;
            }
            else{
                System.out.println("Giriş başarısız");
                giris_hakki-=1;
                System.out.print("Kalan Giriş hakkı:"+giris_hakki);
                
            }
            if(giris_hakki==0){
                System.out.println("Giriş hakkınız bitti...");
                return;
            }
        }
        System.out.println("********************");
        String islemler = "1. Bakiye Görüntüle\n"
                          + "2. Para Yatırma\n"
                          + "3. Para Çekme\n"
                          + "Çıkış için q'ya basın";
        System.out.println(islemler);
        System.out.println("**********************************");
        
        
        while (true) {
            System.out.println("İşlemi Seçiniz : ");
            String islem = scanner.nextLine();
            
            if (islem.equals("q")){
                
                break;
                
            }
            else if (islem.equals("1")){
                System.out.println("Bakiyeniz : " + hesap.getBakiye());
            }
            else if (islem.equals("2")){
                
                System.out.print("Yatırmak istediğiniz tutar : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraYatir(tutar);
                
            }
            else if (islem.equals("3")) {
                
                System.out.print("Çekmek istediğiniz tutar : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraCek(tutar);
                
            }
            else {
                
                System.out.println("Geçersiz İşlem....");
            }
        }
    }
}
