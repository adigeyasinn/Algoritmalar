
import java.util.Scanner;


public class Idman {
    private int burpee_sayisi;
    private int pushup_sayisi;
    private int situp_sayisi;
    private int squat_sayisi;

    public Idman(int burpee_sayisi, int pushup_sayisi, int situp_sayisi, int squat_sayisi) {
        this.burpee_sayisi = burpee_sayisi;
        this.pushup_sayisi = pushup_sayisi;
        this.situp_sayisi = situp_sayisi;
        this.squat_sayisi = squat_sayisi;
    }

    public int getBurpee_sayisi() {
        return burpee_sayisi;
    }

    public void setBurpee_sayisi(int burpee_sayisi) {
        this.burpee_sayisi = burpee_sayisi;
    }

    public int getPushup_sayisi() {
        return pushup_sayisi;
    }

    public void setPushup_sayisi(int pushup_sayisi) {
        this.pushup_sayisi = pushup_sayisi;
    }

    public int getSitup_sayisi() {
        return situp_sayisi;
    }

    public void setSitup_sayisi(int situp_sayisi) {
        this.situp_sayisi = situp_sayisi;
    }

    public int getSquat_sayisi() {
        return squat_sayisi;
    }

    public void setSquat_sayisi(int squat_sayisi) {
        this.squat_sayisi = squat_sayisi;
    }
    public void hareketYap(String hareketTürü,int sayi){
        if(hareketTürü.equals("Burpee")){
            burpeeYap(sayi);
            
        }
        else if(hareketTürü.equals("Pushup")){
            pushupYap(sayi);
        }
        else if(hareketTürü.equals("Situp")){
            situpYap(sayi);
        }
        else if(hareketTürü.equals("Squat")){
            squatYap(sayi);
        }
        else{
            System.out.println("Geçersiz hareket...");
        }
    }
    public void burpeeYap(int sayi){
        if(burpee_sayisi==0){
            System.out.println("Yapacak burpee kalmadı");
            
        }
        if(burpee_sayisi-sayi<0){
            System.out.println("Hedeflediğin burpee geçtin ,tebrikler");
            burpee_sayisi=0;
            System.out.println("Burpee sayisi="+burpee_sayisi);
        }
        else{
            burpee_sayisi-=sayi;
            System.out.println("Kalan burpee sayisi="+burpee_sayisi);
        }
        
    }
    public void pushupYap(int sayi){
        if(pushup_sayisi==0){
            System.out.println("Yapacak pushup kalmadı");
            
        }
        if(pushup_sayisi-sayi<0){
            System.out.println("Hedeflediğin pushup geçtin ,tebrikler");
            pushup_sayisi=0;
            System.out.println("Pushup sayisi="+pushup_sayisi);
        }
        else{
            pushup_sayisi-=sayi;
            System.out.println("Kalan pushup sayisi="+pushup_sayisi);
        }
        
    }
    public void situpYap(int sayi){
        if(situp_sayisi==0){
            System.out.println("Yapacak situp kalmadı");
            
        }
        if(situp_sayisi-sayi<0){
            System.out.println("Hedeflediğin situp geçtin ,tebrikler");
            situp_sayisi=0;
            System.out.println("Situp sayisi="+situp_sayisi);
        }
        else{
            situp_sayisi=sayi;
            System.out.println("Kalan situp sayisi="+situp_sayisi);
        }
        
    }
    public void squatYap(int sayi){
        if(squat_sayisi==0){
            System.out.println("Yapacak squat kalmadı");
            
        }
        if(squat_sayisi-sayi<0){
            System.out.println("Hedeflediğin burpee geçtin ,tebrikler");
            squat_sayisi=0;
            System.out.println("Squat sayisi="+squat_sayisi);
        }
        else{
            squat_sayisi-=sayi;
            System.out.println("Kalan squat sayisi="+squat_sayisi);
        }
        
    }
    public boolean idmanBittiMi(){
        return (burpee_sayisi==0)&&(pushup_sayisi==0)&&(situp_sayisi==0)&&(squat_sayisi==0);
    }
    public static void main(String[] args) {
        //idman oluşturma programı
        Scanner scanner=new Scanner(System.in);
        System.out.println("İdman programına hoşgeldiniz...");
        String idmanlar="-Geçeli hareketler\n"
                + "Burpee \n"
                + "Pushup(Şınav)\n"
                + "Situp(Mekik)\n"
                + "Squat\n";
        
        System.out.println(idmanlar);
        System.out.println("Bir idman oluşturun.");
        
        System.out.print("Burpee sayisi=");
        int burpee=scanner.nextInt();
        System.out.print("Pushup sayisi=");
        int pushup=scanner.nextInt();
        System.out.print("Situp sayisi=");
        int situp=scanner.nextInt();
        System.out.print("Squat sayisi=");
        int squat=scanner.nextInt();
        scanner.nextLine();
        
        Idman ıdman=new Idman(burpee, pushup, situp, squat);
        
        System.out.println("İdmanınınız başlıyor.");
        while (ıdman.idmanBittiMi()==false) {            
            System.out.print("Hareket türü(Burpee,Pushup,Situp,Squat");
            String tur=scanner.nextLine();
            System.out.print("Bu harekettene kaç tane yapacaksınız?");
            int sayi=scanner.nextInt();
            scanner.nextLine();
            ıdman.hareketYap(tur, sayi);
            
        }
    }
}
