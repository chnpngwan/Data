package Demo2;

/**
 * ClassName:Titli
 * PackageName:Demo2
 * Description:
 *
 * @date:2022/5/29 11:58
 * @author: wangchunping
 */
public class News {
    private String title;
    private String content;

    public News(String title){
        this.title = title;
    }
    @Override
    public String toString() {
        return "News{" +
                "title='" + title +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
