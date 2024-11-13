package com.et.file;

import java.io.File;

public class TestFile2 {

    static int nums = 0;
    private static int sum(File dir){
        File[] files = dir.listFiles();
        if (files!=null){
            for (File f : files) {
                if (f.isDirectory()){
                    sum(f);
                }else{
                    // 文件个数+1
                    System.out.println(f.getName());
                    nums++;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int sum = sum(new File("C:\\Program Files\\Java\\jdk1.7.0_80\\src"));
        System.out.println(sum);
    }
}
