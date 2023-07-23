public class FunOvrld {
    void show(int n,int m) {
        System.out.println("Sum = "+(n+m));

    }
    void show(int x,float y){
        System.out.println("Sum = "+(x+y));

    }
}
class FunOvrld1 {
    public static void main(String args[]) {
        FunOvrld F = new FunOvrld();
        F.show(12, 9);
        F.show(2, 5.7f);
        F.show(6, 7);
    }
    
}
