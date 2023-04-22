package com.company;

public class MyList {

    Element head;

    public void add(Element e){
        if(head == null)
            head = e;
        else{
            Element tmp=head;
            while(tmp.next!=null){
                tmp=tmp.next;
            }
            tmp.next = e;
        }
    }

    public void show(){
        Element tmp=head;
        while(tmp!=null){
            System.out.println(tmp.data+" -> ");
        }
    }
}





