package Prob2;

import java.util.*;

public class Mobile {
    HashMap<String, ArrayList<String>> mobiles = new HashMap<>();

    public static void main(String[] args) {
        Mobile mobile=new Mobile();

        String checkAdded = mobile.addMobile("apple","iphone12");
        mobile.addMobile("apple","iphone10");
        mobile.addMobile("apple","iphone13");
        mobile.addMobile("apple","iphone11");
        mobile.addMobile("mi","mi10");
        mobile.addMobile("mi","mi12");
        mobile.addMobile("samsung","galaxy10");
        mobile.addMobile("samsung","galaxy11");
        System.out.println(checkAdded+"------\n");
//        Set<Map.Entry<String, ArrayList<String>> set =mobiles.entrySet();
        try {
            Scanner scanner=new Scanner(System.in);
            System.out.print("Enter company name to get there models: ");
            String comp=scanner.next();
            System.out.println(mobile.getModels(comp));


        }catch (InvalidMobileException in){
            System.out.println(in);
        }

    }
    public String addMobile(String company, String model){
        List<String> list;
        if(mobiles.containsKey(company)){
            ArrayList<String> ar =mobiles.get(company);
            ar.add(model);
            mobiles.put(company, ar);
        }else{
            ArrayList<String> al= new ArrayList<>();
            al.add(model);
            mobiles.put(company, al);
        }
        return "Mobile added successfully";
    }

    public List<String> getModels(String company)throws InvalidMobileException {
        if(mobiles.containsKey(company)){
            return mobiles.get(company);
        }else{
            throw new InvalidMobileException("no models of this company are available");
        }
    }

}

class InvalidMobileException extends Exception {
    public InvalidMobileException(String s)
    {
        super(s);
    }
}