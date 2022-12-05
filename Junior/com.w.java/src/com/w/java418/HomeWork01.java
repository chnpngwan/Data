package com.w.java418;

public class HomeWork01 {
        int[] arrs = {12, 21, 33, 9, 2};
        public String arraysToString(int[] arrs){
            StringBuffer stringBuffer=new StringBuffer();
            for (int i=0;i< arrs.length;i++){
                if (i!= arrs.length-1){
                    stringBuffer.append(arrs[i]+",");
                }else {
                    stringBuffer.append(i);
                }
            }
            return stringBuffer.toString();
        }

    public static void main(String[] args) {
        HomeWork01 homework=new HomeWork01();
        String string =homework.arraysToString(homework.arrs);
        System.out.println(string);
    }
}
