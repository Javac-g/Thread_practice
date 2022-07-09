package V1.synchronize;

public class Caller implements Runnable{
    String msg;
    Thread t;
    Call ob;

    public Caller(Call ob,String msg){
        this.msg = msg;
        this.ob = ob;
        t = new Thread(this);
        t.start();
    }
    public void run(){
        synchronized (ob){ob.calling(msg);};
    }
}
