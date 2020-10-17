package Assignment4;

/**
 * Ratkaisu on mahdollinen.
 *
 */


abstract class A {
    private void a() {
        System.out.print("help");
    }
    void x() {
        a(); }
    void y() { }
}
abstract class B extends D {
    private void a() {
        System.out.print("poa");
    }
    void x() {super.x();
    a();}
    void y() {super.y(); }
}
abstract class C extends B {
    private void a() {
        System.out.print(" kun");
    }
    void x() {super.x();
        a();
    super.y();}
    void y() { }
}
abstract class D extends A {
    private void a() {
        System.out.print(" sen");
    }
    void x() {super.x();
         }
    void y() { a();}
}
final class E extends C {
    private void a() {
        System.out.print(" osaa");
    }
    void x() { super.x();
    a();}
    void y() { }
}