package functional_interface;

@FunctionalInterface
public interface Demo {

    // Functional Interface  Means Interface with Single Abstract method is called Functional Interface.
    // We can add Multiple Abstract in Functional Interface if method is declared with the Default keyword.
    // We cannot add multiple abstract method in the Functional Interface.

    void add();

    default void sub() {
        System.out.println("I Love Codding....");
    }

}

class Alien implements Demo {

    @Override
    public void add() {
        System.out.println("I Love Java Programming to Much.....");
    }
}

class Launch1 {
    public static void main(String[] args) {
        Demo demo = new Alien();
        demo.add();
        demo.sub();
    }
}