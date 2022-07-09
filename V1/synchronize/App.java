package V1.synchronize;

public class App {
    public static void main(String...args){
        Call call = new Call();

        Caller one = new Caller(call,"Welcome");
        Caller two = new Caller(call,"to synchronized");
        Caller three = new Caller(call,"world");

    }
}
