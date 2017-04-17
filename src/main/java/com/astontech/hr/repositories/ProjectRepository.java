package com.astontech.hr.repositories;

import com.astontech.hr.domain.Project;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Jerry.Kelsay on 4/4/2017.
 */
public interface ProjectRepository extends CrudRepository<Project, Integer> {
}
