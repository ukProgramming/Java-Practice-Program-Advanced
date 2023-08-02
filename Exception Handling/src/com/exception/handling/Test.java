package com.exception.handling;

class Test {
    int count = 0;

    public static void main(String[] args) throws Exception {
        Test obj = new Test();
        obj.A();
        obj.display();
    }

    void A() throws Exception {
        try {
            count++;
            // System.out.println(count);

            try {
                count++;

                try {
                    count++;

                    throw new Exception();


                } catch (Exception ex) {

                    count++;

                    throw new Exception();
                }
            } catch (Exception ex) {

                count++;

            }
        } catch (Exception ex) {
            count++;

        }

    }

    void display() {
        System.out.println(count);
    }
}