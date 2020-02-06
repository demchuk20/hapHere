package com.project.hapHere.entity;

import java.io.Serializable;
import java.util.Objects;

public class PostStatisticPK implements Serializable {
    private Post post;

    private User user;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostStatisticPK that = (PostStatisticPK) o;
        return Objects.equals(post, that.post) &&
                Objects.equals(user, that.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(post, user);
    }
}
