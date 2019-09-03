package test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DataReader {

    public static void main(String[] args) {

        String Hello;
        String toyota = null;

        try {
            FileReader fileReader = new FileReader("src/test/book.txt");

            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((Hello = bufferedReader.readLine()) != null) {
                toyota= Hello ;
            }
            fileReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(toyota);



    }
}
