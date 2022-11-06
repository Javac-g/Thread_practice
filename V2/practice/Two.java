package V2.practice;

public class Two extends Thread{
    String name;
    public Two(String name){
        super();
        this.name = name;
        System.out.println("Created: " + name);
        start();
    }
    @Override
    public void run(){
        try {
            for (int i = 0; i < 7; i ++){
                System.out.println(name + " : " + i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            System.out.println(name + " : Finished");
        }
    }
}
