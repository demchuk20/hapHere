package com.project.hapHere.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@Entity
public class User {
    @Id
    @GeneratedValue
    @Column(name = "id_user")
    private Integer idUser;

    @Basic
    @Column(name = "name", nullable = false)
    private String name;

    @Basic
    @Column(name = "nickname", unique = true, nullable = false)
    private String nickname;

    @Basic
    @Column(name = "occupation")
    private String occupation;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(idUser, user.idUser) &&
                Objects.equals(name, user.name) &&
                Objects.equals(nickname, user.nickname) &&
                Objects.equals(occupation, user.occupation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUser, name, nickname, occupation);
    }
}
