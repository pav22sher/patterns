package behavioral_patterns.observer.example1;

import behavioral_patterns.observer.example1.blog.Blog;
import behavioral_patterns.observer.example1.blog.Subscriber;

public class Main {
    public static void main(String[] args) {
        Subscriber sub1 = new Subscriber();
        Subscriber sub2 = new Subscriber();

        Blog programmingBlog = new Blog();
        programmingBlog.addObserver(sub1);
        programmingBlog.addObserver(sub2);
        programmingBlog.setArticle("Java tutorial");
        programmingBlog.notifyObservers(programmingBlog.getArticle());

        Blog flowerBlog = new Blog();
        flowerBlog.addObserver(sub2);
        flowerBlog.setArticle("New Flowers!!!");
        flowerBlog.notifyObservers(flowerBlog.getArticle());
    }
}
