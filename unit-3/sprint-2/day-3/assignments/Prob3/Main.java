package assignments.Prob3;

import java.util.Arrays;

public class Main{
    public int[] findAndReturnPrimeNumbers(int[] inputArray){
        int count=0;
        int [] array = new int[inputArray.length];
        for(int i=0 ; i < inputArray.length ; i++){
            boolean flag = false;
            for(int j=2 ; j < inputArray[i]/2; j++){
                if(inputArray[i]%j==0){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                array[count] = inputArray[i];
                count++;
            }
        }
        return array;
    //write the logic to iterate through the supplied inputArray and
    //determine each element whether it is prime or not
    //create a second array of int
    //if any number is prime inside the inputArray then add that number inside the second
    //array
    //and return the second array
    //if no prime number is found then return the empty array.
    }
    public static void main(String[] args){
    //Create the object of Main class
    //on the object of Main class call the findAndReturnPrimeNumbers method
    //by supplying the following array as the parameter
            int[] arr = {10,12,5,50,11,14,15};
            Main obj = new Main();
            int[] prime = obj.findAndReturnPrimeNumbers(arr);
            if(prime.length==0){
                System.out.println("Prime number not found in the supplied Array");
            }else{
//                System.out.println(Arrays.toString(prime));
                for(int value : prime){
                    if(value!=0){
                        System.out.println(value);
                    }
                }
            }
    //print each element from the returned array of findAndReturnPrimeNumbers method
    //if findAndReturnPrimeNumbers method returns an empty array then print the followin message:
    // "Prime number not found in the supplied Array"
    }
}