class Hi extends Thread {
    public void run(){
        for (int i = 1; i<=5;i++){
            System.out.println("HI");
            try{ Thread.sleep(500);} catch ( Exception e){}
        }
    }
}

class Hello extends Thread {
    public void run (){
        for (int i =1;i<=5;i++){
            System.out.println("runnable.Hello");
            try { Thread.sleep(500); }catch (Exception e){}
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {

        Hi obj1 = new Hi();
        Hello obj2 = new Hello();

        obj1.start();
        obj2.start();


    }
}