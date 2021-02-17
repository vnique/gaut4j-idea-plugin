package com.github.vnique.gaut4jideaplugin.services

import com.github.vnique.gaut4jideaplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
