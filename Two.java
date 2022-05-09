public class Two extends Thread{


    String name;

    Two(String name){

        super();
        this.name = name;
        System.out.println("Created: " + name);

    }
    public void run(){

        try {

            for (int i = 9; i >= 0; i--) {

                System.out.println(name + ": " + i);

                Thread.sleep(1000);
            }


        }
        catch (InterruptedException e){

            e.printStackTrace();

        }
    }





}
