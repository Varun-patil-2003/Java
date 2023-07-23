import java.util.*;
class EvenOdd {
    public static void main(String[] args) {
        int a;
        Scanner S = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        a = S.nextInt();
        if ((a%2)==0)
        {
            System.out.println("Even Number !");
        }
        else
        {
            System.out.println("Odd Number !");
        }
    }
}
