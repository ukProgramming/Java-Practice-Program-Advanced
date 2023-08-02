enum Results1 {
    PASS, FAIL, NR;

//   Results1(){     System.out.println("Lets How Many Times");
//    }
}


public class EnumSwitchDemo {
    public static void main(String[] args) {
        Results1 results1 = Results1.PASS;
        //System.out.println(results1);

        switch (results1) {
            case PASS:
                System.out.println("Passed");
                break;
            case FAIL:
                System.out.println("Failed");
                break;
            case NR:
                System.out.println("No Result");
                break;
        }
    }
}

