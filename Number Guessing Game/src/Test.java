import java.util.Scanner;

public class Test {
    int getnum;

    public static void main(String[] args) throws Exception {
        Test[] test = new Test[5];
        for (int i = 0; i < 5; i++) {
            test[i].accept();
        }

    }

    public int accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number....");
        getnum = scanner.nextInt();

        return getnum;
    }
}
