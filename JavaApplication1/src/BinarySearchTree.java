/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author feda1
 */
public class BinarySearchTree {
 public class Node {
    int key;
    Node left,right;
    
    public Node(int deger){
        key=deger;
        left=right=null;
    }
    
    
    
}
     Node root;

    public BinarySearchTree() {
        root=null;
    }
    
    public void silKey(int key){
        root=deleteRoot(root,key);
        
    }
    
    Node deleteRoot(Node root,int key){//düğümü siler ve yeni rootu döndürür.
        if(root==null){
            return root;
        }
        if(key<root.key){ //Eğere silinmezi istenen düğüm roottan küçükse sol alt ağaca bakılır
            root.left=deleteRoot(root.left, key);
        }
        
        else if(key>root.key){ //Eğere silinmesi istenen düğüm roottan büyükse sağ alt ağaca bakılır.
            root.right=deleteRoot(root.right, key);
        }
        else{//Eğer root düğümü silinmek isteniyorsa
            //Eğere düğümün hiç çocuğu yoksa yada bir çocuğu var ise
            if(root.left==null)
                return root.right;
            else if(root.right==null)
                return root.left;
            
            root.key=minValue(root.right);//İki çocuğu olan düğümün sağ alt çocuğundaki en küçük eleman bulunur ve root olarak atanır.
            
            root.right=deleteRoot(root.right, root.key);//silme işlemi gerçekleştirilir.
        }
        return root;
    }
    
    int minValue(Node root){
        int minV=root.key;
        while(root.left!=null){
            minV=root.left.key;
            root=root.left;
        }
        return minV;
    }
    
    void insert(int key){
        root=insertRoot(root,key);
    }
    
    Node insertRoot(Node root,int key){//Verilen düğümü ve sayıyı ikili arama ağacına ekleyen fonksiyon
        if(root==null){//Ağaç boşsa direk ekleme yapar
            root=new Node(key);
            return root;
        }
        //Eğer key değeri düğümün key değerinden küçükse sol alt ağacı değilse sağ alt ağacı tarar.
        if(key<root.key){
            root.left=insertRoot(root.left, key);
            
        }
        else if(key>root.key){
            root.right=insertRoot(root.right, key);
        }
        return root;
    }
    
    void inorder(){
        inorderRoot(root);
    }
    
    void inorderRoot(Node root){
        if(root!=null){
            inorderRoot(root.left);
            System.out.println(root.key+" ");
            inorderRoot(root.right);
        }
    }
    
    public static void main(String[] args) {
        BinarySearchTree tree=new BinarySearchTree();
        
        tree.insert(50);
        tree.insert(30);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        
        System.out.println("İnorder traversal at the given tree");
        tree.inorder();
        tree.silKey(30);
        tree.inorder();
    }
    
    
}
