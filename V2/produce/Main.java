package V2.produce;

public class Main {
    public static void main(String...args){
        Product product = new Product();

        Consumer consumer = new Consumer(product);
        Producer producer = new Producer(product);

        producer.thread.start();
        consumer.thread.start();
    }
}
