import java.util.*;
public class MultiSqr {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int a[]=new int[5],i;
        System.out.println("Enter 5 Numbers :");
        for (i=0 ; i<5 ; i++)
        {
            a[i]=S.nextInt();
        }
        System.out.println(" ");
        for(i=0;i<=4;i++)
        {
            System.out.println("Square Of "+a[i]+" = "+(a[i]*a[i]));
        }
    }
}
