package pl.akademiakodu.springExample;

import java.util.ArrayList;
import java.util.List;

public class Post {
    private String title;
    private String contain;
    private String user;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContain() {
        return contain;
    }

    public void setContain(String contain) {
        this.contain = contain;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Post(String title, String contain, String user) {
        this.title = title;
        this.contain = contain;
        this.user = user;
    }

    public Post(String title, String contain) {
        this.contain = contain;
        this.title = title;

    }

    public Post(String title) {
        this.title = title;
    }
    public Post(){}

    @Override
    public String toString() {
        return getTitle()+" "+getContain();
    }

    public static void main(String[] args) {
        List<Post> postList =new ArrayList<>();
        Post post = new Post("Programowanie w Javie to przygoda", "Programowanie jest super");
        Post secondPost = new Post("Programowanie w Ruby","W Ruby występują wszystkie zmienne");

    }
}
