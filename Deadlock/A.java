package Deadlock;

public class A {

    synchronized void some(B b){

        String name = Thread.currentThread().getName();
        System.out.println(name + " inside A.some()");

        try{

            Thread.sleep(1000);

        }catch (Exception e){

            e.printStackTrace();

        }
        System.out.println(name + " call B.last");
        b.last();

    }

    synchronized void last(){
        System.out.println("Inside A.Last()");
    }
}
