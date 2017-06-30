package com.aungmyohtet.pm.service;

import com.aungmyohtet.pm.dto.ProjectDto;
import com.aungmyohtet.pm.entity.Project;

public interface ProjectService {

    void save(Project project);

    void addToOrganizationByUser(Project project, int organizationId, String userEmail);

    ProjectDto converToDto(Project project);
}
