package Demo2;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * ClassName:NewsTest
 * PackageName:Demo2
 * Description:
 *
 * @date:2022/5/29 12:03
 * @author: wangchunping
 */
public class NewsTest {
    public static void main(String[] args) {
        News news=new News("中国多地遭雾霾笼罩空气质量再成热议话题");
        News news1=new News("春节临近北京“卖房热”");
        ArrayList list = new ArrayList();
        list.add(news);
        list.add(news1);

        ListIterator iterator = list.listIterator();
        //指针位于开头
        while(iterator.hasNext()) {
            //不断循环 将指针位于结尾
            iterator.next();
        }

        //逆向遍历
        while(iterator.hasPrevious()) {
            Object obj = iterator.previous();
            News ne = (News) obj;
            String title = ne.getTitle();
            if(title.length() > 15){
                System.out.println(title.substring(0,15) + "...");
            }else{
                System.out.println(title);
            }
        }
    }
}
