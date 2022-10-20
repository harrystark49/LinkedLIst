package com.example.linkedlist;

import android.util.Log;

public class LinkedList<T> {
    Node head;
    class Node<T>{
        T data;
        Node next;
        Node(T data){
            this.data=data;
            next=null;
        }
    }

    void insert(T data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }else{
            Node temp=head;
            while(temp.next != null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }

    void delete() {
        Node temp = head;
        if (temp != null) {
            while (temp.next != null) {
                if(temp.next.next==null) {
                    break;
                }
                temp=temp.next;
            }
                temp.next = null;
        }
    }

    void print() {
        Node temp = head;
        if (temp != null) {
            while (temp.next != null) {
                Log.d("print_linkedList", String.valueOf(temp.data));
                temp = temp.next;
            }
            Log.d("print_linkedList", String.valueOf(temp.data));

        }
    }

    void getAt(int i){
        Node temp=head;
        while(temp!=null && i!=0){
            temp=temp.next;
            i--;
        }
        if(i==0 && temp!=null) {
            Log.d("print_linkedList", String.valueOf(temp.data));
        }
    }
}
