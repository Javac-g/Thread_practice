package Deadlock;

public class App implements Runnable {

    A a = new A();
    B b = new B();

    App(){

        Thread.currentThread().setName("Main thread");
        Thread t = new Thread(this,"Concurrent thread");
        t.start();

        a.some(b);
        System.out.println("Back to main thread");
    }

    public void run(){

        b.some(a);
        System.out.println("Back to Concurrent thread");


    }
    public static void main(String...args){

        new App();



    }




}
