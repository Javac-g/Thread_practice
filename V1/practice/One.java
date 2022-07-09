package V1.practice;

public class One  implements Runnable{

    String name;
    Thread t;

    public One(String name){
        this.name = name;
        t = new Thread(this,name);
        System.out.println("Created: " + name);
        t.start();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Thread getT() {
        return t;
    }

    public void setT(Thread t) {
        this.t = t;
    }

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
