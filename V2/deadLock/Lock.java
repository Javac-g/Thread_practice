package V2.deadLock;

public class Lock implements Runnable{
    A a = new A();
    B b = new B();

    Lock(){
            Thread.currentThread().setName("Lock");
            Thread t = new Thread(this,"One");
            t.start();
            a.process(b);
    }



    public void run() {
        b.process(a);
        System.out.println("Back in other thread");
    }
    public static void main(String...args){
        new Lock();

    }
}
