package V2.synchronize;

public class Main {
    public static void main(String...args){

    Call call = new Call();

    Caller A = new Caller(call,"Welcome");
    A.t.setPriority(3);
    Caller B = new Caller(call,"To synchronized");
    B.t.setPriority(2);
    Caller C = new Caller(call,"World");
    C.t.setPriority(1);

    }
}
