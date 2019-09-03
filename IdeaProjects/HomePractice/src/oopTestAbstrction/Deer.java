package oopTestAbstrction;

public class Deer extends Animal implements Jungle {


    @Override
    public void Name() {
        System.out.println("The jungle nmae is Amazon");
    }

    @Override
    public void Area() {
        System.out.println("total Area is ..........square miles");

    }

    @Override
    public void Species() {
        System.out.println("Alot of species");

    }
}
