package com.javastreams;

import java.io.*;

public class BufferedVsUnbuffered {
    public static void main(String[] args) throws IOException {

        File src = new File("bigfile.dat");
        File dest = new File("copy.dat");

        // Buffered
        long start = System.nanoTime();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest))) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        }
        long end = System.nanoTime();

        System.out.println("Buffered Time: " + (end - start) + " ns");
    }
}

