package com.pravinyam.Collection;
import java.util.List;
import java.util.LinkedList;

public class Linkedlist{
    public static void main(String[] args) {
        List<Integer> ll = new LinkedList<Integer>();
        ll.add(10);
        ll.add(20);
        ll.add(2345);
        ll.add(23456);
        ll.add(256);
        ll.add(456);
        ll.add(3456);
        
        System.out.println("Linked List is="+ll);
        
       ll.remove(0);
       System.out.println("Linked List after removing ="+ll);
       
        System.out.println("Reversed Linked List is=" +ll.reversed());
    }
}
