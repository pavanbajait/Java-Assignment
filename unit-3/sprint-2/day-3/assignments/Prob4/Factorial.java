package assignments.Prob4;

public class Factorial {
    public static void main(String[] args) {
//        System.out.println(args[0]);
//        System.out.println(args[1]);
//        System.out.println(args[2]);
        if(args.length == 1){
            int num1 = Integer.parseInt(args[0]);
            for(int i=num1-1; i>=2; i--){
                num1*=i;
            }
            System.out.println(num1);
        }else if(args.length == 2){
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            int diff = Math.abs(num1-num2);
            for(int i=diff-1; i>=2; i--){
                diff*=i;
            }
            System.out.println(diff);
        }else{
            System.out.println("Error");
        }
    }
}
