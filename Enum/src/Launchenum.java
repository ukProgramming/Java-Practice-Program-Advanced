import java.util.Scanner;

enum Result2 {
    Pass, Fail, NR;
    int marks;

    Result2() {
        System.out.println("Constructor Called.");
    }

    int getMarks() {
        return marks;
    }

    void setMarks(int marks) {
        this.marks = marks;

    }

}

public class Launchenum {
    public static void main(String[] args) {
        Result2 result2 = Result2.Fail;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Student Marks:");
        int markss = scanner.nextInt();
        result2.setMarks(markss);
        int mr = result2.getMarks();
        System.out.println(result2 + " : " + mr);
    }
}
