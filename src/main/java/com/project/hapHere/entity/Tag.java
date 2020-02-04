package com.project.hapHere.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@Entity
public class Tag {
    @Id
    @GeneratedValue
    @Column(name = "id_tag")
    private Integer idTag;

    @Basic
    @Column(name = "tag_name", nullable = false)
    private String tagName;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tag tag = (Tag) o;
        return Objects.equals(idTag, tag.idTag) &&
                Objects.equals(tagName, tag.tagName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTag, tagName);
    }
}
