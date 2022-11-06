package V2.deadLock;

public class Lock {

    public static void main(String...args){
        A a = new A();
        B b = new B();
        new One(a,b);
        new Two(a,b);

    }
}
