package com.file.handling;

import java.io.File;

public class File1 {
    public static void main(String[] args) throws Exception {
        File f = new File("temdir");
        f.mkdir();
        File f1 = new File("temdir/abc.txt");
        f1.createNewFile();
        System.out.println(f.exists());//false
        // f.createNewFile();
        System.out.println(f.exists());

    }
}
