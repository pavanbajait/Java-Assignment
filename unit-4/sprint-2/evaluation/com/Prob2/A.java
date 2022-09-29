package com.Prob2;

public class A {
        public synchronized void funA(B b1){
            System.out.println("funA of A starts");
            b1.fun2();
            System.out.println("funA of A ends");
        }
        public synchronized void fun1(){
            System.out.println("inside fun1 of A");
        }
    }
class B {
    public synchronized void funB(A a1){
        System.out.println("funB of B starts");
        a1.fun1();
        System.out.println("funB of B ends");
    }
        public synchronized void fun2(){
            System.out.println("inside fun2 of B");
        }
    }

class ThreadA extends Thread{
    A a1;
    B b1;
    public ThreadA(A a1,B b1) {
        this.b1=b1;
        this.a1=a1;
    }
    @Override
    public void run() {
        a1.funA(b1);
    }
}
class ThreadB extends Thread{
    A a1;
    B b1;
    public ThreadB(A a1,B b1) {
        this.b1=b1;
        this.a1=a1;
    }
    @Override
    public void run() {
        b1.funB(a1);
    }
}

class Main1 {
    public static void main(String[] args) {
        A a1 = new A();
        B b1 = new B();
        ThreadA t1 = new ThreadA(a1, b1);
        ThreadB t2 = new ThreadB(a1, b1);
        t1.start();
        t2.start();
    }
}

/*
* How to Avoid Deadlock in Java?
Deadlocks cannot be completely resolved. But we can avoid them by following basic rules mentioned below:
1--we remove the synchronized keyword then it will not become deadlock.
2--Avoid Nested Locks: We must avoid giving locks to multiple threads, this is the main reason for a deadlock condition. It normally happens when you give locks to multiple threads.
3--Avoid Unnecessary Locks: The locks should be given to the important threads. Giving locks to the unnecessary threads that cause the deadlock condition.
4--Using Thread Join: A deadlock usually happens when one thread is waiting for the other to finish. In this case, we can use join with a maximum time that a thread will take.
* */