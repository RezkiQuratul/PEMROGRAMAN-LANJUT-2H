import org.w3c.dom.ls.LSOutput;

public class Casting2 {
    static class A {
        public void print() {
            System.out.println("A");
        }
    }
  static class B extends A {
        public void print() {
            System.out.println("B");
        }

        public static void main(String[] args) {
            A object = new B();
            B b = (B) object;
            b.print();
        }
    }
}
