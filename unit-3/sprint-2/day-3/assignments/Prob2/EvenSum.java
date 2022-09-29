package assignments.Prob2;
import java.util.Arrays;
import java.util.Scanner;
public class EvenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j] = sc.nextInt();
            }
        }
//        System.out.println(Arrays.deepToString(arr));
        for(int i=0;i<3;i++){
            int sum=0;
            for(int j=0;j<3;j++){
                if(arr[j][i]%2==0){
                    sum+=arr[j][i];
                }
            }
            System.out.println(sum);
        }
    }
}
