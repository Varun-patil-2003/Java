import java.util.*;
public class FunParamtr {
    int num;
    void disp(int x)
    {
        num = x;
        System.out.println("Num is "+x);
    }
    void show()
    {
        System.out.println("Num is "+num);

    }
    public static void main(String args[]) {
        int n;
        Scanner S = new Scanner(System.in);
        System.out.println("Enter Num ");
        n=S.nextInt();
        FunParamtr D = new FunParamtr();
        D.disp(n);
        D.show();
    }
}
