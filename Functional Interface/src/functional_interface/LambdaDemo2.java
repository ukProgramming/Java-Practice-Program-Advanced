package functional_interface;


interface Launch14 {
    void addNumber(int num, int num2);
}

public class LambdaDemo2 {
    public static void main(String[] args) {

        Launch14 launch14 = (num, num2) -> {  //<==== Lambda Expression Demo
            int result = num + num2;
            System.out.println("Addition of Two Number:" + result);
        };
        //Launch14 lunch14=(num)-> System.out.println("Addition of Two Number:"+num);

        launch14.addNumber(5, 10);
    }
}
