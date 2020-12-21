
package yıgın.uygulaması.dizi;

import java.util.Stack;


public class YıgınUygulamasıDizi 
{

   
    public static void main(String[] args) 
    {
       /* Stack yıgın=new Stack();
        String kelime="2*(3+i)-(4-5/(2+8))";
        char [] dizi=kelime.toCharArray();
        int sayac=0;
        for(int i=0;i<dizi.length;i++)
        {
            if (dizi[i]=='(') 
            {
                sayac++;
            }
            if (dizi[i]==')') 
            {
                sayac--;
            }
        }
        if (sayac==0) 
        {
            System.out.println("İfade geçerlidir...");
        }
        else
        {
            System.out.println("İfade geçersizdir!!!");
        }*/
        Stack yıgın=new Stack();
        String kelime="[A+{25*{Y*(B+C-X)-K}}/D*(E+13)+M]";
        char [] dizi=kelime.toCharArray();
        boolean sayac=true;
        char chOkunan, chCekilen;
        for(int i=0;i<dizi.length;i++)
        {
            chOkunan=dizi[i];
            if ((chOkunan=='[') || (chOkunan=='{') || (chOkunan=='(')) 
            {
                yıgın.push(i);
            
            }
            if ((chOkunan==']') || (chOkunan=='}') || (chOkunan==')')) 
            {
                if (yıgın.empty()) 
                {
                    sayac=false;break;
                }
                chCekilen=(char)yıgın.pop();
                if ((chCekilen=='[')&&(chCekilen!=']')) 
                {
                    sayac=false;break;
                }
                 
                if ((chCekilen=='{')&&(chCekilen!='}')) 
                {
                    sayac=false;break;
                }
                 
                if ((chCekilen=='(')&&(chCekilen!=')')) 
                {
                    sayac=false;break;
                }
                
                
            }
        }
           if (sayac==true) 
           {
                System.out.println("İfade geçerlidir...");
           }
           else
           {
                System.out.println("İfade geçersizdir");
           }
 
            
    }
    
}
