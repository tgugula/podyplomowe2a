package lab;

public class ConstructorTester {
    public static void main(String[] args) {
        new C();
    }
}
class A {
    public A(boolean isSilent) {
        if (!isSilent) {
            System.out.printf("A");
        }
    }
}
class B extends A {
    public B(boolean isSilent) {
        super();
        if (!isSilent){
            System.out.printf("B");
    }
        System.out.printf("B");
    }
}
class C extends B{
    public C(boolean isSilent) {
        System.out.printf("C");
    }

    public C() {
        super();
    }
}
