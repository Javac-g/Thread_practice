package Deadlock;

public class B {
    
    
    synchronized void some(A a){
        String name = Thread.currentThread().getName();
        System.out.println(name + "inside B.some()");

        try{

            Thread.sleep(1000);

        }catch (Exception e){

            e.printStackTrace();

        }

        System.out.println(name + " Call A.last");
        a.last();

    }
    synchronized void last(){

        System.out.println("Inside A.last()");
    }
    
    
}
