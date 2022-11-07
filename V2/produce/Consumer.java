package V2.produce;

public class Consumer implements Runnable{
    Product product;
    Thread thread;

    public Consumer(Product product) {
        this.product = product;
        thread = new Thread(this,"Consumer");
    }
    @Override
    public void run(){
        while (true){
            product.get();
        }
    }

}
