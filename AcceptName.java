import java.util.Scanner;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

public class AcceptName {
    public static void main(String args[]) {
        String name;
        Scanner Y=new Scanner(System.in);
        System.out.println("Enter name:");
        name=Y.next();
        System.out.println("Your name is : "+name);
    }
}
