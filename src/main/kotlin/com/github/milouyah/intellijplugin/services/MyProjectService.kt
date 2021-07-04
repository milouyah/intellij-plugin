package com.github.milouyah.intellijplugin.services

import com.github.milouyah.intellijplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
