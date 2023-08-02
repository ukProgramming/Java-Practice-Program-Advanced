enum Week1 {
    Mon, Tue, Wed, Thur, Fri, Sat, Sun;
}

enum Gender {
    Male, Female;
}

public class Launch1 {
    public static void main(String[] args) {
        Gender g = Gender.Male;
        //System.out.println(g);

        Gender[] gender = Gender.Female.values();
        for (Gender g1 : gender) {
            System.out.println(g1 + "  " + g1.ordinal());
        }
        System.out.println();
        Week[] weeks = Week.Mon.values();
        for (Week w : weeks) {
            System.out.println(w + "    " + w.ordinal());

        }
    }
}
