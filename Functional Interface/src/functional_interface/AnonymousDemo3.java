package functional_interface;


abstract class ClassAnonymous {

    public abstract int getLenght(String s);
}

public class AnonymousDemo3 {
    public static void main(String[] args) {
        ClassAnonymous classAnonymous = new ClassAnonymous() {
            @Override
            public int getLenght(String s) {
                int len = s.length();

                return len;
            }
        };
        System.out.println(classAnonymous.getLenght("Khalkar"));
    }
}
