public class One implements Runnable{

    Thread t;
    String name;

    One(String name){

        t = new Thread(this, name);

        System.out.println(this + " : Created: " + name);

        t.start();

    }

    public void run(){

        try {

            for(int i = 5; i >= 0 ; i--){

                System.out.println(name + ": " + i);

                Thread.sleep(1000);

            }

        }catch (InterruptedException e){

            e.printStackTrace();

        }



    }







}
