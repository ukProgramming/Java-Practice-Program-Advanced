package com.pattern.complex;

public class CharDemo {
    public static void main(String[] args) {

//        int n=5;
//        int val;
//        int s;
//        for(int i=n;i>=1;i--)
//        {
//            val='F'-1;
//            for(int j=i;j<=n;j++)
//            {
//                //cout<<char(val);
//               // s=val.reverse();
//                System.out.print(" "+val);
//                //cout<<j;
//                val=val-1;
//
//            }System.out.println();
//        }

        int n = 5;
        int val;
        for (int i = n; i >= 1; i--) {
            val = 'E';
            for (int j = i; j <= n; j++) {
                System.out.print(" " + val);
                val = val - 1;
            }

            System.out.println();
        }
    }
}
