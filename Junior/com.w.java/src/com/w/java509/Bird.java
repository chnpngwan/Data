package com.w.java509;

/**
 * ClassName:Bird
 * PackageName:com.w.java509
 * Description:
 */
public abstract class Bird {
    private String name;
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract int fly();
}
class Action{
    public void op(Bird bird){
        System.out.println(bird.getName()+"能够飞"+bird.fly()+"米");
    }

    public static void main(String[] args) {
        Action action=new Action();
        action.op(new Bird() {
            @Override
            public int fly() {
                return 10000;
            }
            @Override
            public String getName(){
                return "大雁";
            }
        });
    }
}
