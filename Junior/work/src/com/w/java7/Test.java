package com.w.java7;

public class Test {
    public static void main(String[] args) {
        Book book=new Book("西游记","吴承恩","新华出版社",49.8);
        book.show();
        book.setPublisher("邮电大学出版社");
        book.setPrice(56);
        book.show();
    }
}
