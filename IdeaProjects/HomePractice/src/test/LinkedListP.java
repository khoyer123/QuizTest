package test;

import java.util.LinkedList;

public class LinkedListP {
    public static void main(String[] args) {


        LinkedList linkedList = new LinkedList();

        linkedList.add("this");
        linkedList.add("is");
        linkedList.add("my");
        linkedList.add("book");

       // for (int i = 0; i<linkedList.size(); i= i++) {
        //   System.out.println(linkedList.get(i));

            int i = 0;
            while (i< linkedList.size()){
            System.out.println(linkedList.get(i));
            i++ ;
        }

    }

    
}