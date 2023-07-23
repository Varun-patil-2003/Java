import java.util.*;
public class ToLowerCase {
    public static void main(String args[]) {
        String name;
        Scanner S=new Scanner(System.in);
        System.out.println("Enter name");
        name=S.next();
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
    }
}
