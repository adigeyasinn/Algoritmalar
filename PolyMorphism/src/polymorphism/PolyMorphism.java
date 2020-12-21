
package polymorphism;

/**

 */
class Hayvan{
    private String isim;

    public Hayvan(String isim) {
        this.isim = isim;
        
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    public String konus(){
        return "Hayvan konuşuyor...";
    }
    
}

class Kedi extends Hayvan{

    public Kedi(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim()+"Miyavlıyor"; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
class Köpek extends Hayvan{

    public Köpek(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim()+"Havlıyor"; //To change body of generated methods, choose Tools | Templates.
    }
    
}
class At extends Hayvan{

    public At(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim()+"Kişniyor."; //To change body of generated methods, choose Tools | Templates.
    }
    
}

public class PolyMorphism {

    public static void konustur(Hayvan hayvan){
        System.out.println(hayvan.konus());
    }
   
    public static void main(String[] args) {
        // TODO code application logic here
        /*Hayvan hayvan1=new Kedi("Tekir");
        Hayvan hayvan2=new Köpek("Çakii");
        Hayvan hayvan3=new At("Bold");
        System.out.println(hayvan1.konus());
        System.out.println(hayvan2.konus());
        System.out.println(hayvan3.konus());*/
        
        konustur(new Kedi("Tekkkkiir"));
        konustur(new Köpek("Karabai"));
        konustur(new At("bolld"));
    }
    
}
