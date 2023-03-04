package com.latrosoft.ADT;

public class LL {
   private Node head;
   private Node tail;
   int size;

   public LL(){
       size=0;
   }
   public void insertValeIntoFirst(int value){
       Node node = new Node(value);
       node.next=head;
       head = node;

       if(tail==null){
           tail= head;
       }
       size++;
   }

   public void insertValueintoLast(int value){
       if(tail==null){
           insertValeIntoFirst(value);
           return;
       }
       Node node = new Node(value);
       tail.next=node;
       tail = node;
       size++;
   }
   public void display(){
        Node temp  = head;
        while (temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("END");
   }

   private class Node{
       private int data;
       private Node next;

       public Node(int value){
           this.data=value;
       }
   }
}
