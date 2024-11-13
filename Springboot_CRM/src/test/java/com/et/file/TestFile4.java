package com.et.file;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Locale;

public class TestFile4 {

    public static void main(String[] args) {
        File f = new File(".");
        //返回的boolean类型，如果是true代表能通过，false就要被过滤掉
        File[] files = f.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return dir.isFile() && name.toLowerCase().endsWith(".class");
            }
        });

        for (File file:files){
            System.out.println(file);
            file.delete();
        }
    }
}
