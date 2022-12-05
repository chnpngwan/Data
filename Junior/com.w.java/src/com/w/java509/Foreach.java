package com.w.java509;

import com.sun.javaws.jnl.ResourcesDesc;

import java.security.spec.PKCS8EncodedKeySpec;

/**
 * ClassName:Foreach
 * PackageName:com.w.java509
 * Description:
 *
 * @date:2022/5/15 13:39
 * @author: wangchunping
 */
public interface Foreach {
    public boolean hasNext();
    public Object next();
}

class ListArray{
    //动态数组容量
    int capacity;
    Object [] data=new Object[capacity];
    //计数器：表示添加了几个元素
    int index=0;
    public ListArray(int num){
    data =new Object[num];
    }

    public Object[] addElement(Object object){
        for (int i=0;i< data.length;i++){
            data[i] =object;
        }
        return null;
    }

    public int size(){
        return index;
    }

    public Foreach foreach(){
//        return (Foreach) new ListArrayForeach();
        return new ListArrayForeach();
    }

    public class ListArrayForeach implements Foreach{
        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Object next() {
            return null;
        }
    }

    public static void main(String[] args) {
        Object obj=new Object();
    }
}