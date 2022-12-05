package Demo2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * ClassName:NewsDome
 * PackageName:Demo2
 * Description:
 *
 * @date:2022/5/30 20:19
 * @author: wangchunping
 */
public class NewsDome {
    public static void main(String[] args) {
        /*在测试类中创建一个只能容纳该类对象的ArrayList集合，添加三条新闻。*/
        ArrayList<News1> list = new ArrayList<>();
        list.add(new News1<CityNews>("成都市疾控中心:减少非必要外出 相关人员及时完成核酸检测","王冰冰","我也不知道写什么新闻"));
        list.add(new News1<FocusNews>("扎克伯格「元宇宙」的故事","张扬","焦点访谈"));
        list.add(new News1<CityNews>("加密货币“鱿鱼币”骗局:暴涨后5分钟内跌至几乎为零","张大大","新闻圣诞节"));

        /*遍历集合，打印新闻标题，将新闻标题截取字符串到10个汉字的长度。*/

        Iterator<News1> iterator = list.iterator();
        while (iterator.hasNext()){
            News1 news = iterator.next();
            if(news.getTitle().length() < 10){
                System.out.println(news.getTitle());
            }else {
                System.out.println(news.getTitle().substring(0, 10));
            }
        }


    }
}
