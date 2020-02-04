package com.project.hapHere.repository;

import com.project.hapHere.entity.PostTag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostTagRepository extends JpaRepository<PostTag, Integer> {
}
