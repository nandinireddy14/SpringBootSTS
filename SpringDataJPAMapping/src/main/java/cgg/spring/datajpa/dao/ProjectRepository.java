package cgg.spring.datajpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cgg.spring.datajpa.entities.Project;

public interface ProjectRepository extends JpaRepository<Project,Integer>{

}
