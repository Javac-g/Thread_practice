public class App {






    public static void main(String...args){


        new One("One");
        new Two("Two");

        try{
            Thread.sleep(10000);

        }catch (InterruptedException e){

            e.printStackTrace();

        }








    }

}
