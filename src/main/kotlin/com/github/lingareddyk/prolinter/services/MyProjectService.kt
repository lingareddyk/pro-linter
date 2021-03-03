package com.github.lingareddyk.prolinter.services

import com.github.lingareddyk.prolinter.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
