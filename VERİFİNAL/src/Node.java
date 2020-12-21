/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author feda1
 */
public class Node {
    //POSTFİX İFADEYİ İKİLİ AĞACA DÖNDÜREN FONKSİYON
    
    public char data;
    public Node leftChild;
    public Node rightChild;
    
    public Node(char x){
        this.data=x;
        this.leftChild=null;
        this.rightChild=null;
    }
    
    public void displayNode(){
        System.out.println(this.data);
    }
    
    
}
