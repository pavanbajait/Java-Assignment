package Prob2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Traverse {
    public static void main(String[] args) {
        List<String> al =new ArrayList<>();
        al.add("one");
        al.add("two");
        al.add("three");
        al.add("one");  // String
        al.add("four");
        al.add("five");

        System.out.println("Using for loop :");
        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));
        }

        System.out.println("********************");
        System.out.println("Using enhanced for loop :");
        for(String s: al){
            System.out.println(s);
        }

        System.out.println("********************");
        System.out.println("Using iterator loop :");
        Iterator<String> itr = al.iterator();
        while(itr.hasNext()){
            String s= itr.next();
            System.out.println(s);
        }
    }
}
