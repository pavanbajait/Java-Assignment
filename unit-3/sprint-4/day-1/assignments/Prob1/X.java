package assignments.Prob1;

public interface X {
    abstract void a();
    default void b(){
        System.out.println("default method of interface X");
    }
    static void c(){
        System.out.println("Static method of interface X");
    }
}

interface Y {
    abstract void d();
    default void e(){
        System.out.println("default method of interface Y");
    }
    static void f(){
        System.out.println("Static method of interface Y");
    }
}
interface Z extends X,Y {
    abstract void g();
}

class ZImpl implements Z {
    @Override
    public void a(){
        System.out.println("Inside the overriden method a of X interface");
    }
    @Override
    public void d(){
        System.out.println("Inside the overriden method d of Y interface");
    }
    public void g(){
        System.out.println("Inside the overriden method g of Z interface");
    }
    @Override
    public void b(){
        System.out.println("Overriden default method of interface X");
    }
}

class Demo {
    public static void main(String[] args) {
        ZImpl z = new ZImpl();
        z.a();
        z.d();
        z.b();
        z.g();
        z.b();
        X.c();
        Y.f();
        z.e();
    }
}