package com.astontech.hr.services.Impl;

import com.astontech.hr.domain.Project;
import com.astontech.hr.repositories.ProjectRepository;
import com.astontech.hr.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Jerry.Kelsay on 4/4/2017.
 */
@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public Iterable<Project> listAllProjects() {
        return projectRepository.findAll();
    }

    @Override
    public Project getProjectByid(Integer id) {
        return projectRepository.findOne(id);
    }

    @Override
    public Project saveProject(Project project) {
        return projectRepository.save(project);
    }

    @Override
    public Iterable<Project> saveProjectList(Iterable<Project> iterableProject) {
        return projectRepository.save(iterableProject);
    }

    @Override
    public void projectDelete(Integer id) {
        projectRepository.delete(id);
    }
}
