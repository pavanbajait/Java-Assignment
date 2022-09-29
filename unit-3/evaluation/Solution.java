import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'minOperations' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int minOperations(List<Integer> arr) {
        int[] array = arr.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        int n= array.length;
        int count=0;
        for(int i=1;i<n-1;i=i+2){
            if(array[i-1]<array[i])
                count++;
            if(array[i]>array[i+1])
                count++;
        }
        int countx=0;
        for(int i=1;i<n-1;i=i+2){
            if(array[i-1]>array[i])
                countx++;
            if(array[i]<array[i+1])
                countx++;
        }
        System.out.println(count);
        System.out.println(countx);
        if(count<countx)
            return count;
        else
            return countx;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = IntStream.range(0, arrCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.minOperations(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
