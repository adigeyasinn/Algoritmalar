/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.ayarlar;

import java.awt.Color;
import javax.swing.JButton;

public class ButtonAyarlari {
    
    private static Color originalBgColor,originalFgColor;
    
    public static void setBgFg(JButton button,Color bgColor,Color fgColor){
        
        originalBgColor=button.getBackground(); //Butonun rengini değiştirir
        originalFgColor=button.getForeground(); //Yazının rengini değiştirir
        button.setBackground(bgColor);
        button.setForeground(fgColor);
        
        
        
    }
    
    public static void setOriginalBg(JButton button){
        button.setBackground(originalBgColor);
        button.setForeground(originalBgColor);
    }
    
}
