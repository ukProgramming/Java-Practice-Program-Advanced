package functional_interface;

@FunctionalInterface
interface Launch12 {
    int getLength(String s);
}

public class AnonymousDemo2 {
    public static void main(String[] args) {
        Launch12 lunch12 = new Launch12() {
            @Override
            public int getLength(String s) {

                int result = s.length();
                return result;
            }
        };
        System.out.println(lunch12.getLength("Utkarsh"));
    }
}
