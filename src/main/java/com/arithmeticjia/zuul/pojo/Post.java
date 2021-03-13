package com.arithmeticjia.zuul.pojo;

import java.util.Date;
import java.util.List;

/**
 * @author ArithmeticJia
 * @version 1.0
 * @date 2021/3/10 2:10 上午
 */
public class Post {

    private int id;
    private String title;
    private String body;
    private String authorname;
    private String views;
    private String greats;
    private List<Tag> tags;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthorname() {
        return authorname;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public String getViews() {
        return views;
    }

    public void setViews(String views) {
        this.views = views;
    }

    public String getGreats() {
        return greats;
    }

    public void setGreats(String greats) {
        this.greats = greats;
    }
}

