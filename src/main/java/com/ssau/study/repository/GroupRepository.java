package com.ssau.study.repository;

import com.ssau.study.entity.Group;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface GroupRepository extends JpaRepository<Group, Long> {

    Optional<Group> findByNameContainingIgnoreCase(String name);

    Optional<Group> findByName(String name);

    List<Group> findAll();
}