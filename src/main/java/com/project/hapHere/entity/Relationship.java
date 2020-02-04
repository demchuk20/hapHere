package com.project.hapHere.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

@Getter
@Setter
@Entity
public class Relationship implements Serializable {
    @Id
    @ManyToOne
    @JoinColumn(name = "user_id", updatable = false, insertable = false)
    private User user;

    @Id
    @ManyToOne
    @JoinColumn(name = "following_id", updatable = false, insertable = false)
    private User following;

    @Basic
    @Column(name = "date")
    private Timestamp date;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Relationship that = (Relationship) o;
        return Objects.equals(user, that.user) &&
                Objects.equals(following, that.following) &&
                Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, following, date);
    }
}
