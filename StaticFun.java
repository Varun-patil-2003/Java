public class StaticFun {
    static void add(int a,int b) {
        System.out.println((a+b));
    }
    void add(int a,int b,int c) {
        System.out.println((a+b+c));
    }
public static void main(String args[]) {
    

    StaticFun F = new StaticFun();
    F.add(11,11);
    F.add(11,11,11);
    }
}
