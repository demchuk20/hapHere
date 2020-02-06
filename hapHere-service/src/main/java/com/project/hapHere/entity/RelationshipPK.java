package com.project.hapHere.entity;

import java.io.Serializable;
import java.util.Objects;

public class RelationshipPK implements Serializable {
    private User user;

    private User following;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RelationshipPK that = (RelationshipPK) o;
        return Objects.equals(user, that.user) &&
                Objects.equals(following, that.following);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, following);
    }
}
