package com.github.troublediehard.androidemulatorintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.troublediehard.androidemulatorintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
