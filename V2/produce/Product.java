package V2.produce;

public class Product {
    int n;
    synchronized int get(){
        System.out.println("Get:" + n );
        return n;
    }
    synchronized void put(int n){
        this.n = n;
        System.out.println("Put: " + n);
    }
}
