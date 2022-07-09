package V1.practice;

public class Two extends Thread{
    String name;
    Thread t;

    public Two(String name){
        super();
        this.name = name;
        System.out.println("Created: " + this);
        start();
    }
    @Override
    public void run(){
        try{
            for (int i = 5; i >=0; i--){
                System.out.println(name + ": " + i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            System.out.println(name + ": finished");
        }
    }
}
