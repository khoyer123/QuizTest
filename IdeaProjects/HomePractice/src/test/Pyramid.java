package test;

import java.util.Scanner;

public class Pyramid {

    //Implement a large pyramid of stars in the screen with java

  //  public static void main(String[] args) {

       /* Scanner scanner = new Scanner(System.in);

        //talking numberOfRows values from user
        System.out.println("How many rows you want in");
        int numberOfRows = scanner.nextInt();

        // Initializing rowCount with 1
        int rowCount = 1;
        System.out.println("Here is your pyramid");

        // Implementing the logic
        for ( int i = numberOfRows; i >0; i-- ) {

            // printing i spaces at the beginin
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

                //printing * at the end of each row
                for (int j= 1; j <= rowCount; j++){
                    System.out.println("* ");
                }
                System.out.println();
                //Increment the rowCunt
                rowCount++;
            }
        }*/

  /*  public static void main(String[] args) {


        /* int rows = 9;    // the no. of spaces

        // 9= how much lines
        for ( int i = 1; i <= rows; i++) {

            //loop to print spaces
            for (int space = 1; space <= rows-i; space++){
                System.out.println(" ");
        }

              //  v = v - 1;
                //loop to print stars
                for (int k = 1; k <= i * 2-1; k++) {
                    System.out.println("*");
                }
                //create a new line
                System.out.println();

            }*/

      /*  int row , col, n = 5;
        for (row = 1; row<=1;row++){
            for ( col=1;col<=n-row;col++) {
                System.out.println(" ");
            }
                for ( col=1;col<=2*row-1;col++) {
                    System.out.println("*");
                }
                    System.out.println("\n");

            }

        }*/

    public static void main(String[] args){
        for(int i = 0; i<15; i++){
            for(int x = 14; x>=i; x--){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
               System.out.print("* ");
            }
               System.out.println();
        }
    }




    }



