package Prob1;

public class DemoThread implements Runnable{
    @Override
    public void run()
    {
        int prd = 1;
        for(int i=1;i<=10;i++){
            prd*=i;
        }
        System.out.println("Run method executed by DemoThread");
        System.out.println(prd);
    }

    public static void main(String[] args) {
        DemoThread dt = new DemoThread();
        Thread t = new Thread(dt);
//        t.setPriority(1);
        t.start();
        System.out.println("Inside the main thread");
    }

}
