package V2.practice;

public class One implements Runnable{
    Thread t;
    String name;
    public One(String name){
        this.name = name;
        t = new Thread(this,name);
        System.out.println("Careated: " + name);
        t.start();
    }
    @Override
    public void run(){
        try {
            for (int i = 0; i < 7; i++) {
                System.out.println(name + " : " + i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
