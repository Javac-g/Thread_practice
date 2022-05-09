package Synchronized;

public class Caller implements Runnable {

    Call ob;
    String msg;
    Thread thread;


    Caller(Call ob,String msg){

        this.ob = ob;

        this.msg = msg;
        thread = new Thread(this);
        thread.start();

    }
    public void run(){

       synchronized  (ob){
           ob.calling(msg);
       }

    }

}
