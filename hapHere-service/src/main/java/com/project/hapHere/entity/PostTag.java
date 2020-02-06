package com.project.hapHere.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "post_tag")
public class PostTag implements Serializable {
    @Id
    @ManyToOne
    @JoinColumn(name = "post_id", insertable = false, updatable = false, nullable = false)
    private Post post;

    @Id
    @ManyToOne
    @JoinColumn(name = "tag_id", insertable = false, updatable = false, nullable = false)
    private Tag tag;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostTag that = (PostTag) o;
        return Objects.equals(post, that.post) &&
                Objects.equals(tag, that.tag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(post, tag);
    }
}
