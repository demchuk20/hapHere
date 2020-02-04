package com.project.hapHere.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "user_info")
public class UserInfo implements Serializable {
    @Id
    @OneToOne
    @PrimaryKeyJoinColumn(name = "user_id", referencedColumnName = "id_user")
    private User user;

    @Basic
    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @Basic
    @Column(name = "info")
    private String info;

    @Basic
    @Column(name = "phone")
    private String phone;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserInfo userInfo = (UserInfo) o;
        return Objects.equals(user, userInfo.user) &&
                Objects.equals(email, userInfo.email) &&
                Objects.equals(info, userInfo.info) &&
                Objects.equals(phone, userInfo.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, email, info, phone);
    }
}
