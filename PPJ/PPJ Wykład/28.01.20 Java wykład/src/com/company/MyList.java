package com.company;

public class MyList {
    Node head;
    public void add(Node node){
        if(head==null)
            head =node;
        else{
            Node tmp = head;
            while (tmp.next !=null)
                tmp=tmp.next;
            tmp.next=node;
        }
    }

    public Node(getHead){

    }
}
