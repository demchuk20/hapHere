package com.project.hapHere.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "post_statistic")
public class PostStatistic implements Serializable {
    @Id
    @ManyToOne
    @JoinColumn(name = "post_id", insertable = false, updatable = false, nullable = false)
    private Post post;

    @Id
    @ManyToOne
    @JoinColumn(name = "user_id", insertable = false, updatable = false, nullable = false)
    private User user;

    @Basic
    @Column(name = "liked")
    private Boolean liked;

    @Basic
    @Column(name = "viewed", nullable = false)
    private Boolean viewed;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostStatistic that = (PostStatistic) o;
        return Objects.equals(post, that.post) &&
                Objects.equals(user, that.user) &&
                Objects.equals(liked, that.liked) &&
                Objects.equals(viewed, that.viewed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(post, user, liked, viewed);
    }
}
