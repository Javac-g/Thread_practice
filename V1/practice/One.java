package V1.practice;

public class One  implements Runnable{

    String name;
    Thread t;

    public One(String name){
        this.name = name;
        t = new Thread(this,name);
        System.out.println("Created: " + this);
        t.start();
    }
    public void run(){
        try{
            for (int i = 5; i <=0; i--){
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
