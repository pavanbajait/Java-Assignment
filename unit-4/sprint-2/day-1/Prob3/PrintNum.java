package Prob3;

public class PrintNum implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("inside run " + i);
            if(i==5) {
                try {
                    Thread.sleep(5000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("end of run()...");
    }
    public static void main(String[] args) {
        PrintNum pn = new PrintNum();
        Thread t1 = new Thread(pn);
//        t1.setPriority(10);
        t1.start();
        System.out.println("end of main()...");

        }
}
