package Practice;

public class One implements Runnable {

    String name;
    Thread t;
    boolean suspendFlag;

    One(String name){
        this.name = name;

        t = new Thread(this,name);
        System.out.println("New thread: " + t);
        suspendFlag = false;
        t.start();

    }
    public void run(){

        try{

            for (int i = 15; i > 0 ; i --){

                System.out.println(name + ": " + i);

                Thread.sleep(200);

                synchronized (this){

                    while (suspendFlag){

                        wait();

                    }

                }

            }

        }catch (InterruptedException e){

            e.printStackTrace();

        }finally {

            System.out.println(name + ": stopped");
        }


    }

    synchronized void mySuspend(){
        suspendFlag = true;
    }

    synchronized  void  myResume(){
        suspendFlag = false;
        notify();
    }




}
