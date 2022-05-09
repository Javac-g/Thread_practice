package Produce;

public class App {
    public static void main(String...args){

        Product product = new Product();

        new Producer(product);
        new Consumer(product);




    }
}
