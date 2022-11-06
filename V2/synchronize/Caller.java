package V2.synchronize;

public class Caller implements Runnable {
    Thread t;
    String msg;
    Call call;
    public Caller(Call call,String msg){
        t = new Thread(this);
        this.call = call;
        this.msg = msg;
        t.start();
    }

    @Override
    public void run() {
        synchronized (call){
            call.calling(msg);
        };
    }
}
