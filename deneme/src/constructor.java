
public class constructor {
    private String hesapNo;
    private double bakiye;
    private String isim;
    private String email;
    private String telefonNo;
    
    public constructor(String isim,String email,String telefonNo){
        this("bilgi yok", 0.0, isim, email, telefonNo);
    }
    public constructor(String hesapNo,double bakiye,String isim,String email,String telefonNo){
        this.hesapNo=hesapNo;
        this.bakiye=bakiye;
        this.isim=isim;
        this.email=email;
        this.telefonNo=telefonNo;
    }
    
    public void paraYatir(double miktar){
        setBakiye(getBakiye() + miktar);
        System.out.println("Yeni bakiye="+getBakiye());
    }
    public void bilgileriGoster(){
        System.out.println("Hesap No="+this.hesapNo);
        System.out.println("Bakiye=="+this.bakiye);
        System.out.println("isim="+this.isim);
        System.out.println("Email="+this.email);
        System.out.println("Telefon Numarası="+this.telefonNo);
    }
    
    public void paraCek(double miktar){
        if(miktar>1500){
            System.out.println("Bir günde 1500 tl den fazla para çekemezsiniz...");
        }
        if(getBakiye()-miktar<0){
            System.out.println("Hesabınızda yeteri kadar para yok.");
        }
        else{
            setBakiye(getBakiye() - miktar);
            System.out.println("Yeni bakiye="+getBakiye());
        }
    }

    /**
     * @return the hesapNo
     */
    public String getHesapNo() {
        return hesapNo;
    }

    /**
     * @param hesapNo the hesapNo to set
     */
    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    /**
     * @return the bakiye
     */
    public double getBakiye() {
        return bakiye;
    }

    /**
     * @param bakiye the bakiye to set
     */
    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefonNo
     */
    public String getTelefonNo() {
        return telefonNo;
    }

    /**
     * @param telefonNo the telefonNo to set
     */
    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }
    
    public static void main(String[] args) {
        constructor account1=new constructor("19031903",1000,"muhammet yasin","adige@hotmail.com","5454566440");
        account1.paraYatir(500);
        account1.getIsim();
        //constructor objeler oluşturulurken ilk çağrılan fonksiyonlardır
        constructor account=new constructor("muhammet yasin","example@gmail","545236971");
        System.out.println(account.getBakiye());
        account.bilgileriGoster();
    }
    
}
