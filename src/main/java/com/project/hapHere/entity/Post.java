package com.project.hapHere.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Getter
@Setter
@Entity
public class Post {
    @Id
    @GeneratedValue
    @Column(name = "id_post")
    private Integer idPost;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User userId;

    @Basic
    @Column(name = "title")
    private String title;

    @Basic
    @Column(name = "content")
    private String content;

    @Basic
    @Column(name = "published_time", nullable = false)
    private Timestamp publishedTime;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return Objects.equals(idPost, post.idPost) &&
                Objects.equals(userId, post.userId) &&
                Objects.equals(title, post.title) &&
                Objects.equals(content, post.content) &&
                Objects.equals(publishedTime, post.publishedTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPost, userId, title, content, publishedTime);
    }
}
