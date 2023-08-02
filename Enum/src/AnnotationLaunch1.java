@FunctionalInterface
interface Addition1 {

    void add();
//    void sub();

}

class Demo2 {

    void getInfo() {
        System.out.println("Calling Parent....");
    }

}

class Demo3 extends Demo2 {
    @Override
    void getInfo() {
        System.out.println("Child Calling......");
    }
}

public class AnnotationLaunch1 {
    public static void main(String[] args) {

        Demo2 demo3 = new Demo2();
        demo3.getInfo();
    }
}
