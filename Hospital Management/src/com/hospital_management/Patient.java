package com.hospital_management;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Patient {
    //private int P_ID;
    private String name;
    // private String add_date;
    private int age;
    private String gender, data;


    public void writeData() {
        try {
            File f = new File(name + ".txt");
            boolean newFile = f.createNewFile();
            FileWriter Writer
                    = new FileWriter(String.valueOf(newFile));
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the Name of Patient: ");
            Writer.write("Patient Details...");
            String name = scanner.nextLine();
            Writer.write(name);
            System.out.println("Enter the Patient Age:");
            age = scanner.nextInt();
            Writer.write(age);
            System.out.println("Enter the Gender:");
            gender = scanner.next();
            Writer.write(gender);
            Writer.write("****************************");
            Writer.close();
            System.out.println("Successfully written.");
        } catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }

    public void readData() {
        try {
            File file = new File("myfile5.txt");

            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
            System.out.println("Data Read Successfully..");
        } catch (FileNotFoundException e) {
            System.out.println("Exception Occurred..");
            e.printStackTrace();
        }
    }
}
