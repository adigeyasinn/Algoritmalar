
package postfix;

import java.util.Stack;


public class Postfix {
    
    public static int oncelik(char c){
        switch(c){
            case'+':
            case'-':
                return 1;
            case'*':
            case'/':
                return 2;
            case'^':
                return 3;
                
        }
        System.out.println("Geçerli karakter girmediniz.");
        return 0;
        
    }
    
    public static String infixTopostfix(String exp){
        String sonuc=" ";
        Stack<Character> y=new Stack<>();
        for(int i=0;i<exp.length();i++){
            char c=exp.charAt(i);
            if(oncelik(c)>0){
                while((y.empty()==false)&&(oncelik(y.peek())>oncelik(c))){
                    sonuc=sonuc+y.pop();}
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

   
    public static void main(String[] args) {
        String ifade="a+b*c-d";
        String pfix_ifade=infixTopostfix(ifade);
        System.out.println(pfix_ifade);
        
    }
    
}
