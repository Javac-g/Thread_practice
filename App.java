public class App {

    public static void main(String...args){

        One A = new One("One");

        One C = new One("Three");

        Two B = new Two("Two");

        System.out.println(A.getName() + ": is alive: " + A.t.isAlive());

        System.out.println(B.getName() + ": is alive: " + B.isAlive());

        System.out.println(C.getName() + ": is alive: " + C.t.isAlive());


        try {

            A.t.join();

            B.join();

            C.t.join();

        }catch (InterruptedException e){

            e.printStackTrace();

        }finally {

            System.out.println(A.getName() + ": is alive: " + A.t.isAlive());

            System.out.println(B.getName() + ": is alive: " + B.isAlive());

            System.out.println(C.getName() + ": is alive: " + C.t.isAlive());

        }


    }

}
