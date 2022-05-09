package Practice;

public class App {

    public static void main(String...args){

        One A = new One("One");
        One B = new One("Two");


        try{
            Thread.sleep(1000);
            A.mySuspend();
            System.out.println("One suspended");
            Thread.sleep(1000);
            A.myResume();
            System.out.println("One activated");
            B.mySuspend();
            System.out.println("Two suspended");
            Thread.sleep(1000);
            B.myResume();
            System.out.println("Two activated");

        } catch (InterruptedException e) {

            throw new RuntimeException(e);

        }

        try{
            System.out.println("Wait for threads stop");
            A.t.join();
            B.t.join();
        }catch (InterruptedException e){
            e.printStackTrace();


        }finally {
            System.out.println("Main thread off");
        }


    }
}
