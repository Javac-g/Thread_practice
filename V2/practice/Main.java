package V2.practice;

public class Main {
    public static void main(String...args){

        One A = new One("Max");
        One B = new One("Kate");
        Two C = new Two("Anton");
        Two D = new Two("Ivan");

        System.out.println(A.name + " - is on: " + A.t.isAlive());
        System.out.println(B.name + " - is on: " + B.t.isAlive());
        System.out.println(C.name + " - is on: " + C.isAlive());
        System.out.println(D.name + " - is on: " + D.isAlive());
        try{
            A.t.join();
            B.t.join();
            C.join();
            D.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            System.out.println(A.name + " - is on: " + A.t.isAlive());
            System.out.println(B.name + " - is on: " + B.t.isAlive());
            System.out.println(C.name + " - is on: " + C.isAlive());
            System.out.println(D.name + " - is on: " + D.isAlive());
        }


    }
}
