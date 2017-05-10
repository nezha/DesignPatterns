package com.nezha.dp.Decorator;

import java.io.*;

/**
 * Created by nezha on 2017/5/10.
 */
public class InputTest {
    public static void main(String[] args) throws IOException {
        int c;
        StringBuffer sb = new StringBuffer();
        try {
            //这里用了两个装饰者，分别是BufferedInputStream和我们的UpperFirstWordInputStream
            InputStream in = new UpperFirstWordInputStream(new BufferedInputStream(new FileInputStream("/Users/nezha/Desktop/test.txt")));
            while((c = in.read()) >= 0)
            {
                sb.append((char) c);
            }
            System.out.println(sb);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
