package V1.practice;

public class App {
    public static void main(String...args){
        One one = new One("One");
        Two two = new Two("Two");

        System.out.println(one.getName() + "is alive: " + one.getT().isAlive());
        System.out.println(two.getName() + "is alive: " + two.isAlive());

        try{

            one.getT().join();
            two.join();

        }catch (InterruptedException e){

            e.printStackTrace();

        }finally {

            System.out.println(one.getName() + " is alive: " + one.getT().isAlive());
            System.out.println(two.getName() + " is alive: " + two.isAlive());

        }
    }
}
