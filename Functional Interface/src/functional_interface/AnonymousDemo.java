package functional_interface;

interface Lunch11 {
    void display();
}

public class AnonymousDemo {
    public static void main(String[] args) {

        // Anonymous Class Demo
        Lunch11 lunch11 = new Lunch11() {
            @Override
            public void display() {
                System.out.println("I Write Code...");
            }
        };
        lunch11.display();
    }
}
