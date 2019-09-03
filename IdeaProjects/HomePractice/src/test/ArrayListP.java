package test;

import java.util.ArrayList;

public class ArrayListP {

    public static void main(String[] args) {


        ArrayList<String> stringArrayList = new ArrayList<>();

        stringArrayList.add("this");
        stringArrayList.add("is");
        stringArrayList.add("my");
        stringArrayList.add("book");


        for (int i = 0; i < stringArrayList.size(); i++) {
            System.out.println(stringArrayList.get(i));
        }
    }
}


