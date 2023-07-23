import java.util.*;
public class EndsWith {
    public static void main(String args[]) {
        String name;
        Scanner S=new Scanner(System.in);
        System.out.println("Enter name:");
        name=S.nextLine();
        System.out.println(name.endsWith("y"));
        System.out.println(name.endsWith("a"));
        System.out.println(name.endsWith("India"));
    }
}
