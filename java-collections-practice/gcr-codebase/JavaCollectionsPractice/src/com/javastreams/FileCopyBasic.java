package com.javastreams;

import java.io.*;

public class FileCopyBasic {
    public static void main(String[] args) {

        File source = new File("source.txt");
        File destination = new File("destination.txt");

        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination)) {

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            System.out.println("File copied successfully.");

        } catch (FileNotFoundException e) {
            System.out.println("Source file does not exist.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
