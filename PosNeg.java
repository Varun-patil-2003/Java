import java.util.*;
public class PosNeg {
    public static void main(String[] args) {
        int a;
        Scanner S=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        a = S.nextInt();
        if(a>0)
        {
            System.out.println("POSITIVE NUMBER !");
        }
        if(a<0)
        {
            System.out.println("NEGATIVE NUMBER !");
        }
        if(a==0)
        {
            System.out.println("NOT POSITIVE NOR NEGATIVE !!!");
        }
    }
}
