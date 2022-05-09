package Produce;

public class Producer implements Runnable {

    Product product;

    Producer(Product product){

        this.product = product;
        new Thread(this,"Producer").start();

    }
    public void run(){

        int i = 0;

        while (i++ < 10){

            product.put(i);

        }
    }

}
