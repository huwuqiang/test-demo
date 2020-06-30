public class StaticTest {

    boolean b=true;
   static Boolean B =null;
    static {
        System.out.println("Hi there");
    }
    public void print() {
        System.out.println("Hello");
    }
    public static void main(String args []) {

        System.out.println(B);
        StaticTest st1 = new StaticTest();
        st1.print();
        StaticTest st2 = new StaticTest();
        st2.print();
    }
}