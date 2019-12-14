package Lab11;

public class C extends B {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
    }

    C() {
        System.out.println("Działa konstruktor C");
    }
}
class B extends A {
    B() {
        System.out.println("Działa konstruktor B");
    }
}
class A {
    A() {
        System.out.println("Działa konstruktor A");
    }
}