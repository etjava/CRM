package com.et.file;

import java.io.File;

public class TestFile3 {

    public static void main(String[] args) {
        delDir();
    }

    private static void createDir(){
        StringBuffer buf = new StringBuffer("D:");
        for (int i=0;i<=99;i++){
            buf.append("/"+i);
        }
        System.out.println(buf);
        File f2 = new File(buf.toString());
        f2.mkdirs();
    }

    private static void delDir(){
        for(int i = 99;i>=0;i--){
            StringBuffer buf2 = new StringBuffer("D:\\");
            //每次删除一个文件夹的目录
            for(int j = 0;j<=i;j++){
                buf2.append(j);
                buf2.append("\\");
            }
            File ff = new File(new String(buf2));
            System.out.println(buf2);
            ff.delete();
        }
    }
}
