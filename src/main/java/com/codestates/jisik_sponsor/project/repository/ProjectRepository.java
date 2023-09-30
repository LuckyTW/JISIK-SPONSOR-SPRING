package com.codestates.jisik_sponsor.project.repository;

import com.codestates.jisik_sponsor.project.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
