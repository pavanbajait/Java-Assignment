package com.Prob3;

import com.Prob1.RaceCondition;

public class EvenOdd {
    public void printEven(){
        System.out.print("\n"+"Even Numbers from 1 to 20 : ");
        for(int i=1;i<=20;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }

    public void printOdd(){
        System.out.print("\n"+"Odd Numbers from 1 to 20 : ");
        for(int i=1;i<=20;i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
    }
}
class ThreadB extends Thread{
    EvenOdd eo;

    public ThreadB(EvenOdd eo){
        this.eo=eo;
    }
    @Override
    public void run() {
        eo.printOdd();
    }
}

class ThreadA extends Thread{
    EvenOdd eo;

    public ThreadA(EvenOdd eo){
        this.eo=eo;
    }
    @Override
    public void run() {
        eo.printEven();
    }
}
class Main{
    public static void main(String[] args) {
        EvenOdd eo = new EvenOdd();
        ThreadA t1=new ThreadA(eo);
        ThreadB t2=new ThreadB(eo);
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();

    }
}