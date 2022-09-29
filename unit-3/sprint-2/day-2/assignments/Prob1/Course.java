package assignments.Prob1;
import java.util.Scanner;

public class Course {

    int courseId;
    String courseName;
    int courseFee;

    public void displayCourseDetails(){
        System.out.println("Your Course Id is " +courseId);
        System.out.println("Your Course Name is " +courseName);
        System.out.println("Your Course Fee is " +courseFee);
    }
    public static void authenticate(String username, String password){
        if(username=="Admin" && password=="1234"){
            Course c1 = new Course();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Your Course Id:");
            c1.courseId = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Your Course Name:");
            c1.courseName = sc.nextLine();
            System.out.println("Enter Your Course Fee:");
            c1.courseFee = sc.nextInt();
            c1.displayCourseDetails();
        }else{
            System.out.println("Invalid Username or password");
        }
    }

    public static void main(String[] args) {
        authenticate("Admin", "1234");
        authenticate("Adin", "12345");
    }
}
