package com.project.hapHere.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Getter
@Setter
@Entity
public class Comment {
    @Id
    @Column(name = "id_comment")
    private Integer idComment;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Basic
    @Column(name = "comment")
    private String comment;

    @Basic
    @Column(name = "date")
    private Timestamp date;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comment comment1 = (Comment) o;
        return Objects.equals(idComment, comment1.idComment) &&
                Objects.equals(post, comment1.post) &&
                Objects.equals(user, comment1.user) &&
                Objects.equals(comment, comment1.comment) &&
                Objects.equals(date, comment1.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idComment, post, user, comment, date);
    }
}
