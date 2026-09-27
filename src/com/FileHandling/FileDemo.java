package com.FileHandling;

import java.io.File;
import java.io.FileOutputStream;

public class FileDemo {
    public static void main(String[] args) throws Exception {
        String str = "I want a real time examples..";
        File file = new File("filePractice.txt");
        FileOutputStream stream = new FileOutputStream(file, true);  //boolean append is true now.
        char[] arr = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            stream.write(arr[i]);
            System.out.println(i);
        }
        stream.close();
//        int i=arr.length-1;
//        while (i!=-1)
//        {
//
//        }
    }
}
/**
 * System.out.println("ABSOLUTE PATH OVER FILE IS : " + file.getAbsolutePath());
 * System.out.println("ABSOLUTE FILE IS : " + file.getAbsoluteFile());
 * System.out.println("Name : " + file.getName());
 * System.out.println("present : " + file.exists());
 * System.out.println("length : " + file.length());
 * System.out.println("write : " + file.canWrite());
 * System.out.println("read : " + file.canRead());
 * if (file.createNewFile())
 * System.out.println("Yes..!!");
 * else System.out.println("No..!!");
 */