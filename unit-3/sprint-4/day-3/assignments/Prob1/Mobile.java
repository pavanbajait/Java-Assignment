package Prob1;

import java.util.Scanner;

public class Mobile {
    String[] outdatedModels = {"note4","note5","note6","note7"};

    void searchOutdatedModel(String company, String...model ){
        for(String s : model){
            for(String m : outdatedModels){
                if(s.equals(m)){
                    System.out.println(s+"_OUTDATED");
                }
            }
        }

    }

    public static void main(String[] args) {
        Mobile mob = new Mobile();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the mobile company Name:");
        String mobCompName= sc.next();
        System.out.println("Enter the model name:");
        String modelName="";

        while(sc.hasNext()){
            modelName=sc.next();
            mob.searchOutdatedModel(mobCompName, modelName );
            if(modelName.equals("stop")){
                break;
            }
        }

    }

}
