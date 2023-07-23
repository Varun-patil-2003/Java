public class DefCnstrctr {
    int a,b;
    DefCnstrctr()
    {
        a=10;
        b=19;
    }
    void disp()
    {
        System.out.println("\na = "+a+"\nb = "+b);
    }
    public static void main(String[] args) {
        DefCnstrctr D = new DefCnstrctr();
        DefCnstrctr D1 = new DefCnstrctr();
        D.disp();
        D1.disp();
    }
}
