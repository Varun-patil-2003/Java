public class FunOvrldArea {
    void area(int s) {
        System.out.println("Area of Square = "+(s*s));
    }
    void area(int l,int b) {
        System.out.println("Area Of Rectangle = "+(l*b));
    }
    void area(float pie,float r) {
        System.out.println("Area Of Circle = "+(pie*r*r));
    }
}
class FunOvrldArea1 {
    public static void main(String args[]) {
        FunOvrldArea F = new FunOvrldArea();
        F.area(21);
        F.area(3.14f,2.9f);
        F.area(4,7);
    }
}
