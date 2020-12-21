/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InfixPostfix;

/**
 *
 * @author feda1
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Stack;

/**
 *
 * @author fdfdf
 */
public class Main {
     
    public static int oncelik(char c){
        switch(c){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
    public static String infix2postfix(String exp){
        String sonuc="";
        Stack <Character> y=new Stack<>();
        for(int i=0;i<exp.length();i++){
            char c=exp.charAt(i);
            System.out.println("-->"+c);
            //okunan operatör ise
            if(oncelik(c)>0){
                while((y.empty()==false)&&(oncelik(y.peek())>=oncelik(c))){
                    sonuc=sonuc+y.pop();
                }
                y.push(c);
                
            }
            else{
               sonuc=sonuc+c; 
            }
        }
        for(int i=0;i<y.size();i++){
            sonuc=sonuc+y.pop();
        }
        return sonuc;
    
        
    }
    
    
    public static int postfix_hesapla(String post_ifade){
       try{
        String pfix=post_ifade;
        String [] pfix_dizi=pfix.split(" ");
        String e;
        Stack <String> y=new Stack<>();
        int s1=0,s2=0,s3=0;
        
        for(int i=0;i<pfix_dizi.length;i++){
            e=pfix_dizi[i];
            e.trim();
            if(e.isEmpty()) {continue;}
            System.out.println("-->"+e+"<--");
            if(e.equals("+")){
                s2=Integer.parseInt(y.pop());
                s1=Integer.parseInt(y.pop());
                s3=s1+s2;
                y.push(String.valueOf(s3));
            }
            else if(e.equals("-")){
                s2=Integer.parseInt(y.pop());
                s1=Integer.parseInt(y.pop());
                s3=s1-s2;
                y.push(String.valueOf(s3));
            }
            else if(e.equals("*")){
                s2=Integer.parseInt(y.pop());
                s1=Integer.parseInt(y.pop());
                s3=s1*s2;
                y.push(String.valueOf(s3));
            }
            else if(e.equals("/")){
                s2=Integer.parseInt(y.pop());
                s1=Integer.parseInt(y.pop());
                s3=s1/s2;
                y.push(String.valueOf(s3));
            }
            else{
                y.push(e);
            }  
        }
        int sonuc=Integer.parseInt(y.pop());
        if(!y.isEmpty()){
            System.out.println("Hatalý giriþ");
            return 0;
        }
        return sonuc;
       }
       catch(Exception x){
          System.out.println("Hata oluþtu");
          return 0;
       }
        
    }
    
    public static void main(String[] args) {
       String ifade="a+b*c-d";
       String pfix_ifade=infix2postfix(ifade);
       System.out.println(pfix_ifade);
       
       String exp="6   6     8    * +  10    -";
       int sonuc=postfix_hesapla(exp);
       System.out.println("Sonuc="+sonuc);
       
       
    }
    
}
