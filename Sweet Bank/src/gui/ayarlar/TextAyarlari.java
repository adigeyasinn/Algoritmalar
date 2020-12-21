/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.ayarlar;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author feda1
 */
public class TextAyarlari {

    private static String originalText;
    private static Color originalFgColor;

    public static void checkTheTextFocusGained(JTextField textField, String org) {
        originalText = org;

        if (textField.getText().trim().equals(org)) {// Tıklayınca tc no yu sil
            originalFgColor = textField.getForeground();
            textField.setText("");
        }

        textField.setForeground(Color.BLUE);
    }

    public static void checkTheTextFocusLost(JTextField textField) {
        if (textField.getText().trim().equals("")) {
            textField.setText(originalText);
            textField.setForeground(originalFgColor);
        } else {
            textField.setForeground(Color.BLACK);
        }
    }

    public static void setOnlyNumber(JTextField textField) {
        textField.addKeyListener(new KeyAdapter() {

            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }

        });
    }

    public static void setOnlyAlphabetic(JTextField textField) {
        textField.addKeyListener(new KeyAdapter() {

            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isAlphabetic(c)&& c != KeyEvent.VK_SPACE) {
                    e.consume();
                }
            }

        });
    }

    private static int limit;

    public static void setMaxLimit(JTextField textField, int lim) {
        limit = lim;

        textField.setDocument(new PlainDocument() {

            @Override
            public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
                if (str == null) {
                    return;
                }

                if ((getLength() + str.length()) <= limit) {
                    
                    super.insertString(offs, str, a); //To change body of generated methods, choose Tools | Templates.
                }
            }

        }
        );
    }
    
    public static int checkTextKeyReleased(JTextField textField,int moneyLimit){
        String text= textField.getText();
        if(!text.equals("")){
            int miktar=Integer.valueOf(text); //texti integıra çevirip  çekilecek miktara ata
            if(miktar>moneyLimit){
                miktar=moneyLimit;
                textField.setText(String.valueOf(miktar));
            }
            return miktar;
        }
        return 0;
        
        
    }
    
    public static boolean textAlanlariDoluMu(JPanel panel){
        
        Component[] components=panel.getComponents();
        for(Component c:components){
            if(c instanceof JTextField){
                JTextField textField=(JTextField)c;
                if(textField.getText().trim().equals("")&& textField.isEnabled()){
                    return false;
                }
            }
        }
        return true;
    
}

}
