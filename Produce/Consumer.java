package Produce;

public class Consumer implements Runnable {

    Product product;

    Consumer(Product product){

        this.product = product;
        new Thread(this,"Consumer").start();

    }

    public void run(){

        while (true){

            product.get();

        }
    }

}
