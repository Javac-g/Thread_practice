package V2.deadLock;

public class Two implements Runnable{
    A a ;
    B b;

    Two(A a,B b){
        this.a = a;
        this.b = b;
        Thread t = new Thread(this,"Two");
        t.start();

        System.out.println("Back to main thread");
    }



    public void run() {
        b.process(a);
        System.out.println("Back in concurrent thread");
    }
}
