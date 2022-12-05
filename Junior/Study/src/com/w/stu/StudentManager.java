package com.w.stu;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * 1.用输出语句完成主界面编写
 * 1.用Scanner实现键盘录入数据
 * 3.用switch语句完成操作的选择
 * 4.用循环完成在次回到主界面
 * */
public class StudentManager {
    public static void main(String[] args) {
        //创建集合对象，用于存储学生数据
        ArrayList<Student> arrayList = new ArrayList<Student>();
        //用循环完成在次回到主界面
        while (true) {
            //用输出语句完成主界面编写
            System.out.println("--------欢迎来到学生管理系统------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查看所有学生");
            System.out.println("5.退出");
            System.out.println("请输入你的选择：");

            //用Scanner实现键盘录入数据
            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();

            //用switch语句完成操作的选择
            switch (line) {
                case "1":
 //                   System.out.println("添加学生");
                        addStudent(arrayList);
                    break;
                case "2":
 //                   System.out.println("删除学生");
                    deleteStudent(arrayList);
                    break;
                case "3":
 //                   System.out.println("修改学生");
                    updateStudent(arrayList);
                    break;
                case "4":
//                    System.out.println("查看所有学生");
                    findAllStudent(arrayList);
                    break;
                case "5":
                    System.out.println("谢谢使用！");
 //                                  break;
                    System.exit(0);//JVM退出
            }
        }
    }
    //定义方法添加学生信息
    /*
    public static void addStudent(ArrayList<Student> arrayList){
    //键盘录入学生对象所需要的数据，显示提示信息，提示输入信息
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生学号：");
        String sid=scanner.nextLine();
        System.out.println("请输入学生姓名：");
        String name=scanner.nextLine();
        System.out.println("请输入学生年龄：");
        String age=scanner.nextLine();
        System.out.println("请输入学生居住的：");
        String address=scanner.nextLine();
    //创建学生对像，把键盘录入的数据赋值给学生对象的成员变量
        Student student = new Student();
        student.setSid(sid);
        student.setName(name);
        student.setAge(age);
        student.setAddress(address);
    //添加学生对象到集合里面
        arrayList.add(student);
    //提示添加成功
        System.out.println("添加成功");
    }

     */
    public static void addStudent(ArrayList<Student> arrayList){
        //键盘录入学生对象所需要的数据，显示提示信息，提示输入信息
        Scanner scanner = new Scanner(System.in);
        //为了能让sid在while循环外面被访问到，我们把它定义在循环外面
        String sid;
        //让程序能够回到这里，使用循环实现
        while (true) {
            System.out.println("请输入学生学号：");
            sid = scanner.nextLine();
            boolean flag = isUser(arrayList, sid);
            if (flag) {
                System.out.println("你输入学号已经被占用，请重新输入");
            }else {
                break;
            }
        }
        System.out.println("请输入学生姓名：");
        String name=scanner.nextLine();
        System.out.println("请输入学生年龄：");
        String age=scanner.nextLine();
        System.out.println("请输入学生居住的：");
        String address=scanner.nextLine();
        //创建学生对像，把键盘录入的数据赋值给学生对象的成员变量
        Student student = new Student();
        student.setSid(sid);
        student.setName(name);
        student.setAge(age);
        student.setAddress(address);
        //添加学生对象到集合里面
        arrayList.add(student);
        //提示添加成功
        System.out.println("添加成功");
    }
    //定义方法，判断学号是否被使用
    public static boolean isUser(ArrayList<Student>arrayList,String sid){
    //如果与集合中的某一个学生学号相同，返回true；如果都不相同，返回false
        boolean flag=false;
        for (int i=0;i<arrayList.size();i++){
            Student student=arrayList.get(i);
            if (student.getSid().equals(sid)){
                flag=true;
                break;
            }
        }
        return flag;
    }
    //查看学生
    /*
   public static void findAllStudent(ArrayList<Student>arrayList){
    //显示表头信息
        //\t相当于Tab键位置
        System.out.println("学号\t\t\t姓名\t\t年龄\t\t居住地");
    //将集合中数据取出按照对应格式显示学生信息，年龄补充显示岁
        for (int i=0;i<arrayList.size();i++){
            Student student=arrayList.get(i);
            System.out.println(student.getSid()+"\t"+student.getName()+"\t"+student.getAge()+"岁\t\t"+student.getAddress());
        }
    }
     */
    public static void findAllStudent(ArrayList<Student>arrayList){
        //判断集合中是否有数据，如果没有显示提示信息
        if (arrayList.size()==0){
            System.out.println("无信息，请先添加学生信息在查询");
            //为了程序不在往下执行，用return
            return;
        }
    //显示表头信息
        //\t相当于Tab键位置
        System.out.println("学号\t\t\t姓名\t\t年龄\t\t居住地");
    //将集合中数据取出按照对应格式显示学生信息，年龄补充显示岁
        for (int i=0;i<arrayList.size();i++){
            Student student=arrayList.get(i);
            System.out.println(student.getSid()+"\t"+student.getName()+"\t"+student.getAge()+"岁\t\t"+student.getAddress());
        }
    }
    //删除学生
    /*
    public static void deleteStudent(ArrayList<Student>arrayList){
    //键盘录入要删除学生的学号，显示提示信息
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入你要删除学生的学号：");
        String sid=scanner.nextLine();
    //遍历集合将对应学生从集合删除
        for (int i=0;i<arrayList.size();i++){
            Student student=arrayList.get(i);
            if (student.getSid().equals(sid)){
                arrayList.remove(i);
                break;
            }
        }
    //给出删除成功提示
        System.out.println("删除学生成功");
    }
     */
    public static void deleteStudent(ArrayList<Student>arrayList){
        //键盘录入要删除学生的学号，显示提示信息
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入你要删除学生的学号：");
        String sid=scanner.nextLine();
        //在删除学生操作前，对学号是否存在进行判断
        //如果不存在，提示信息
        //如果存在，执行删除
        int index=-1;
        for (int i=0;i<arrayList.size();i++){
            Student student=arrayList.get(i);
            if (student.getSid().equals(sid)){
//                int index=i;
                index=i;
            }
        }
        if (index==-1){
            System.out.println("改信息不在，请重新输入");
        }else {
            arrayList.remove(index);
        }
        //给出删除成功提示
        System.out.println("删除学生成功");
    }
    //修改学生
    public static void updateStudent(ArrayList<Student>arrayList) {
        //键盘录入要修改学生的学号，提示信息
        Scanner scanner=new Scanner(System.in);
        String sid=scanner.nextLine();
        System.out.println("请输入要修改学生的学号：");
        //键盘录入要修改学生的信息
        System.out.println("请输入学生新姓名：");
        String name=scanner.nextLine();
        System.out.println("请输入学生新年龄：");
        String age=scanner.nextLine();
        System.out.println("请输入学生新居住地：");
        String address=scanner.nextLine();
        //创建学生对象
        Student student=new Student();
        student.setSid(sid);
        student.setName(name);
        student.setAge(age);
        student.setAddress(address);
        //遍历集合对应的学生信息
        for (int i=0;i<arrayList.size();i++){
            Student student1=arrayList.get(i);
            if (student1.getSid().equals(sid)){
                arrayList.set(i,student);
                break;
            }
        }
        //修改成功
        System.out.println("修改学生成功");
    }
}
