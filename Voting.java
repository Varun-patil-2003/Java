import java.util.*;
public class Voting {
    public static void main(String[] args) {
        int age;
        Scanner S = new Scanner(System.in);
        System.out.println("Enter Age : ");
        age = S.nextInt();
        if(age>=18)
        {
            System.out.println("Eligible For Voting !");
        }
        if(age<18)
        {
            System.out.println("Not Eligible For Voting !");
        }
    }
}
