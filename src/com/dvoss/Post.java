package com.dvoss;

/**
 * Created by Dan on 5/26/16.
 */
public class Post {
    int replyId;
    String author;
    String text;

    public Post(int replyId, String author, String text) {
        this.replyId = replyId;
        this.author = author;
        this.text = text;
    }
}
