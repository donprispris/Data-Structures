
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author UsX
 */
public class linked_list <T> implements Iterable <T> {
    
    private int size=0;
    private Node<T> head=null;
    private Node<T> tail=null;

    @Override
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private static class Node <T>{
        private T data;
        private Node<T> next;
        public Node(T data, Node<T> next){
            this.data=data;
            this.next=next;
        }
    }

    public linked_list(T data) {
        Node<T> Nd= new Node(data,tail);
        this.head=Nd;
        this.size=1;
    }
    public void add(T data){
        Node Nd= new Node(data,head);
    }
    public void print(){
        while(){
        }
    }
    
    
     public static void main(String[] args) {
        linked_list <Integer>A= new linked_list(1);
        A.add(2);
    }
     
}
