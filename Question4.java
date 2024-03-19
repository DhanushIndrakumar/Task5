
import java.util.Scanner;
import java.time.LocalDate;


public class Question4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year");
        int year=sc.nextInt();
        System.out.println("Enter the month");
        int month=sc.nextInt();
        System.out.println("Enter the day");
        int day=sc.nextInt();

        LocalDate birthDate=LocalDate.of(year,month,day);
        System.out.println("The birth date:"+birthDate);

        LocalDate currentDate=LocalDate.now();
        System.out.println("The current date:"+currentDate);

        int age;
        age=currentDate.getYear()-birthDate.getYear();//calculating the age
        System.err.println("The age:"+age);
        
    }
    
}
