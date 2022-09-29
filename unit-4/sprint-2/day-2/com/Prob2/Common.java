package com.Prob2;

public class Common {

    public void fun1(String name) {
        synchronized (Common.class) {
            System.out.print("Welcome ");
            try {
                Thread.sleep(1000);
            } catch (Exception ee) {
                ee.printStackTrace();
            }
            System.out.println(name);
        }
    }

}

class ThreadA extends Thread{
    Common c;
    String name;
    public ThreadA(Common c,String name) {
        this.c=c;
        this.name=name;
    }
    @Override
    public void run() {
        c.fun1(name);
    }
}
class ThreadB extends Thread{
    Common c;
    String name;
    public ThreadB(Common c,String name) {
        this.c=c;
        this.name=name;
    }
    @Override
    public void run() {
        c.fun1(name);
    }
}
class Main{
    public static void main(String[] args){
        Common c=new Common();
        ThreadA t1=new ThreadA(c,"Ram");
        Common com=new Common();
        ThreadB t2=new ThreadB(com,"Shyam");
        t1.start();
        t2.start();
    }
}
