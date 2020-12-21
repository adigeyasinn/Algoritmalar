/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.ayarlar;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author feda1
 */
public class Dialogs {
    
    public static void bosOlamazMesajiGoster(JFrame frame){
        JOptionPane.showMessageDialog(frame, "Tüm alanlar dolu olmalıdır.");
    }
    
    public static void ozelMesajGoster(JFrame frame,String message){
        JOptionPane.showMessageDialog(frame, message);
    }
}
