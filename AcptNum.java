import java.net.SocketPermission;
import java.util.Scanner;

public class AcptNum {
    void disp(int x)
    {
        System.out.println("Num is "+x);
    }
    public static void main(String args[]) {
        int n;
        Scanner S = new Scanner(System.in);
        System.out.println("Enter Num");
        n = S.nextInt();
        AcptNum A = new AcptNum();
        A.disp(n);
    }
}
