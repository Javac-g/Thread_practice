package V2.produce;

public class Producer implements Runnable{
    Product product;
    Thread thread;
    public Producer(Product product){
        this.product = product;
        thread = new Thread(this,"Producer");
    }
    @Override
    public void run(){
        int i = 0;
        while(true)product.put(i++);

    }
}
