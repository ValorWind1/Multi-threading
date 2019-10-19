class HOHO implements Runnable {
    public void run(){
        for (int i = 1; i<=5;i++){
            System.out.println("HI");
            try{ Thread.sleep(500);} catch ( Exception e){}
        }
    }
}

class HUHU implements Runnable {
    public void run (){
        for (int i =1;i<=5;i++){
            System.out.println("Hello");
            try { Thread.sleep(500); }catch (Exception e){}
        }
    }
}

public class UsingRunnable {
    public static void main(String[] args) {

        Runnable obj1 = new HOHO();
        Runnable obj2 = new HUHU();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        try { Thread.sleep(10);} catch (Exception e){}
        t2.start();


    }
}
