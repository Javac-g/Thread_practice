package V2.produce;

public class Product {
    boolean flag = false;
    int n;
    synchronized int get(){
        while(!flag){
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Get:" + n );
        flag = false;
        notify();
        return n;
    }
    synchronized void put(int n){
        while (flag){
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        this.n = n;
        flag = true;
        System.out.println("Put: " + n);
        notify();
    }
}
