package com.nezha.dp.Decorator;

import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by nezha on 2017/5/10.
 */
public class UpperFirstWordInputStream extends FilterInputStream {

    private int cBefore = 32;
    public UpperFirstWordInputStream(InputStream in){
        //由于FilterInputStream已经保存了装饰对象的引用，这里直接调用super即可
        super(in);
    }
    public int read() throws IOException {
        //根据前一个字符是否是空格来判断是否要大写
        int c = super.read();
        if(cBefore == 32)
        {
            cBefore = c;
            return (c == -1 ? c: Character.toUpperCase((char) c));
        }else{
            cBefore = c;
            return c;
        }
    }
}
