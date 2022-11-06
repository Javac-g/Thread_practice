package V2.deadLock;

public class B {
    synchronized void process(A a){
        String name = Thread.currentThread().getName();
        System.out.println(name + " entered process in class B");
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Calling method last in class A");
        a.last();
    }
    synchronized void last(){
        System.out.println( "method last in class B");
    }
}
