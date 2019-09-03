package test;

public class FizzBuzz {
    public static void main(String[] args) {

        //write a java program that print the number from 1 to 50.but for multiples of 3 print "Fizz" instead of number.


        for (int i = 1; i <= 50; i++) {

            if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }

    }
}

