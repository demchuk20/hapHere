package com.project.hapHere.repository;

import com.project.hapHere.entity.PostStatistic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostStatisticRepository extends JpaRepository<PostStatistic, Integer> {
}
