package behavioral_patterns.observer.example1.blog;

import java.util.Observable;

public class Blog extends Observable {
    private String article;

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
        setChanged();
    }
}
