public class This1 {
    int num;
    void disp(int num) {
        this.num=num;
        System.out.println("Num is "+num);
    }
    void show() {
        System.out.println("Num is "+num);
    }
    public static void main(String args[]) {
        This1 T = new This1();
        T.disp(15);
        T.show();
    }
}
