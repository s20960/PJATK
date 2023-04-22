package com.company;



public class Main {

    MyList list;

    public Main(){
        list=new MyList();

        list.add(
                new Circle(100,100,25)
        )

        Node tmp=list.getHead();
        while(tmp !=null){
            tmp.fig.paint();
            tmp=tmp.next();
        }
    }

    public static void main(String[] args) {
	    new Main();



    }
}
