import java.util.*;
public class AcptArray {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        int a[]=new int[5];
        System.out.println("Enter 5 Number :");
        for(int i=0;i<5;i++)
        {
            a[i]=S.nextInt();
        }
        System.out.println("5 Numbers Are :");
        for(int i=0;i<5;i++)
        {
            System.out.println(a[i]+" ");
        }
    }
}
