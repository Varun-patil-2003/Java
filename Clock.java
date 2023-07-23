import java.util.Scanner;

public class Clock {
    public static void main(String[] args) {
        System.out.println();
        
        Scanner S=new Scanner(System.in);

        System.out.print("\nENTER TIME FOR FIND THE DEGREE BETWEEN HOUR HAND AND MINUTE HAND :\nHH MM = ");
        Double hour,minute;
        hour=S.nextDouble();
        minute=S.nextDouble();

        Double theta=(30*hour)-((11*minute)/2);
        System.out.println("THE ANGLE BETWEEN HOUR HAND AND MINUTE HAND IS "+Math.abs(theta)+" DEGREE.");
    }
}
