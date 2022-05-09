public class App {
    public static void main(String...args){

        One one = new One("One");

        Two two = new Two("Two");

        System.out.println(one.getName() + ": is alive: " + one.t.isAlive());

        System.out.println(two.getName() + ": is alive: " + two.isAlive());

        try {

            one.t.join();

            two.join();

        }catch (InterruptedException e){

            e.printStackTrace();

        }finally {

            System.out.println(one.getName() + ": is alive: " + one.t.isAlive());

            System.out.println(two.getName() + ": is alive: " + two.isAlive());

        }


    }

}
