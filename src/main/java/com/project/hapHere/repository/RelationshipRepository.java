package com.project.hapHere.repository;

import com.project.hapHere.entity.Relationship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RelationshipRepository extends JpaRepository<Relationship, Integer> {
}
