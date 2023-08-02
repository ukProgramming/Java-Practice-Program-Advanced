import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@interface CricketPlayer {

    String name() default "Cricketer";

    int age() default 2000;
}

@CricketPlayer
class Virat {
    @CricketPlayer
    private String name;
    private int age;
}

public class CustomAnnotationDemo {
    public static void main(String[] args) {

    }
}
