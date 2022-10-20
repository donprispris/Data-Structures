
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author UsX
 */
public class Dinamic_Array <T>{
    private int len=0;
    private T[] arr;
    private int capacity=0;

    public Dinamic_Array(int capacity) {
        if (capacity<0) throw new IllegalArgumentException("naiin");
        this.capacity=capacity;
        arr=(T[]) new Object[capacity];
    }
    public int size(){
        return capacity;
    }
    public void add(T elm,int index){
        int i=0;
        while(i<=index){
            if(i==index){
                arr[i]=elm;
            }
            i++;
        }
    }
    public void remove(T elm){
        int i=0;
        while(i<arr.length-1){
            if(arr[i]==elm){
                arr[i]=null;
            }
            i++;
        }
    }
    public void print(){
        
        for (int i=0;i<capacity;i++){
            System.out.print(arr[i]+" ");
        }
    }
       
    
    public static void main(String[] args) {
        System.out.println("hola");
      
        Dinamic_Array<Integer> y= new Dinamic_Array(4);
        y.add(2, 0);
        y.add(3, 1);
        y.add(4, 2);
        y.remove(3);
        y.print();
        
    }



}
