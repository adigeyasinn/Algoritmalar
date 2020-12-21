
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author feda1
 */
public class ExpTree {
    public Node root;
    public ExpTree(){
        this.root=null;
    }
    
    public void createExpTree(String s){
        Stack<Node> stk=new Stack<>();
        s=s+"#";
        int i=0;
        char symbol=s.charAt(i);
        Node newNode;
        while(symbol!='#'){
            if((symbol>='0'&& symbol<='9')||(symbol>='a'&& symbol<='z')){
                newNode=new Node(symbol);  //BURASI ÖNEMLİ
                stk.push(newNode);          
               
            }
            else if((symbol>='+'&& symbol<='-')||(symbol>='*'&& symbol<='/')){
                newNode=new Node(symbol);
                Node n1=stk.pop();
                Node n2=stk.pop();      //BİRDAHA ÇALIŞŞ 
                newNode.leftChild=n2;
                newNode.rightChild=n1;
                stk.push(newNode);
            }
            symbol=s.charAt(++i);
        }
        this.root=stk.pop();
    }
    public void preOrderTraverse(Node localRoot){
        if(localRoot!=null){
            localRoot.displayNode();
            preOrderTraverse(localRoot.leftChild);
            preOrderTraverse(localRoot.rightChild);
        }
    }
    
    public void LevelOrderTraverse(){
        Queue<Node> que=new LinkedList<>();
        que.add(this.root);
        Node temp = null;
        while(!que.isEmpty()){
           // temp.que.poll();//BU HATA VERİYOR BUNU SOR
            temp.displayNode();
            if(temp.leftChild!=null){
                que.add(temp.leftChild);
            }
            if(temp.rightChild!=null){
                que.add(temp.rightChild);
            }
        }
    
   }
    public static void main(String[] args) {
        String exp="23*84/+";
        ExpTree t=new ExpTree();
        t.createExpTree(exp);
        t.root.displayNode();
        System.out.println("");
        t.root.leftChild.displayNode();
        System.out.println("");
        t.root.rightChild.displayNode();
        System.out.println("-------------");
        t.preOrderTraverse(t.root);
    }
}
 
