package com.project.hapHere.entity;

import java.io.Serializable;
import java.util.Objects;

public class PostTagPK implements Serializable {
    private Post post;

    private Tag tag;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostTagPK that = (PostTagPK) o;
        return Objects.equals(post, that.post) &&
                Objects.equals(tag, that.tag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(post, tag);
    }
}
