package Demo2;

import java.util.Objects;

/**
 * ClassName:News1
 * PackageName:Demo2
 * Description:
 *
 * @date:2022/5/30 20:17
 * @author: wangchunping
 */
public class News1<T> {
    /*
    封装一个新闻类News，包含新闻标题，新闻作者，新闻内容，
    新闻类型三个属性，提供必要的访问器和修改器方法，重写toString方法，
    要求打印对象时输出格式为“标题；类型；作者”，要求只要新闻标题相同就判断为同一条新闻。
    在测试类中创建一个只能容纳该类对象的ArrayList集合，
    添加三条新闻。遍历集合，打印新闻标题，将新闻标题截取字符串到10个汉字的长度。
 */
        private T Type;//新闻类型
        private String title;//新闻标题
        private String author;//新闻作者
        private String content;//新闻内容

        public News1() {
        }

        public News1(String title, String author, String content) {
            this.title = title;
            this.author = author;
            this.content = content;
        }
        /*提供必要的访问器和修改器方法*/

        public T getType() {
            return Type;
        }

        public void setType(T type) {
            Type = type;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        @Override
        public String toString() {
            return "News{" +
                    "title='" + title + '\'' +
                    ", author='" + author + '\'' +
                    ", content='" + content + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {return true;}
            if (o == null || getClass() != o.getClass()){ return false;}
            News1<?> news = (News1<?>) o;
            return Objects.equals(title, news.title);
        }
}
class CityNews {
}
class FocusNews {
}