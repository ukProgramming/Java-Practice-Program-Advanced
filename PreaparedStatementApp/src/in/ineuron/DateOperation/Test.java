package in.ineuron.DateOperation;

public class Test {
    public static void main(String[] args) {


        java.util.Date date;
        date = new java.util.Date();
        System.out.println(date);

        long d = date.getTime();
        java.sql.Date uDate;
        uDate = new java.sql.Date(0);
        System.out.println(uDate);

    }
}
