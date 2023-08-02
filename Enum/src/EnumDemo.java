enum Week {
    Mon, Tue, Wed, Thur, Fri, Sat, Sun;
}

enum Result {
    Pass, Fail;
}


public class EnumDemo {

    public static void main(String[] args) {

        Week w = Week.Mon;

        Gender gender = Gender.Male;
        int i = Gender.Male.ordinal();
        //System.out.println(gender);

        Gender[] genders = Gender.Female.values();
        for (Gender g : genders) {
            System.out.println(g + "  " + g.ordinal());
        }
//        System.out.println(i);
//        System.out.println(w);

    }

    enum Gender {
        Male, Female;
    }


}
