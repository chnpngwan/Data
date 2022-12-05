package com.w.idea;

public class shuzi {
    /**
     * @author Dream
     * 计算1-300之间所有的偶数和。
     */
        //定义静态方法
        public static void add(){
            int sum=0;
            for (int i=2;i<=300;i+=2){
                sum+=i;
            }
            System.out.println(sum);
        }

        public static void main(String[] args) {
            //调用静态方法（直接调用）
            add();
        }
}
