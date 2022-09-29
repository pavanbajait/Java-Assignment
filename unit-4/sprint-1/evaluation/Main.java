/*
*SOrt thr Map according to User defined class Student obj values(student,marks)
* without using treemap
* with using hashmap
* */


import java.util.*;
import java.lang.*;
public class Main {
    public static HashMap<String, Student> sortByValue(HashMap<String, Student> hm)
    {
        List<Map.Entry<String, Student> > list =
                new LinkedList<Map.Entry<String, Student> >(hm.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Student> >() {
            public int compare(Map.Entry<String, Student> s1,
                               Map.Entry<String, Student> s2)
            {
                if(s1.getValue().getMarks() > s2.getValue().getMarks())
                    return +1;
                else if(s1.getValue().getMarks() < s2.getValue().getMarks())
                    return -1;
                else
                    return 0;
            }
        });


        HashMap<String, Student> temp = new LinkedHashMap<String, Student>();
        for (Map.Entry<String, Student> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }

    public static void main(String[] args)
    {

        HashMap<String, Student> hm = new HashMap<String, Student>();

        hm.put("Maharastra", new Student(10, "Ganesh", 950));
        hm.put("Tamilnadu", new Student(12, "Pavan", 850));
        hm.put("Telangana", new Student(15, "Akash", 920));
        hm.put("Haryana", new Student(16, "Pankaj", 910));
        hm.put("Kerla", new Student(18, "Shubham", 880));

        Map<String, Student> hm1 = sortByValue(hm);

        for (Map.Entry<String, Student> en : hm1.entrySet()) {
            System.out.println("Key = " + en.getKey() +
                    ", Value = " + en.getValue());
        }
    }
}
