package functional_interface;

@FunctionalInterface
interface Launch13 {
    void show();
}

public class LambdaDemo {
    public static void main(String[] args) {

        Launch13 launch13 = () -> System.out.println("I Love Programming....");
        launch13.show();

    }
}
