package V2.deadLock;

public class One implements Runnable{
    A a ;
    B b;

    One(A a,B b){
        this.a = a;
        this.b = b;
        Thread t = new Thread(this,"Concurrent");
        t.start();
        System.out.println("Back to main thread");
    }



    public void run() {
        a.process(b);
        System.out.println("Back in concurrent thread");
    }
}
