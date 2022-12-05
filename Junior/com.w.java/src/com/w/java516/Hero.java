package com.w.java516;

/**
 * ClassName:Hero
 * PackageName:com.w.java516
 * Description:
 *
 * @date:2022/5/16 18:04
 * @author: wangchunping
 */
public class Hero {
    private  int id;
    private String num;
    private String name;
    private int output;
    private int attackPower;
    private int magicValue;
    private String type;

    public Hero() {
        super();
    }

    public Hero(int id, String num, String name, int output, int attackPower, int magicValue, String type) {
        this.id = id;
        this.num = num;
        this.name = name;
        this.output = output;
        this.attackPower = attackPower;
        this.magicValue = magicValue;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "id=" + id +
                ", num='" + num + '\'' +
                ", name='" + name + '\'' +
                ", output=" + output +
                ", attackPower=" + attackPower +
                ", magicValue=" + magicValue +
                ", type='" + type + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOutput() {
        return output;
    }

    public void setOutput(int output) {
        this.output = output;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getMagicValue() {
        return magicValue;
    }

    public void setMagicValue(int magicValue) {
        this.magicValue = magicValue;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
