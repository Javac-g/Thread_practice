package V2.deadLock;

public class A {

    public void process(B b){

        String name = Thread.currentThread().getName();

        System.out.println(name + " entered process in class A");

        try{
            Thread.sleep(1000);

        }catch(Exception e) {
            e.printStackTrace();
        }

        System.out.println("Calling method last in class B");
        b.last();

    }
    synchronized void last(){
        System.out.println("method last in class A");
    }
}
