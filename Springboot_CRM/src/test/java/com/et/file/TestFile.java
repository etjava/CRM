package com.et.file;

import java.io.File;

public class TestFile {

    public static void main(String[] args) {
        File file2 = new File("D:/");
        File[] files = file2.listFiles();// 方式2 listFile 返回String[]
        for (File file1 : files) {
            System.out.println(file1);
        }
    }
}
