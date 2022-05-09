package Synchronized;

public class App {

    public static void main(String...args){


        Call ob = new Call();

        Caller A = new Caller(ob,"Welcome");
        Caller B = new Caller(ob,"to synchronized");
        Caller C = new Caller(ob,"world");







    }
}
