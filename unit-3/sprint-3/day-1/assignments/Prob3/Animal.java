package assignments.Prob3;

import java.util.Arrays;

public class Animal {
    public void makeNoise(){
        System.out.println("Animal making Noise");
    }
    public void eat(){
        System.out.println("Animal is eating");
    }
    public void walk(){
        System.out.println("Animal is walking");
    }
}

class Dog extends Animal{
    @Override
    public void makeNoise(){
        System.out.println("Barking...");
    }
}

class Cat extends Animal{
    @Override
    public void makeNoise(){
        System.out.println("Meaw...");
    }
}

class Tiger extends Animal{
    @Override
    public void makeNoise(){
        System.out.println("Roaring...");
    }
}

class Main {
    public static void main(String[] args) {
        //create an array of Animal class with size 3
        Animal [] arr = new Animal[3];
        //initialise all 3 elements of this Animal clas with
        // Dog, Cat and Tiger class object.

        Dog d=new Dog();
        Tiger t= new Tiger();
        Cat c= new Cat();
        arr[0]=d;
        arr[1]=t;
        arr[2]=c;
        //call the all methods (eat,walk,makeNoise) from all
        //the 3 objects.
        d.eat();
        d.walk();
        d.makeNoise();
        t.eat();
        t.walk();
        t.makeNoise();
        c.eat();
        c.walk();
        c.makeNoise();
//        System.out.println(Arrays.toString(arr));
    }
}