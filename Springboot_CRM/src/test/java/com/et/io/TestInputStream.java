package com.et.io;


import java.io.FileInputStream;
import java.io.InputStream;

public class TestInputStream {
    public static void main(String[] args) throws Exception{
        String path="d://crm.log";
        // 创建输入流 - 字节
        InputStream is = new FileInputStream(path);
        // 使用字节数组接收数据
        byte[] b = new byte[1024];
        // 开始读取文件内容到内存中
        // 读取到文件结尾返回-1
        int len = -1;// 默认值 -1  表示文件结尾
        while((len = is.read(b))!=-1) {
            // 1.从b缓冲区读取数据，2.从0开始读取，3. 每次读取长度
            System.out.write(b,0,len);
        }
        // 关闭资源
        is.close();
    }
}
