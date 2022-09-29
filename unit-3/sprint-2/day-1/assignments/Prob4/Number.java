package assignments.Prob4;

public class Number {
    public void wholeNum(int x){
        if(x<0){
            System.out.println("Error");
        }else if(x%2==0){
            int y=x;
            while(y<(x+10)){
                y++;
                if(y%10==0) break;
            }
            System.out.println(y);
        }else{
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        Number obj = new Number();
        obj.wholeNum(44);
    }
}
