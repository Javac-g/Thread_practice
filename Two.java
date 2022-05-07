public class Two extends Thread{

    Thread t;
    String name;

    Two(String name){

        super();
        this.name = name;
        System.out.println(this + "Created: " + name);
        start();

    }

    public void run(){

        try{
            for (int i = 5; i>= 0 ; i--){
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }


}
