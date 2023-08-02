enum result {
    Pass, Fail;
    int marks;

    result() {
        System.out.println("Costructor Getting Called......");
    }

    void setMarks(int marks) {
        this.marks = marks;
    }

    int getMakrs() {
        return marks;
    }
}

public class EnumDemo1 {

    public static void main(String[] args) {
        result.Pass.setMarks(50);

        int mkr = result.Pass.getMakrs();

        System.out.println(mkr);
    }
}
