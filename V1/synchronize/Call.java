package V1.synchronize;

public class Call {
    public void calling(String msg){
        try{
            System.out.print("[" + msg);
            Thread.sleep(500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("]");
    }
}
