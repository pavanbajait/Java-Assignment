//public class Main {
//    public static void main(String[] args) throws InterruptedException {
//        A a1 = new A();
//        Thread t = new Thread(a1);
//        t.start();
//        t.join();//Here main thread will wait until the t thread completes
//        //if we comment t.join then we will get incorrect value.
//        int result = a1.sum;
//        for (int i = 0; i < 10; i++) {
//            System.out.println("inside main thread....");
//            System.out.println(result);
//        }
//    }
//}
//
//class A implements Runnable{
//    int sum;
//    public void run() {
//        for (int i = 0; i < 10; i++) {
//            System.out.println("inside A thread");
//            sum = sum + i;
//        }
//    }
//}



// Example of static & instance
//public class Main{
//    int num=4;
//    static int x =4;
//}
//class ex{
//    public static void main(String[] args) {
//        System.out.println(Main.x);
//        Main m =new Main();
//        System.out.println(m.num);
//    }
//}