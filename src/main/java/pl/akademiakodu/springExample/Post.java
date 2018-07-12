package pl.akademiakodu.springExample;


import java.util.ArrayList;
import java.util.List;

public class Post {
    private String title;
    private String description;
    private String author;
    private static List<Post> posts = new ArrayList<>();
    public  static  List<Post> findAll(){
        return posts;
    }
    public Post(){}

    public Post(String title, String description, String author) {
        this.title = title;
        this.description = description;
        this.author = author;
        posts.add(this);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override //Dobra praktyka
    public String toString() {
        return getAuthor()+" "+getTitle()+" "+getDescription();
    }
    public static void main(String[] args) {

    }
}
