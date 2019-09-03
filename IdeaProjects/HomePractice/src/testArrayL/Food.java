package testArrayL;

import java.util.ArrayList;

public class Food {
    public static void main(String[] args) {


        ArrayList<String> myFood = new ArrayList<>();

        myFood.add("Biriani");
        myFood.add("Chicken Tikka");
        myFood.add("Beef Kabab");
        myFood.add("Chicken Rezala");
        myFood.add("Burger");

        System.out.println( "my food is : " +myFood);
        System.out.println("**************************************");

       // System.out.println(myFood.);




        myFood.remove("Beef Kabab");
        System.out.println(myFood);


        for (String i : myFood);
        System.out.println(myFood);

        System.out.println("**************************");

        int i = 0;
        while (i < myFood.size()) {
            i++;

            System.out.println(myFood);


        }



    }

}
