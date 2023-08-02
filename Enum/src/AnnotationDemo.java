@FunctionalInterface
interface Addition {
    void add();
    //int sub();
}

class Demo {
    void getInfo() {
        System.out.println("Parent..");
    }

}

class Demo1 extends Demo {
    @Override
    void getInfo() {
        System.out.println(" Override...");
    }
}

public class AnnotationDemo {
    public static void main(String[] args) {


    }
}
