package com.astontech.hr.services;

import com.astontech.hr.domain.Project;

/**
 * Created by Jerry.Kelsay on 4/4/2017.
 */
public interface ProjectService {

    Iterable<Project> listAllProjects();

    Project getProjectByid(Integer id);

    Project saveProject(Project project);

    Iterable<Project> saveProjectList(Iterable<Project> iterableProject);

    void projectDelete(Integer id);
}
