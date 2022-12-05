package com.w.java516;

/**
 * ClassName:Test
 * PackageName:com.w.java516
 * Description:
 *
 * @date:2022/5/16 20:35
 * @author: wangchunping
 */
public class Test {
    public static void main(String[] args) {
        HeroDao dao=new HeroDao();
        Hero hero=new Hero(0,"1001","诸葛亮",200,3232,13,"法师");
        int result=dao.addHero(hero);
        if (result>0){
            System.out.println("成功");
        }else {
            System.out.println("失败");
        }
    }
}
